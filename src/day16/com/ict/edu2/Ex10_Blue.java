package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex10_Blue extends JPanel {
	// 생성자에 전부 넣어버리기 (JPanel 불러오면 override 하라고 해서)
	public Ex10_Blue() {
		setBackground(Color.gray);
		
		// 버튼 만들기
		JButton jb1 = new JButton(" + ");
		JButton jb2 = new JButton(" - ");
		JButton jb3 = new JButton(" * ");
		JButton jb4 = new JButton(" / ");
		jb1.setBackground(Color.gray);
		jb2.setBackground(Color.gray);
		jb3.setBackground(Color.gray);
		jb4.setBackground(Color.gray);
		
		// 현재 메서드 자체가 패널임. 그럼 그냥 add 쓰면 됨.
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		
		// Ex09에서 super 쓴 이유는 title에 내용을 적기 위해서였음. 여기서는 따로 기재 안해도 OK 
		// (패널에서는 아무것도 안써도 되기 때문에)
	}
}
