package day19.com.ict.edu;

public class Ex03_Main {
	// Runnable은 start()가 없음. run()만 가지고 있음.
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		Ex03_Dog dog = new Ex03_Dog();
		Ex03_Cat cat = new Ex03_Cat();
		
		// cat.start 하면 안 나옴!! (Runnable은 start 메서드를 가지고 있지 않음)
//		cat.st
		// 그래서 Thread(Runnable target)이 있음! 얘가 start를 가지고 있음.
		
		Thread thread = new Thread(dog);
		thread.start(); // start가 실행되면서, dog이 가지고 있는 run으로 감.
		
		Thread thread2 = new Thread(cat);
		thread2.start();
		
		// 익명
//		new Thread(cat).start(); // 위랑 같은 뜻인데, 이렇게 쓰면 일회용이므로, 다시 호출을 못함.
		// Inner클래스에서 4. Anonymous => 정의된 이름이 없는 클래스, 다시 호출할 수 없다는 내용 있음.
		
		// 익명 : new 클래스(인터페이스 i);
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("AAAAA" + Thread.currentThread().getName());
				}
			}
		}).start(); // 이렇게 하면 알아서 start에서 run으로 감.
		
		System.out.println("main : " + Thread.currentThread().getName());
		
		// main이 끝났는데, 스레드에서 일이 안 끝나서 계속 돌아가는 경우가 있음.
		// main이 끝날 때는 같이 끝내줘야 하는 것이 있음. (반대로, 카톡은 back에서 계속 돌아가야 함)
		// Swing으로 얘기하면, Listener가 항상 작동하고 있어야 함!
		
		// ☆ 데몬스레드 : main이 꺼지면 같이 꺼지는 것!!
	}
}