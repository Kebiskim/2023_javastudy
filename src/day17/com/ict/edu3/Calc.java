package day17.com.ict.edu3;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc extends JFrame {
	public Calc() {
		super("계산기");
		
		// 행 기준으로 칸을 만들줌
		JPanel jp = new JPanel();
		
		
		JTextField jtf1 = new JTextField(15);
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
	
		
		jp.add(jtf1);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jb7);
		jp.add(jb8);
		jp.add(jb9);
		jp.add(jb10);
		jp.add(jb11);
		jp.add(jb12);
		jp.add(jb13);
		jp.add(jb14);
		jp.add(jb15);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-100, ds.height/2-150, 200, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
public static void main(String[] args) {
	new Calc();
	}
}
