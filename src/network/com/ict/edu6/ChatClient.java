package network.com.ict.edu6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient extends JFrame implements Runnable {
	JPanel jp;
	JTextArea jta;
	JTextField jtf;
	JButton jb;
	
	Socket s = null;
	BufferedReader in = null;
	PrintWriter out = null;
	
	public ChatClient() {
		super("카카오톡");
		jp = new JPanel();
		jta = new JTextArea(20, 1);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jta.setFont(new Font("굴림", Font.PLAIN, 20));
		jta.setBackground(Color.LIGHT_GRAY);
		jta.setForeground(Color.WHITE);
	
		jtf = new JTextField(35);
		jb = new JButton("보내기");
		
		String img_source = "D:\\KSW\\kakao.png";
		
		jp.add(jtf);
		jp.add(jb);
		add(jsp, BorderLayout.CENTER);
		add(jp, BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		connected();
	}
	
	public static void main(String[] args) {
		new ChatClient();
		
	}
}