package network.com.ict.edu8;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ChatClient extends JFrame implements Runnable {
	static CardLayout cardLayout;
	static JPanel pg;
	JLabel img;
	JButton login_bt, memo_bt, join_bt, mkRoom_bk, exit_bt, send_bt, out_bt;
	JList user_list, room_list, join_list;
	static JTextField msg_tf;
	String blank_tf;
	JTextArea jta;

	// 접속
	static Socket s = null;
	static ObjectOutputStream out = null;
	static ObjectInputStream in = null;

	public ChatClient() {
		super("멀티 채팅");
		cardLayout = new CardLayout();
		pg = new JPanel();
		pg.setBorder(new EmptyBorder(10, 10, 10, 10)); // 테두리 여유공간
		pg.setLayout(cardLayout);
		Login_Page login_p = new Login_Page();
		Wait_Page wait_p = new Wait_Page();
		VO chat_p = new VO();
		
		pg.add(login_p, "login");
		pg.add(wait_p, "wait");
		pg.add(chat_p, "chat");
		// 첫 카드를 지정
		cardLayout.show(pg, "login");

		add(pg);
		setSize(450, 550);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

		// 이벤트 처리
		// 창 닫기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (s != null) { // 접속된 상태일때
					Protocol p = new Protocol();
					p.setCmd(0);
					try {
						out.writeObject(p);
					} catch (Exception e2) {

					}

				} else {
					closed();
				}
			}
		});
	} // 생성자 끝

	public static boolean connected() {
		boolean value = true;
		try {
			s = new Socket("192.168.0.69", 7779);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread().start();
			return value;
		} catch (Exception e) {
		}
		return false;
	}

	private void closed() {
		try {
			out.close();
			in.close();
			s.close();
			System.exit(0);
		} catch (Exception e) {
		}
	}

	public static void sendMessage() {
		try {
			String msg = msg_tf.getText().trim();
			if(msg.length() > 0) {
				Protocol p = new Protocol();
				p.setCmd(1);
				p.setMsg(msg);
				out.writeObject(p);
				out.flush();
				msg_tf.setText("");
				msg_tf.requestFocus();
			}
		} catch (Exception e) {

		}
	}
//	hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhb  
	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {
					case 0: // 0:종료
						break esc;
					case 1: // 1:메세지
						jta.append(p.getMsg()+"\n");
						// CaretPosition => 글이 추가된 만큼 화면을 위로 올리는 것(길이를 재서 올리는 것)
//						jta.setCaretPosition(jta.getText().length());
						break;
					case 2: // 2:접속 및 갱신
						// 대기자 명단
						user_list.setListData(p.getNames());
						// 방 목록
						room_list.setListData(p.getRooms());
						break;
					case 4: // 4:방참여
						join_list.setListData(p.getNames());
						jta.append(p.getMsg()+"\n");
						break;
					case 6: // 6:쪽지보내기
						JOptionPane.showMessageDialog(getParent(), p.getMsg());
						break;
					}
				}
			} catch (Exception e) {
			}
		} // 무한 루프 끝
		closed();
		System.exit(0);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ChatClient();
			}
		});
	}
}
