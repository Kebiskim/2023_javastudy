package day20.com.ict.edu;

// join() : 현재 스레드는 join()을 호출한 스레드가 끝날때까지
// 			대기상태로 빠져있다가 join()을 호출한 스레드가 끝나면
// 			다시 실행한다.
// 			즉 join()을 호출한 스레드가 끝나야 실행할 수 있다.

public class Ex01_Join {
	public static void main(String[] args) {
	 	System.out.println("main : " + Thread.currentThread().getName());
	 	
	 	Ex01 test = new Ex01();
	 	// "dog", "cat"은 스레드이름 지정.
	 	Thread dog = new Thread(test, "dog");
	 	Thread cat = new Thread(test, "cat");
	 	// dog.setDaemon(true);
	 	dog.start();
	 	cat.start();
	 	// dog에만 join 있음 => dog 끝날때까지 main 안 찍힘.
	 	
	 	try {
	 		// join이 있는 스레드가 끝날 때까지 main스레드 못 끝냄.
			dog.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	
	 	System.out.println("main : " + Thread.currentThread().getName());
	}
}
