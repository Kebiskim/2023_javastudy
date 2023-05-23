package day17.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

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

public class Coffee extends JFrame {
	// 계산기 만들기!!
	// 옆으로 가는 건 패널.
	public Coffee() {
		super("카페 주문");
		
		JPanel np = new JPanel(); 
		np.setLayout(null);

		JLabel jl1 = new JLabel("원하는 음료 선택하세요");
		jl1.setBounds(225, 0, 150, 30);
		
		JRadioButton jrb1 = new JRadioButton(" 아메리카노(3000) ");
		jrb1.setBounds(10, 30, 150, 30);
		JRadioButton jrb2 = new JRadioButton(" 카페모카(4000) ");
		jrb2.setBounds(160, 30, 150, 30);
		JRadioButton jrb3 = new JRadioButton(" 카페라떼(3500) ");
		jrb3.setBounds(310, 30, 150, 30);
		JRadioButton jrb4 = new JRadioButton(" 과일쥬스(3000) ");
		jrb4.setBounds(460, 30, 150, 30);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		JLabel jl2 = new JLabel("수량 : ");
		jl2.setBounds(60, 60, 150, 30);
		JTextField jtf1 = new JTextField(5);
		jtf1.setBounds(100, 60, 120, 25);
		JLabel jl3 = new JLabel("입금액 : ");
		jl3.setBounds(300, 60, 150, 30);
		JTextField jtf2 = new JTextField(5);
		jtf2.setBounds(350, 60, 120, 25);
		
		// np에 전부 붙이기
		np.add(jl1);
		np.add(jrb1);
		np.add(jrb2);
		np.add(jrb3);
		np.add(jrb4);
		np.add(jl2);
		np.add(jtf1);
		np.add(jl3);
		np.add(jtf2);
		
		JPanel sp = new JPanel();
		sp.setLayout(null);
		JButton jb1 = new JButton("계  산");
		jb1.setBounds(100, 500, 100, 25);
		JButton jb2 = new JButton("종  료");
		jb2.setBounds(200, 500, 100, 25);
		JButton jb3 = new JButton("취  소");
		jb3.setBounds(300, 500, 100, 25);
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);	// 자동 줄바꾸기
		// Horizontal 먼저 넣으면 오류????
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jsp.setBounds(0, 0, 0, 0);

		
		// 편집 불가능하게 만들자
		jta.setEditable(false);
		
		
		
		
		
//		JButton jb1 = new JButton("버튼1");
//		JButton jb2 = new JButton("버튼2");
//		JButton jb3 = new JButton("버튼3");
//		JButton jb4 = new JButton("버튼4");
//		JButton jb5 = new JButton("버튼5");
//		JButton jb6 = new JButton("버튼6");
//		JButton jb7 = new JButton("버튼7");
//		JButton jb8 = new JButton("버튼8");
//		
//		// 아무것도 하지 않으면 자동으로 BorderLayout이다.
//		// 아무것도 하지 않으면 마지막 컴포넌트가 화면을 차지한다.
//		
//		// 방향표시
//		add(jb1, BorderLayout.CENTER);
//		add(jb2, BorderLayout.NORTH);
//		add(jb3, BorderLayout.SOUTH);
//		add("West", jb4);
//		add("East", jb5);
		
		
		add(np);
//		add("North", np);
//		add(np,BorderLayout.NORTH);
//		add(jsp,BorderLayout.CENTER);
////		add("South", jb1);
////		add("South", jb2);
////		add("South", jb3);
//		add(sp,BorderLayout.SOUTH);
//		
//		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Coffee();
	}
}
