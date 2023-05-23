package day19.com.ict.edu;

// 데몬스레드
public class Ex04_Cat implements Runnable {
	@Override
	public void run() {
		while(true) {
			// 3초간 대기 상태
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("야옹ㅁㅁㅁ");
		}
	}
}
