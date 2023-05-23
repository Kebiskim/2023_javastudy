package day15.com.ict.edu5;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 컴포넌트 : 특정기능 또는 관련된 기능을 제공하는 하나의 객체
//			화면을 구성하는 객체. 예) 레이블, 콤보박스, 리스트, 라디오버튼, 체크박스, 컨테이너

// 컨테이너 : 자기영역에 컴포넌트를 포함시키고, 관리하는 역할을 하며, 다른 컨테이너를 포함시킬 수도 있는 객체
//			패널, 다이얼로그, 프레임, 스크롤페인,

// 프레임 : 하나의 창

// 일반적인 창의 구조 : 창 (프레임=컨테이너) | 패널(컨테이너) | 컴포넌트
public class Ex03_Swing extends JFrame {
	public Ex03_Swing() {
		super("버튼 컴포넌트");
		
		// JPanel : 컨테이너의 한 종류, 컴포넌트를 묶어서 관리하는 클래스
		//			컴포넌트를 추가할 때 add() 사용
		//			나중에 JPanel은 JFrame에 추가해야 된다.
		JPanel jp = new JPanel();
		
		// 화면을 구성하는 컴포넌트 (버튼)
		JButton jb1 = new JButton("첫번째");
		JButton jb2 = new JButton();
		jb2.setText("두번째");
		// ★ 값을 집어넣는 방법은 두가지. 1. 생성자 or 2. setter
		
		jp.add(jb1);
		jp.add(jb2);
		
		// JFrame 상속받고 있으니까, 그냥 add 바로 사용하면 됨.
//		add(jp);
//		setSize(300, 300);
//		setLocation(500, 500);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		// x축, y축 기준 가운데를 설정해도, 실제로 창의 위치는 가운데가 아님.
		// 그래서 전체 크기의 가로, 세로 각각 반씩 위 왼쪽으로 (- 방향으로) 이동해주면 됨.
		// 해당 부분이 -150 한 부분임!!
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		
		setVisible(true);
		// 실제 프로그램 종료 (x 버튼 눌렀을 때 console창에서도 실제로 종료하는 법)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 창 크기 조절 불가 => false 해야 함
		setResizable(false);
		
	}
	public static void main(String[] args) {
		new Ex03_Swing();
	}
}