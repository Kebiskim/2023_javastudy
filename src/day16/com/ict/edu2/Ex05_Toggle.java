package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Ex05_Toggle extends JFrame {
	public Ex05_Toggle() {
		super("토글버튼");
		
		JPanel jp = new JPanel();
		
		JRadioButton jrb1 = new JRadioButton("과일쥬스");
		JRadioButton jrb2 = new JRadioButton("커피");
		JRadioButton jrb3 = new JRadioButton("매실차");
		JRadioButton jrb4 = new JRadioButton("홍차");
		jrb4.setText("아이스크림");
		jrb4.setSelected(true);
		
//		jp.add(jrb1);
//		jp.add(jrb2);
//		jp.add(jrb3);
//		jp.add(jrb4);
				
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		JToggleButton jtb1 = new JToggleButton("야구");
		JToggleButton jtb2 = new JToggleButton("축구");
		JToggleButton jtb3 = new JToggleButton("농구", true);
		JToggleButton jtb4 = new JToggleButton("배구");
		
		jp.add(jtb1);
		jp.add(jtb2);
		jp.add(jtb3);
		jp.add(jtb4);
		
		// 마지막에 한번만 하면 됨.
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-300, 500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex05_Toggle();
	}
}
