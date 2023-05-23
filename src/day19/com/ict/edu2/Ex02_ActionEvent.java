package day19.com.ict.edu2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_ActionEvent extends JFrame {
	JPanel jp;
	JButton jb1, jb2, jb3;
	public Ex02_ActionEvent() {
		super("ActionEvent");
		
		jp = new JPanel();
		jb1 = new JButton("입력1");
		jb2 = new JButton("입력2");
		jb3 = new JButton("입력3");
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		
		add(jp);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// 익명 innertype (if로 구분없이 따로 만들면 됨)
		// 좋을 수도 있지만 안좋을 수도 있음. (계속 입력해야 해서)
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력1 눌렀네");
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력2 눌렀네");
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Ex02_ActionEvent();
	}
}
