package day21.com.ict.edu;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

// ① 로그인창의 첫 페이지
public class Ex02_LogIn extends JPanel {
	// 메인에서 만든 cardLayout을 넘겨받아야 함. (새로 생성하면 안됨)
	CardLayout cardLayout;
	JPanel pg1;
	// main에 있는 cardLayout, pg1를 이용하기 위해서 정보를 받아야 한다.
	// 새로 만들면 정보교류를 할 수 없다.
	
	JButton jb1, jb2;
	public Ex02_LogIn(CardLayout cardLayout, JPanel pg1) {
		// 생성자에서 받은 인자는 ★ 무조건 전역변수로 만들자.
		// setter가 아래랑 같은 형식임 (참고용)
		this.cardLayout = cardLayout;
		this.pg1 = pg1;
		
		jb1 = new JButton("회원가입");
		jb2 = new JButton("로그인");
		
		add(jb1);
		add(jb2);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "join");
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "loginok");
			}
		});
	}
}
