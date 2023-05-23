package day19.com.ict.edu;

public class Ex02_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		
		Ex02_Dog dog = new Ex02_Dog();
		Ex02_Cat cat = new Ex02_Cat();
		
		// 멀티스레드 : 여러개의 스레드를 만들어서 병렬 처리
		// 스레드 만드는 방법 : start()를 호출해서 run()로 가면 ☆ 스레드 생성 (일꾼 생성)
		dog.start();
		cat.start();
		// ★ 먼저 start를 찾음. start가 없으면 run을 찾는 식으로 작동하게 되어 있음. (스레드의 기본)
		// start에서 run 가는 순간
		// 동시에 작업할 때, 일의 순서는 OS의 scheduler가 정함! 해당 부분을 유추해내긴 어려움.
		// 우리가 순서를 임의로 할당할 수는 없음.
		System.out.println("main : " + Thread.currentThread().getName());
	}
}