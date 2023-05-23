package day20.com.ict.edu;

// 임계영역 : 멀티스레드에서 공통으로 사용되는 영역 (1번 예시에서 dog과 cat이 참조하는 public void run() 부분)
// 			현재 실행중인 스레드가 다른 스레드에게 제어권을 빼앗긴다.
// 			이러한 경우 실시간 처리에서는 문제가 발생할 수 있다. (티켓팅)
// 			이를 해결하기 위한 방법이 동기화 처리.

// 동기화 처리 : 임계영역에 synchronized 예약어를 사용함으로써
// 				현재 실행중인 스레드가 끝날때까지 다른 스레드 접근 불가 (실행하는동안 방패막 생성하여 막음)

public class Ex02_Synchronized {
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		new Thread(test, "dog").start();
		new Thread(test, "cat").start();
		new Thread(test, "tiger").start();
		new Thread(test, "lion").start();
		// 실제로 위 네가지는 병렬처리이므로 순서가 정해진 것이 아님(누가 먼저 들어갈지 모름)
		// 하지만 맨 위 스레드가 아래로 내려오는 경우는 드문 편.
	}
}
