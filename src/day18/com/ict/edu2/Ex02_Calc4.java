package day18.com.ict.edu2;

import java.awt.*;
import javax.swing.*;

public class Ex02_Calc4 extends JFrame {

	public Ex02_Calc4() {
		super("계산기");
		
		// add(new Button("1"));  => 이런 식으로 넣으면, 이벤트 못함!!!

		JPanel jp1 = new JPanel();
		JTextField jtf = new JTextField(20);
		jp1.add(jtf);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(5, 3, 7, 7));
		JButton jb1 = new JButton(" 1 ");
		JButton jb2 = new JButton(" 2 ");
		JButton jb3 = new JButton(" 3 ");
		JButton jb4 = new JButton(" 4 ");
		JButton jb5 = new JButton(" 5 ");
		JButton jb6 = new JButton(" 6 ");
		JButton jb7 = new JButton(" 7 ");
		JButton jb8 = new JButton(" 8 ");
		JButton jb9 = new JButton(" 9 ");
		JButton jb10 = new JButton(" 0 ");
		JButton jb11 = new JButton(" + ");
		JButton jb12 = new JButton(" - ");
		JButton jb13 = new JButton(" * ");
		JButton jb14 = new JButton(" / ");
		JButton jb15 = new JButton(" = ");
		
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		jp2.add(jb7);
		jp2.add(jb8);
		jp2.add(jb9);
		jp2.add(jb10);
		jp2.add(jb11);
		jp2.add(jb12);
		jp2.add(jb13);
		jp2.add(jb14);
		jp2.add(jb15);
		
		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);
		// 부모크기에(컴포넌트 크기에) 맞춰서 알아서 조절해줌.
		pack();
		
//		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
//		setBounds(ds.width/2-125, ds.height/2-175, 250, 350);
		// 화면 중간으로 세팅해줌
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex02_Calc4();
	}
}
