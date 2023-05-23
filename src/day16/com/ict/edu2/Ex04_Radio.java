package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex04_Radio extends JFrame {
	public Ex04_Radio() {
		super("라디오버튼");
		
		JPanel jp = new JPanel();
		
		JRadioButton jrb1 = new JRadioButton();
		jrb1.setText("야구");
		jrb1.setSelected(true);
		
		JRadioButton jrb2 = new JRadioButton("축구", true);
		JRadioButton jrb3 = new JRadioButton("농구");
		JRadioButton jrb4 = new JRadioButton("배구");
		
		// 라디오 버튼은 체크박스와 다르게 여러개 중 하나만 선택되어야 한다.
		// 그러기 위해서는 반드시 라디오버튼을 ButtonGroup에 넣어라.
		
		// bg는 선택하기 위한 묶음 -> 패널과 별도로 따로 아래와 같이 추가해줘야 함.
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		// 패널은 보이기 위한 것
		jp.add(jrb1);
		jp.add(jrb2);
		jp.add(jrb3);
		jp.add(jrb4);
		
		add(jp);
		// 체크박스는 여러개 체크가 가능, but 라디오버튼은 여러개 중 하나만 체크되어야 함.
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-300, 500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex04_Radio();
	}
}
// main 만들고, 올라가서 생성자 만들고, extends JFrame 만들기 순. 
// 그다음 Dimension 만들고, setBounds, setVisible, setDefaultCloseOperation 설정.
// 그 이후 JPanel 추가 => 그 이후 상세한 항목들 JRadioButton 추가. 