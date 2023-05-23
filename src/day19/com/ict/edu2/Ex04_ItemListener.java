package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

// implements 
// JCheckBox, JRadioButton, JToggleButton => ItemListener 사용함.
public class Ex04_ItemListener extends JFrame implements ItemListener, ActionListener {
	
	JPanel jp1, jp2;
	JCheckBox jcb1, jcb2, jcb3, jcb4;
	JButton jb1, jb2;
	JTextArea jta;
	JScrollPane jsp;
	
	public Ex04_ItemListener() {
		super("체크박스 이벤트 처리");
		
		// 1번 패널
		jp1 = new JPanel();
		jcb1 = new JCheckBox("축구");
		jcb2 = new JCheckBox("야구");
		jcb3 = new JCheckBox("농구");
		jcb4 = new JCheckBox("배구");
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		jp1.add(jcb4);
		
		jta = new JTextArea(10, 0);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		// 자동 줄바꿈
		jta.setLineWrap(true);
		// 편집 불가능하게 (걍 주석처리하면 true처리 됨)
		jta.setEditable(false);		

		jp2 = new JPanel();
		jb1 = new JButton("exit");
		jb2 = new JButton("clear");
		
		jp2.add(jb1);
		jp2.add(jb2);
		
		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 체크박스에 ItemListener를 달자
		jcb1.addItemListener(null);
		jcb2.addItemListener(null);
		jcb3.addItemListener(null);
		jcb4.addItemListener(null);	
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	
	// ItemListener 해결하는 추상메서드 (체크박스)
	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox obj = (JCheckBox)e.getSource();
		if (e.getStateChange() == e.SELECTED) {
			jta.append(obj.getText()+" 선택\n");
		}else if(e.getStateChange() == e.DESELECTED) {
			jta.append(obj.getText()+" 해제\n");
		}
	}	
	// ActionListener 해결해주는 추상메서드 (버튼)
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton)e.getSource();
		if (obj == jb1) {
			System.exit(0);
		}else if (obj == jb2) {
			// clear (초기화하자)
			// 체크박스에 선택된 것을 모두 지우자.
			jcb1.setSelected(false);
			jcb2.setSelected(false);
			jcb3.setSelected(false);
			jcb4.setSelected(false);
			jta.setText("");
		}
	}
	// 메인은 항상 가장 아래에!
	public static void main(String[] args) {
		new Ex04_ItemListener();
	}
}
