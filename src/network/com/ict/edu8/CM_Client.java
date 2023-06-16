package network.com.ict.edu8;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import org.apache.ibatis.javassist.bytecode.stackmap.BasicBlock.Catch;

public class CM_Client extends JFrame implements Runnable {
	JPanel jp1, jp2, jp3;
	JTextArea jta;
	JScrollPane jsp;
	JTextField jtf;
	JButton exit_bt, send_bt;
	JButton c_red, c_green, c_blue, c_cyan, c_magenta, c_yellow;
	String[] items = {"10", "20", "30", "40", "50"};
	JComboBox<String> jcom;
	
	// 그림판 : 내부클래스로 만들자
	MyCanvas myCanvas = new MyCanvas();
	int x = -10, y = -10, wh = 10;
	Color color = Color.BLACK;
	
	// 접속
	Socket s;
	ObjectOutputStream out;
	ObjectInputStream in;
	String msg;
	
	public CM_Client() {
		super("그림판 ver 0.2");
		jp1 = new JPanel();
		
		c_red = new JButton(" ");
		c_red.setBackground(Color.RED);
		c_green = new JButton(" ");
		c_green.setBackground(Color.GREEN);
		c_blue = new JButton(" ");
		c_blue.setBackground(Color.BLUE);
		c_cyan = new JButton(" ");
		c_cyan.setBackground(Color.CYAN);
		c_magenta = new JButton(" ");
		c_magenta.setBackground(Color.MAGENTA);
		c_yellow = new JButton(" ");
		c_yellow.setBackground(Color.YELLOW);
		
		jcom = new JComboBox<>(items);
		exit_bt = new JButton("나가기");
		
		jp1.add(c_red);
		jp1.add(c_green);
		jp1.add(c_blue);
		jp1.add(c_cyan);
		jp1.add(c_magenta);
		jp1.add(c_yellow);
		jp1.add(jcom);
		jp1.add(exit_bt);
		
		jp2 = new JPanel();
		jta = new JTextArea();
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jta.setFont(new Font("돋움", Font.BOLD, 15));
		jta.setBackground(Color.LIGHT_GRAY);
		jta.setForeground(Color.WHITE);
		
		jp2.setLayout(new GridLayout(0, 2));
		jp2.add(myCanvas);
		jp2.add(jsp);
		
		jp3 = new JPanel();
		jtf = new JTextField(50);
		send_bt = new JButton("보내기");
		jp3.add(jtf);
		jp3.add(send_bt);
		
		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);
		add(jp3, BorderLayout.SOUTH);
		// pack();
		setSize(800, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		connected();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if(s!=null) {
					try {
						VO vo = new VO();
						vo.setCmd(0);
						out.writeObject(vo);
						out.flush();
					} catch (Exception e2) {
					}
				}else {
					closed();
				}
			}
		});
		
		exit_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(s!=null) {
					try {
						VO vo = new VO();
						vo.setCmd(0);
						out.writeObject(vo);
						out.flush();
					} catch (Exception e2) {
					}
				}else {
					closed();
				}
			}
		});
		
		c_red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.RED;
			}
		});
		
		c_green.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.GREEN;
			}
		});
		c_blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.BLUE;
			}
		});
		c_cyan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.CYAN;
			}
		});
		c_magenta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.MAGENTA;
			}
		});
		c_yellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.YELLOW;
			}
		});
		
		jcom.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED) {
					switch ((String)e.getItem()) {
					case "10": wh = 10; break;
					case "20": wh = 20; break;
					case "30": wh = 30; break;
					case "40": wh = 40; break;
					case "50": wh = 50; break;
					}
				}
			}
		});
		
		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});
		
		send_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg();
			}
		});
		
		myCanvas.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				sendServer();
			}
		});
	}
	
	// 접속
	public void connected() {
		try {
			s = new Socket("192.168.0.69", 7780);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();
		} catch (Exception e) {
			
		}
	}
	
	// 끝내기
	public void closed() {
		try {
			out.close();
			in.close();
			s.close();
			System.exit(0);
		} catch (Exception e) {
		}
	}
	
	// 정보(메시지) 보내기
	public void sendMsg() {
		try {
			String msg = jtf.getText().trim();
			if(msg.length()>0) {
				VO vo = new VO();
				vo.setCmd(1);
				out.writeObject(vo);
				out.flush();
			}
			jtf.setText("");
			jtf.requestFocus();
		} catch (Exception e) {

		}
	}
	
	// 그리기 좌표 전달
	public void sendServer() {
		try {
			VO vo = new VO();
			vo.setCmd(2);
			vo.setX(x);
			vo.setY(y);
			vo.setWh(wh);
			vo.setColor(color);
			vo.setMsg(msg);
			out.writeObject(vo);
			out.flush();
		} catch (Exception e) {

		}
	}
	
	// 서버로 뭔가 들어오면 서버가 작업을 해서, 클라이언트로 다시 보내줌.
	// 대기하고 있다가 들어오는 게 있으면 언제든 처리하게끔 run 해줘야 함.
	@Override
	public void run() {
		esc: while(true) {
			try {
				Object obj = in.readObject();
				if(obj != null) {
					VO vo = (VO)obj;
					switch (vo.getCmd()) {
					case 0:
						break esc;
					case 1:
						String msg = vo.getMsg();
						jta.append(msg+"\n");
						jta.setCaretPosition(jta.getText().length());
						break;
					case 2:
						x = vo.getX();
						y = vo.getY();
						wh = vo.getWh();
						color = vo.getColor();
						myCanvas.repaint();
						break;
					}
				}
			} catch (Exception e) {
				
			}
		} // 무한반복
		closed();
	}
	
	public class MyCanvas extends Canvas{
		@Override
		public void paint(Graphics g) {
			g.setColor(color);
			g.fillOval(x, y, wh, wh);
		}
		
		@Override
		public void update(Graphics g) {
			paint(g);
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CM_Client();
			}
		});
	}

}
