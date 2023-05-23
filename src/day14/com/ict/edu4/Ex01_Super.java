package day14.com.ict.edu4;

public class Ex01_Super {
	String name = "홍길동";
	int age = 54;
	String addr = "서울 방학동";
	String car = "제네시스";
	
	// ★ 생성자 만들 때, 아래처럼 기본생성자 만들어 놓기. 그래야 오류가 안 생김.
	public Ex01_Super() {
		
	}
	
	// 기본생성자가 아닌 뭔가 있는 생성자를 만듦으로써, sub에서 오류가 남.
	// 안 나게 하려면 아래 생성자를 sub에서 써줘야 함
	public Ex01_Super(String addr) {
		// 생성자가 없으면 기본 생성자, 있으면 그 생성자 사용하는 클래스의 기본 개념.
		this.addr = addr;
	}
}
