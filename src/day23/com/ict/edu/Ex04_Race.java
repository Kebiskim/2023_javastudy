package day23.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex04_Race extends JFrame {
	JPanel jp;
	JButton jb;
	Image image1, image2, image3, image4;
	int x1=0, x2=0, x3=0, x4=0;
	CanvasTest canvas = new CanvasTest();

	public Ex04_Race() {
		super("경주하기");
		
		jp = new JPanel();
		jb = new JButton("start");
		jp.add(jb);
		
		add(jp, BorderLayout.NORTH);
		add(jb, BorderLayout.CENTER);
		add(canvas, BorderLayout.SOUTH);

		
		setSize(800, 800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(x1 < canvas.getWidth()-140) {
							x1 += (int)(Math.random() * 10);
							try {
								Thread.sleep(40);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							canvas.repaint();
						}
						System.out.println(Thread.currentThread().getName()+"\t");
					}
				}, "dog").start();
				
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(x2 < canvas.getWidth()-140) {
							x2 += (int)(Math.random() * 10);
							try {
								Thread.sleep(40);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							canvas.repaint();
						}
						System.out.println(Thread.currentThread().getName()+"\t");
					}
				}, "cat").start();
				
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(x3 < canvas.getWidth()-140) {
							x3 += (int)(Math.random() * 10);
							try {
								Thread.sleep(20);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							canvas.repaint();
						}
						System.out.println(Thread.currentThread().getName()+"\t");
					}
				}, "tiger").start();
				
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(x4 < canvas.getWidth()-140) {
							x4 += (int)(Math.random() * 10);
							try {
								Thread.sleep(40);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							canvas.repaint();
						}
						System.out.println(Thread.currentThread().getName()+"\t");
					}
				}, "elephant").start();
			}
		});
	}
	
	private class CanvasTest extends Canvas{
		@Override
		public void paint(Graphics g) {
			image1 = Toolkit.getDefaultToolkit().getImage("src/image/java1.png");
			image1 = Toolkit.getDefaultToolkit().getImage("src/image/java2.png");
			image1 = Toolkit.getDefaultToolkit().getImage("src/image/java3.png");
			image1 = Toolkit.getDefaultToolkit().getImage("src/image/java4.gif");
			g.drawImage(image1, x1, 50, 150, 150, this);
			g.drawImage(image1, x2, 50, 150, 150, this);
			g.drawImage(image1, x3, 50, 150, 150, this);
			g.drawImage(image1, x4, 50, 150, 150, this);
		}
	}
	
	public static void main(String[] args) {
		new Ex04_Race();
	}
}