package day15.com.ict.edu5;

import javax.swing.JFrame;

public class Ex02_Swing extends JFrame {
	
	public Ex02_Swing() {
		// super 생성자가 없으면 실행이 안됨.
		// 부모기 때문에 extends 해서 갖다쓰는 것.
		super("Swing으로 만든 창2");
		setSize(300, 300);
		setLocation(500, 500);
		setVisible(true);
		// x 눌렀을 때 꺼진걸로 나오지만 콘솔 눌러보면 실제로 꺼진 건 아님(프로그램이 종료된 건 아님. 화면에서만 사라진 것)
	}
	
	public static void main(String[] args) {
//		Ex02_Swing test = new Ex02_Swing();
		// 선언 안하면 이후에 접근 못함. 아래처럼 쓰면 위 생정자에서 모든 걸 다 끝내야 함.
		// Swing을 만들 때 보통 이런 식으로 만듬.
		new Ex02_Swing();
	}
}
