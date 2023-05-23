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

public class Signup extends JFrame {
	// 계산기 만들기!!
	// 옆으로 가는 건 패널.
	public Signup() {
		super("회원가입");
		
		JPanel np = new JPanel();
		JLabel jl1 = new JLabel("원하는 음료 선택하세요");
		np.add(jl1);
		
		JPanel np2 = new JPanel();
		JRadioButton jrb1 = new JRadioButton(" 아메리카노(3000) ");
		JRadioButton jrb2 = new JRadioButton(" 카페모카(4000) ");
		JRadioButton jrb3 = new JRadioButton(" 카페라떼(3500) ");
		JRadioButton jrb4 = new JRadioButton(" 과일쥬스(3000) ");
		
		ButtonGroup bg = new ButtonGroup();
		np2.add(jrb1);
		np2.add(jrb2);
		np2.add(jrb3);
		np2.add(jrb4);

		JPanel np3 = new JPanel();
		JLabel jl5 = new JLabel("수량 : ");
		JTextField jtf5 = new JTextField(10);
		JLabel jl6 = new JLabel("입금액 : ");
		JTextField jtf6 = new JTextField(10);
		np3.add(jl5);
		np3.add(jtf5);
		np3.add(jl6);
		np3.add(jtf6);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(np, BorderLayout.NORTH);
		mainPanel.add(np2, BorderLayout.CENTER);
		mainPanel.add(np3, BorderLayout.SOUTH);
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);	// 자동 줄바꾸기
		// Horizontal 먼저 넣으면 오류????
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		// 편집 불가능하게 만들자
		jta.setEditable(false);
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		add(mainPanel,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-250, 600, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Signup();
	}
}
