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

public class Grade extends JFrame {
	// 계산기 만들기!!
	// 옆으로 가는 건 패널.
	public Grade() {
		super("성적계산");
		
		
		JPanel name = new JPanel();
		name.setLayout(null);
		JTextField name_jtf = new JTextField(5);
		name_jtf.setBounds(150, 10, 100, 30);

		name.add(new JLabel("이름 : "));
		name_jtf.setBounds(150, 10, 100, 30);
		name.add(name_jtf);

		
		JPanel np = new JPanel(); 
//		JLabel jl1 = new JLabel("수1 : ");
		JTextField jtf1 = new JTextField(5);
//		JLabel jl2 = new JLabel("수2 : ");
		JTextField jtf2 = new JTextField(5);
//		JLabel jl3 = new JLabel("연산자 : ");
		JTextField jtf3 = new JTextField(5);
		JTextField jtf4 = new JTextField(5);
		
		// 라디오버튼은 반드시 버튼그룹이 있음 (ButtonGroup 안하면 체크박스처럼 되기 때문에 조심!!)		
//		JRadioButton jrb1 = new JRadioButton(" + ");
//		JRadioButton jrb2 = new JRadioButton(" - ");
//		JRadioButton jrb3 = new JRadioButton(" * ");
//		JRadioButton jrb4 = new JRadioButton(" / ");
//		
//		ButtonGroup bg = new ButtonGroup();
//		bg.add(jrb1);
//		bg.add(jrb2);
//		bg.add(jrb3);
//		bg.add(jrb4);q

	
		np.add(new JLabel("국어 : "));
		np.add(jtf2);
		np.add(new JLabel("영어 : "));
		np.add(jtf3);
		np.add(new JLabel("수학 : "));
		np.add(jtf4);

//		
//		
//		
//		// 콤보박스 => 여러가지 선택지 중에서 고르는 것.
//		// <> 안에는 String이 들어감
//		String[] items = {"선택하세요", "+", "-", "*", "/"};
//		JComboBox<String> jcom = new JComboBox<>(items);
//		
//		// 특정항목을 먼저 나오게 하는 방법
////		jcom.setSelectedIndex(3);
//		
//		np.add(jcom);
//		
//	
		
		
		
//		JPanel jsp = new JPanel(); 
//		JTextArea jta = new JTextArea();
//		jsp.add(jta);
		
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
		
		add(name);
		add(np,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Grade();
	}
}
