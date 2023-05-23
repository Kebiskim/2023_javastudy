package day18.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

// ★★★ module_info 삭제해야 함!!!
public class Ex01_Calc3 extends JFrame {
	
	public Ex01_Calc3() {
		super("계산기");
		
		JPanel jp1 = new JPanel();
		JTextField jtf2 = new JTextField(5);
		JTextField jtf1 = new JTextField(5);
		String[] items = {"선택하세요", " + ", " - ", " * ", " / "};
		JComboBox<String> jcb = new JComboBox<>(items);
		
		jp1.add(new JLabel("수 1 : "));
		jp1.add(jtf1);
		jp1.add(new JLabel("수 2 : "));
		jp1.add(jtf2);
		jp1.add(new JLabel("연산자 : "));
		jp1.add(jcb);
		
		JTextArea jta = new JTextArea();
		// 줄바꾸기 
		jta.setLineWrap(true);
		// 나온 결과 편집 못하게
		jta.setEditable(false);
		// 항상 VERTICAL이 먼저!!
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel jp2 = new JPanel();
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		
		// 패널들을 Frame에 붙여줘야 함.
		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex01_Calc3();
	}
}
