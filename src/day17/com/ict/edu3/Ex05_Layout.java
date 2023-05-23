package day17.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex05_Layout extends JFrame {
	public Ex05_Layout() {
		super("JFrame을 FlowLayout으로 바꾸자");
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		
//		setLayout(new FlowLayout());
		
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);

		
		// 아무것도 하지 않으면 자동으로 BorderLayout이다.
		// 아무것도 하지 않으면 마지막 컴포넌트가 화면을 차지한다.
		
		// 방향표시
		add(jb1);
		add(jb2);
		add(jb3);
		add("West", jb4);
		add("East", jb5);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex05_Layout();
	}
}
