package day15.com.ict.edu5;

import javax.swing.JFrame;

public class Ex01_Swing {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("Swing으로 만든 창");
		// 버전이 바뀌면서 오류가 남 => 왼쪽에 module-info.java 삭제하면 오류 사라짐!!
		
	//	
//		JFrame jframe = new JFrame();
//		jframe.setTitle("Swing으로 만든 창");
	//	
		// 위는 생성자로 만든 것, 아래는 ????
		
		// 창 크기
		jframe.setSize(600, 600);
		// 창 위치
		jframe.setLocation(100, 100);
		
		// 표시 여부(기본이 false)
		jframe.setVisible(true);
	}
}