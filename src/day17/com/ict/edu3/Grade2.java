package day17.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Grade2 extends JFrame {
	// 계산기 만들기!!
	// 옆으로 가는 건 패널.
	public Grade2() {
		super("성적계산");
		
		
JPanel np = new JPanel();
		
		
		JLabel jl1 = new JLabel("이름 : ");
		JTextField jtf1 = new JTextField(10);
		
		JPanel np1 = new JPanel();
		
		JLabel jl2 = new JLabel("국어 : ");
		JTextField jtf2 = new JTextField(10);
		JLabel jl3 = new JLabel("영어 : ");
		JTextField jtf3 = new JTextField(10);
		JLabel jl4 = new JLabel("수학 : ");
		JTextField jtf4 = new JTextField(10);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(np, BorderLayout.NORTH);
		mainPanel.add(np1, BorderLayout.CENTER);
	
		
		np.add(jl1);
		np.add(jtf1);
		np1.add(jl2);
		np1.add(jtf2);
		np1.add(jl3);
		np1.add(jtf3);
		np1.add(jl4);
		np1.add(jtf4);
		
		// 2번쨰 텍스트 에어리얼
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);  // 자동 줄바꾸기
		
		// 편집 불가능으로 만들기
		jta.setEditable(false);
		
		// 3번쨰
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		
		
		add(mainPanel,BorderLayout.NORTH);  
		add(jta,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2 - 250, ds.height/2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Grade2();
	}
}
