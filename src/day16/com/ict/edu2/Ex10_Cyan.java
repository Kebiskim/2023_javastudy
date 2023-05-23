package day16.com.ict.edu2;

import java.awt.Button;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex10_Cyan extends JPanel {
	// 1. 생성자 만들기
	public Ex10_Cyan() {
		setBackground(Color.orange);
		
		// 버튼 만들기
		JRadioButton jb1 = new JRadioButton(" + ");
		JRadioButton jb2 = new JRadioButton(" - ");
		JRadioButton jb3 = new JRadioButton(" * ");
		JRadioButton jb4 = new JRadioButton(" / ");
		jb1.setBackground(Color.orange);
		jb2.setBackground(Color.orange);
		jb3.setBackground(Color.orange);
		jb4.setBackground(Color.orange);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jb1);
		bg.add(jb2);
		bg.add(jb3);
		bg.add(jb4);
		
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);		
	}
}
