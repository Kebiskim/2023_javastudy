package day17.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

public class Signup_2 extends JFrame {
	// 계산기 만들기!!
	// 옆으로 가는 건 패널.
	public Signup_2() {
		super("회원가입");
		
		JPanel np = new JPanel();
		JLabel np_jl1 = new JLabel("이름: ");
		JTextField np_jtf1 = new JTextField(10);
		JLabel np_jl2 = new JLabel("성별: ");
		JRadioButton np_jrb1 = new JRadioButton("남 ");
		JRadioButton np_jrb2 = new JRadioButton("여");
		ButtonGroup np_bg = new ButtonGroup();
		np.add(np_jl1);
		np.add(np_jtf1);
		np.add(np_jl2);
		np.add(np_jrb1);
		np.add(np_jrb2);
		
		JPanel np2 = new JPanel();
		JLabel np2_jl1 = new JLabel("생년월일: ");
		JTextField np2_jtf1 = new JTextField(10);
		np2.add(np2_jl1);
		np2.add(np2_jtf1);

		JPanel np3 = new JPanel();
		JLabel jl5 = new JLabel("주소 : ");
		JTextField jtf5 = new JTextField(15);
		np3.add(jl5);
		np3.add(jtf5);

		JPanel upperPanel = new JPanel(new BorderLayout());
		upperPanel.add(np, BorderLayout.NORTH);
		upperPanel.add(np2, BorderLayout.CENTER);
		upperPanel.add(np3, BorderLayout.SOUTH);
		
		JPanel mp = new JPanel();
		JLabel mp_jl1 = new JLabel("부서명: ");
		String[] items = {"부서", "회계부", "총무부", "인사부", "영업부"};
		JComboBox<String> mp_jcom = new JComboBox<>(items);
		mp.add(mp_jl1);
		mp.add(mp_jcom);
		
		JPanel mp_2 = new JPanel();
		JLabel mp2_jl1 = new JLabel("취 미: ");
		mp_2.add(mp2_jl1);
		
		JPanel middlePanel = new JPanel(new BorderLayout());
		middlePanel.add(mp, BorderLayout.NORTH);

		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);	// 자동 줄바꾸기
		// Horizontal 먼저 넣으면 오류????
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		// 편집 불가능하게 만들자
		jta.setEditable(false);
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("저  장");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		add(upperPanel,BorderLayout.NORTH);
		add(middlePanel,BorderLayout.CENTER);
		add(jsp,BorderLayout.SOUTH);

		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-250, 600, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Signup_2();
	}
}
