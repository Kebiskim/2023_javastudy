package network.com.ict.edu8;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Wait_Page extends JPanel implements Runnable  {
	JPanel wait_page;
	JList user_list, room_list;
	JButton memo_bt, join_bt, mkRoom_bt, exit_bt;
	
	Socket s = null;
	ObjectOutputStream out = null;
	ObjectInputStream in = null;

	
	public Wait_Page() {
		wait_page = new JPanel();
		wait_page.setLayout(new BorderLayout());
		
		// 동쪽 패널
		JPanel east_p = new JPanel();
		east_p.setLayout(new BorderLayout());
		wait_page.add(east_p, BorderLayout.EAST);
		
		// 크기 지정
		east_p.setPreferredSize(new Dimension(120, 300));
		east_p.add(new JLabel(" [대기실] "), BorderLayout.NORTH);
		user_list = new JList();
		
		// 동남쪽 패널 (버튼)
		JPanel east_south = new JPanel();
		east_south.setLayout(new GridLayout(4, 1, 0, 0));
		
		memo_bt = new JButton("쪽지보내기");
		join_bt = new JButton("방 참여");
		mkRoom_bt = new JButton("방 만들기");
		exit_bt = new JButton("나가기");
		
		east_south.add(memo_bt);
		east_south.add(join_bt);
		east_south.add(mkRoom_bt);
		east_south.add(exit_bt);
		east_p.add(east_south, BorderLayout.SOUTH);
		
		JPanel center_p = new JPanel();
		center_p.setLayout(new BorderLayout());
		
		center_p.add(new JLabel(" [ 방 제목 ] "), BorderLayout.NORTH);
		
		room_list = new JList();
		room_list.setFont(new Font("굴림", Font.BOLD, 20));
		
		JScrollPane jsp = new JScrollPane();
		jsp.setViewportView(user_list);
		east_p.add(jsp, BorderLayout.CENTER);
		
		JScrollPane jsp2 = new JScrollPane();
		jsp2.setViewportView(room_list);
		center_p.add(jsp2, BorderLayout.CENTER);
		
		wait_page.add(center_p, BorderLayout.CENTER);
		
		
		memo_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String msg = JOptionPane.showInputDialog("내용을 입력하세요");

					if (msg.length() <= 0 || msg == null) {
						JOptionPane.showMessageDialog(getParent(), "제발 쫌! 내용을 입력하세요.");
					} else {
						Protocol p = new Protocol();
						p.setCmd(6);
						p.setMsg(msg);
						// 대기실 리스트에서 특정 사람 선택
						p.setC_index(user_list.getSelectedIndex());

						out.writeObject(p);
						
					}
				} catch (Exception e2) {
				}
			}
		});
	
		mkRoom_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 사용자에게 방 제목을 받자
				String name = JOptionPane.showInputDialog(getParent(),"방 제목을 입력하세요");
				if(name.length() <=0 || name == null) {
					JOptionPane.showMessageDialog(getParent(), "방 제목을 입력하세요.");
				}else {
					try {
						Protocol p  = new Protocol();
						p.setCmd(3);
						p.setMsg(name);
						out.writeObject(p);
						out.flush();
						ChatClient.cardLayout.show(ChatClient.pg,"chat");
					} catch (Exception e2) {
					}
				}
				
			}
		});
		
		join_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int r_index = room_list.getSelectedIndex();
				if(r_index >= 0) {
					try {
						Protocol p = new Protocol();
						p.setCmd(4);
						p.setR_index(r_index);
						out.writeObject(p);
						out.flush();
						ChatClient.cardLayout.show(ChatClient.pg, "chat");
					} catch (Exception e2) {

					}
				}
			}
		});
		
		exit_bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Protocol p = new Protocol();
					p.setCmd(0);
					out.writeObject(p);
				} catch (Exception e2) {
				}
			}
		});
	}
	
		
	@Override
	public void run() {
		
	}

}
