package day20.com.ict.edu;

public class Ex02 implements Runnable {
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + " : " + Thread.currentThread().getName());
		}
	}
	// x 값을 올리는 주체들이 (스레드들) 계속 바뀜으로 인해, 순서가 일정치 않고 왔다갔다함.
	// 이런 경우, 티켓팅과 마찬가지로 온라인으로 실시간 작업해야 하는 것 등 => 다른 사람에게 뺏길 수 있음.
	// 이를 해결하기 위한 것이, 동기화처리.
}
