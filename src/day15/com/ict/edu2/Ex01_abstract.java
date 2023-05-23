package day15.com.ict.edu2;

// 추상 클래스
// 밑에 추상메서드 들어가면, class 옆에도 abstract 붙여줘야 함!!
public abstract class Ex01_abstract {
	// 추상 클래스와 추상 메서드
	// 추상 메서드 : 메서드에서 body(몸통=블록={}=실제 실행할 내용을 기록하는 부분)를 가지고 있지 않은 메서드
	//				구체적인 실행 내용이 없음
	//				반드시 abstract를 써줘야 함
	// 추상 클래스 : 일반클래스가 가지는 멤버필드, 멤버메서드, 생성자를 가질 수 있다.
	//				하나 이상의 추상메서드를 가지고 있는 클래스.
	//				★ 추상메서드를 하나라도 가지고 있으면, 무조건 추상클래스 
	
	String name = "홍길동";
	
	// 일반 메서드
	public void play() {
		System.out.println("놀자");
	}
	public String sound() {
		return "6시간 이상 잠자기";
	}
	
	// 추상 메서드 (body {} 가 없다)
	public abstract void hobby();
}