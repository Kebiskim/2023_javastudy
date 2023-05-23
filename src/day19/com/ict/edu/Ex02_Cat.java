package day19.com.ict.edu;

import java.util.Iterator;

public class Ex02_Cat extends Thread{
	// start를 넣었을 경우, 스레드처리가 안된 것이므로 각자 20번씩 실행하고, 뒤에 main 실행함.
	public void start() {
		for (int i = 0; i < 20; i++) {
			System.out.println("야옹22 " + Thread.currentThread().getName());
		}
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println("야옹~야옹~~~" + Thread.currentThread().getName());

		}
	}
	// for문에서 무한루프 돌리는 법 (★ for(; ; )
}
