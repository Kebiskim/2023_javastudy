package day19.com.ict.edu;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex04_Dog dog = new Ex04_Dog();
		Ex04_Cat cat = new Ex04_Cat();
		// start 하기 위해서 아래처럼 함
		Thread t_dog = new Thread(dog);
		Thread t_cat = new Thread(cat);
		// 데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드.
		// 				일반 스레드가 종료되면 데몬 스레드는 강제로 종료됨. (스타트 전에 넣어야 함)
		t_dog.setDaemon(true);
		t_cat.setDaemon(true);
		// ★ 스레드가 하나라도 살아있으면 전체가 계속해서 반복됨!!
		t_dog.start();
		t_cat.start();
		
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i);
		}
		System.out.println("종료");
		// 종료하고도 스레드 내용이 계속됨 => 데몬스레드 해줘야 함.
	}
}
