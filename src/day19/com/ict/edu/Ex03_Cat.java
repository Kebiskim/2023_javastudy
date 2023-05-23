package day19.com.ict.edu;

public class Ex03_Cat implements Runnable{
	// Runnable은 인터페이스고, run메서드 하나만 가지고 있음.
	// start() 안 가지고 있음.
	int i = 0;
	@Override
	public void run() {
		for(; ;) {
			System.out.println("야옹11" + Thread.currentThread().getName());
			i++;
			System.out.println(i);
		}
		
	}
}
