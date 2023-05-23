package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ex10_Green extends JPanel {
	public Ex10_Green() {
		setBackground(Color.black);
		
		// 버튼 만들기
		JCheckBox jb1 = new JCheckBox(" + ");
		JCheckBox jb2 = new JCheckBox(" - ");
		JCheckBox jb3 = new JCheckBox(" * ");
		JCheckBox jb4 = new JCheckBox(" / ");
		jb1.setBackground(Color.black);
		jb2.setBackground(Color.black);
		jb3.setBackground(Color.black);
		jb4.setBackground(Color.black);
	
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
	}
}
