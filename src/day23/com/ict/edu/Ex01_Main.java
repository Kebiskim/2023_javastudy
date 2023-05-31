package day23.com.ict.edu;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Ex01_Main extends JFrame {
	Ex01_Canvas canvas = new Ex01_Canvas();
	public Ex01_Main() {
		super("키 이벤트로 이미지 움직이기");
		
		add(canvas);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
//		// key event
//		addKeyListener(new KeyListener() {
//			@Override
//			public void keyTyped(KeyEvent e) {}
//			@Override
//			public void keyReleased(KeyEvent e) {}
//			@Override
//			public void keyPressed(KeyEvent e) {}
//		});
		// 이런게 두개 이상이면 항상 Adapter가 만들어져 있다!!
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				// 눌려진 key값을 구하자
				int key = e.getKeyCode();
				// 패널을 마우스로 클릭하면 전체 먹통이 됨.
				switch (key) {
					case KeyEvent.VK_LEFT: {
						if(canvas.x <= 0) {
							canvas.x = 0;
						}else {
							canvas.x = canvas.x - 30;
							break;
						}
					}
					case KeyEvent.VK_RIGHT: {
						if(canvas.x >= canvas.getWidth()-100) {
							canvas.x = canvas.getWidth()-100;
						}else {
							canvas.x = canvas.x + 30;
							break;
						}
					}
				}	
				canvas.repaint();
			}
		});
	}
	public static void main(String[] args) {
		new Ex01_Main();
	}
}
