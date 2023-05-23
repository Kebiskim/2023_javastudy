package day20.com.ict.edu;

// 동기화 처리할때 현재 실행중인 스레드를 강제로 대기 상태로 변경시키는 
// 메서드 : wait()
// 한번 wait()된 스레드를 풀어주지 않으면 그대로 대기상태로 끝남.
// wait()된 스레드를 풀어주는 예약어가 notify(), notifyAll()
public class Ex03 implements Runnable {
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + " : " + Thread.currentThread().getName());
			// dog은 x=11일 때 wait 걸려서 멈춘 상태로 작동 안함. (dog 빼고 나머지만 끝까지 찍힘)
			if(x==11) {
				// try ~ catch 안하면 오류남
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			// 2번째 동물 들어갈 때는 dog이 다시 못돌아옴. 12 이후로부터는, 다른 동물이 들어가서 돌아가는데,
			// 11이 아니니까 else 만난 후에 notify로 깨워줌. 그럼 그 다음부터는 dog이 다시 찍힐 수 있음.
			}else {
				notify();
			}
		}
	}
}
