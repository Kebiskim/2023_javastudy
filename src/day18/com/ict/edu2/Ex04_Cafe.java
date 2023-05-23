package day18.com.ict.edu2;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex04_Cafe extends JFrame {
	public Ex04_Cafe() {
		super("카페 주문");
		
		JPanel jp1 = new JPanel();
		jp1.add(new JLabel("원하는 음료 선택하세요"));
		
		JPanel jp2 = new JPanel();
		JRadioButton jrb1 = new JRadioButton("아메리카노(3000)");
		JRadioButton jrb2 = new JRadioButton("카페모카(4000)");
		JRadioButton jrb3 = new JRadioButton("카페라떼(3500)");
		JRadioButton jrb4 = new JRadioButton("과일쥬스(3000)");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);
		
		JPanel jp3 = new JPanel();
		JTextField su = new JTextField(10);
		JTextField input = new JTextField(10);
		jp3.add(new JLabel("수  량 : "));
		jp3.add(su);
		jp3.add(new JLabel("입 금 액 : "));
		jp3.add(input);
		
		
		JTextArea jta = new JTextArea(30, 0);
		// 줄바꾸기 
		jta.setLineWrap(true);
		// 나온 결과 편집 못하게
		jta.setEditable(false);
		// 항상 VERTICAL이 먼저!!
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel jp4 = new JPanel();
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		jp4.add(jb1);
		jp4.add(jb2);
		jp4.add(jb3);
		
		JPanel pg1 = new JPanel();
		JPanel pg2 = new JPanel();
		pg1.setLayout(new BorderLayout());
		pg2.setLayout(new BorderLayout());
		
		pg1.add(jp1, BorderLayout.NORTH);
		pg1.add(jp2, BorderLayout.CENTER);
		
		pg2.add(jp3, BorderLayout.NORTH);
		pg2.add(jsp, BorderLayout.CENTER);
		pg2.add(jp4, BorderLayout.SOUTH);
		
		add(pg1, BorderLayout.NORTH);
		add(pg2, BorderLayout.CENTER);
				
		
		
		// 컴포넌트 크기에 맞춰서
		pack(); // pack 쓰면 길쭉하게 나옴. (jsp 때문에. 각 컴포넌트의 각자 크기. textArea는 높이를 안 잡아 줌)
		// 화면 중간
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex04_Cafe();
	}
}
