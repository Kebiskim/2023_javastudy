package day19.com.ict.edu;

public class Ex02_Dog extends Thread{
	// 부모 메서드를 그대로 가져와서 내용만 바꿔쓰는 것 => Override
	// Thread는 추상클래스라는 뜻!!
	public void start() {
		for (int i = 0; i < 20; i++) {
			System.out.println("멍~멍22~~~" + Thread.currentThread().getName());
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println("멍~멍~~~" + Thread.currentThread().getName());
		}
	}
}
