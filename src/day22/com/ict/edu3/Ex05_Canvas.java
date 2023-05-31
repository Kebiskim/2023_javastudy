package day22.com.ict.edu3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ex05_Canvas extends Canvas {
	int x = -50;
	int y = -50;
	int wh = 30;
	@Override
	public void paint(Graphics g) {
		int r1 = (int)(Math.random() * 256);
		int g1 = (int)(Math.random() * 256);
		int b1 = (int)(Math.random() * 256);
		g.setColor(new Color(r1, g1, b1));
		g.fillOval(x-wh/2, y-wh/2, wh, wh);
	}
	// 기존 내용 그대로 남겨두고 추가하자.
	// 확대하면 기존 찍어둔 값들 사라짐.
	@Override
	public void update(Graphics g) {
		paint(g);
	}
}