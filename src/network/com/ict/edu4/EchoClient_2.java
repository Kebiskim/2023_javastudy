package network.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class EchoClient_2 extends JFrame implements Runnable {
	JPanel jp;
	JTextArea jta;
	JScrollPane jsp;
	JTextField jtf;
	JButton jb;
	
	Socket s = null;
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	public EchoClient_2() {
		super("에코 클라이언트");
		jp = new JPanel();
		jta = new JTextArea(20, 1);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jta.setFont(new Font("굴림", Font.PLAIN, 20));
		jta.setBackground(Color.LIGHT_GRAY);
		jta.setForeground(Color.WHITE);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jtf = new JTextField(35);
		jb = new JButton("보내기");
		
		jp.add(jtf);
		jp.add(jb);
		add(jsp, BorderLayout.CENTER);
		add(jp, BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connect();
				sendMsg();
			}
		});
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				connect();
				sendMsg();
			}
		});
	}
	
	// 연결
	public void connect() {
		try {
			s = new Socket("192.168.25.2", 7778);
			osw = new OutputStreamWriter(s.getOutputStream());
			bw = new BufferedWriter(osw);
			
			isr = new InputStreamReader(s.getInputStream());
			br = new BufferedReader(isr);
			
			new Thread(this).start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void sendMsg() {
		try {
			String msg = jtf.getText().trim();
			if(msg.length()>0) {
				msg += System.lineSeparator();
				bw.write(msg);
				bw.flush();
				jtf.setText("");
				jtf.requestFocus();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 받기
	@Override
	public void run() {
		while(true) {
			try {
				String msg = br.readLine();
				if(msg.length()>0) {
					jta.append(msg+"\n");
					// 클라이언트에서 작동방법 선언
					if(msg.equals("exit")) break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		closed();
	}
	
	public void closed() {
		try {
			// 서버 연결 종료. (서버 안꺼도 되는 것 아닌지)
			s.close();
			System.out.println("프로그램 종료");
			System.exit(0);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		new EchoClient_2();
	}
}
