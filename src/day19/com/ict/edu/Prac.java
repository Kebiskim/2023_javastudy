package day19.com.ict.edu;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Prac extends JFrame {
	
	public Prac() {
		super("연습");
		
		
		JPanel jp1 = new JPanel();
		JTextField jtf1 = new JTextField(20);
		
		JPasswordField jpf1 = new JPasswordField("비번입력", 10);
		
		JTextArea jta = new JTextArea(5, 20);
		
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		jta.setLineWrap(true);
		jp1.add(jtf1);
		jp1.add(jpf1);
		jp1.add(jta);
		jp1.add(jsp);
		add(jp1);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-200, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Prac();
	}
}