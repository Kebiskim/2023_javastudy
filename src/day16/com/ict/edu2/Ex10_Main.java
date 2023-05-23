package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Ex10_Main extends JFrame {
	// 각각 만든 메서드 (클래스), 패널 를 탭에 붙이고, 프레임에 붙임?? 
	// 창 하나는 프레임 이라고 부름.
	public Ex10_Main() {
		super("JTab_2");
		
		// JPanel을 상속한 클래스 객체로 만들기
		Ex10_Blue blue = new Ex10_Blue();
		Ex10_Cyan cyan = new Ex10_Cyan();
		Ex10_Green green = new Ex10_Green();
		
		// JPanel들을 JTab에 넣는다.
		JTabbedPane jtab = new JTabbedPane();
		jtab.addTab("블루 탭2", blue);
		jtab.addTab("시안 탭2", cyan);
		jtab.addTab("그린 탭2", green);
		
		// JFrame 프레임 (★최종이 프레임)에 JTab을 넣자.
		add(jtab);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {
		new Ex10_Main();
	}
}