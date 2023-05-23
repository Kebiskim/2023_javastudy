package day16.com.ict.edu;

public class Ex06_Main {
	public static void main(String[] args) {
		// 내부클래스를 별도로 객체 생성할 수 있다. (static은 제외)
//		Dog test = new Dog();
		
		// Member 내부클래스 만드는 방식으로도 사용 불가
		Ex06_Local test = new Ex06_Local();
//		Ex06_Local.Dog exam = test.new Dog();
		
		// 메서드안에 있으므로 메서드를 실행해야 
		// 내부클래스를 생성할 수 있다.
		test.play(); // 해당 부분 빠지면, 내부 클래스 끝와 외부 클래스 끝 사이에 실행되어야 할 코드 실행 x
		
	}
}
