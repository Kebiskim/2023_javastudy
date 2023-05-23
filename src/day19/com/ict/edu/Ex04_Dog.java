package day19.com.ict.edu;

// 데몬스레드
public class Ex04_Dog implements Runnable {
	@Override
	public void run() {
		while(true) {
			// 3초간 대기 상태
			// sleep은 try ~ catch 무조건 해야 함. ★ 안하면 오류남!!
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("멍~~멍~~");
		}
	}
}
