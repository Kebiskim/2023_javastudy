package day15.com.ict.edu3;

// 인터페이스 : 서비스를 제공하는 목록
//			 상수와 추상메서드만 가지고 있다.
//			 일반적인 변수와 일반적인 메서드는 존재하지 않는다.
//		 	 객체 생성 안됨 (생성자도 없다..)
//			 예외적으로, 다중상속을 할 수 있다 (부모가 여러개가 될 수 있다. 여러개의 interface를 부모로 만들 수 있음.)
//			 interface는 class를 부모로 만들 수 없다!!
//			 '인터페이스가 같다' 라는 말은 '대체가 가능하다' or '호환이 가능하다' 라는 뜻!!
//			 호환성 : 마치 핸드폰 충전 케이블의 8핀 C타입 등등

// 인터페이스 상속 : 인터페이스 extends 인터페이스, 클래스 extends 클래스, 클래스 implement 인터페이스
public interface Ex01_interface {
	// 네가지 형태 모두 사실은 static final임(interface 안에 있는 멤버필드는 무조건 static final임)
	final int SU1 = 10;
	static final int SU2 = 20;
	int su3 = 30;
	static int su4 = 40;
	
	// 추상메서드
	public abstract void sound();
	// abstract는, interface에서는 생략 가능!!
	public void play(); // 추상클래스에서는 abstract 안붙으면 오류인데, interface에서는 전부 추상이므로 안 붙여도 됨!!
	
	// 일반메서드 사용 불가
//	public void hobby() {}; // 오류!!
	// ☆ static은 미리 만들어진다!! interface에 속하지 않고 따로 만들어져서 사용 가능. 하지만 보통은 안씀.
	public static void like() {
		System.out.println("놀기 좋아");
	}

}
