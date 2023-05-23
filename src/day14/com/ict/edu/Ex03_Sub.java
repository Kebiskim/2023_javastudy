package day14.com.ict.edu;

// 자식클래스에서 부모클래스를 선택해서 상속관계를 맺는다.
// 상속관계 아니면 (extends 빼면) 오류 남
// 상속관계 : 자식클래스가 부모클래스의 멤버필드와 멤버메서드를 마음대로 사용할 수 있는 관계
//			마음대로 사용할 수 있는 클래스간의 관계
//		형식 : class 자식클래스 extends 부모클래스
//		특징 : 모든 클래스는 하나의 부모클래스를 갖는다.
//			  ★ 부모클래스가 없으면 Object가 부모클래스이다.
//			  다중 상속을 지원하지 않는다. (즉, 부모클래스는 하나만 존재한다.)
//			  다이어그램에서는 자식클래스     부모클래스
//			  다중상속을 지원하지 않는다. (즉, 부모클래스는 하나만 존재한다.)
public class Ex03_Sub extends Ex03_Super {
	String name = "홍반장";
	String computer = "PC";
	int age = 13;
	double weight = 78.9;
	private String cat = "야옹이";
	
	public Ex03_Sub() {
		System.out.println("자식클래스 생성자 : " + this);
	}
	
	public void play() {
		String name = "홍두깨";
		// 변수 우선 순위
		// 지역변수 > 전역변수 > 부모클래스변수(super 붙여야 함!)
		
		System.out.println(name);		// 홍두깨 나옴
		System.out.println(this.name);	// 홍반장
		System.out.println(super.name);	// 홍길동
		
		// 지역변수가 없고, 전역변수, 부모클래스에게만 있으면
		System.out.println(weight);
		System.out.println(this.weight);
		
		// this : 전역변수, super : 부모클래스변수
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);
		
		// private인 경우 => 접근 불가 (상속보다 private이 우선순위가 먼저다!!)
		System.out.println(cat);
		// 부모 클래스 dog 오류남 (접근 못함)
//		System.out.println(dog);
//		System.out.println(super.dog);
		
		// static인 경우
		System.out.println(computer);
		System.out.println(this.computer);
		// static은 무조건 클래스이름. 으로 접근하는 것을 권장!!
//		System.out.println(Ex03_Sub.computer);
		
		System.out.println(playStation);
		System.out.println(this.playStation);
		System.out.println(super.playStation);
		// 가능하면 아래것을 사용함!! (static은 상속이랑 상관 없음) => 그냥 클래스이름으로 접근하면 됨.
		// 위처럼 쓰면 돌아가는 것임!!
		System.out.println(Ex03_Super.playStation);
	}
} 