package day15.com.ict.edu;

public class Animal {
	// final 변수 = 상수 = 데이터 변경 방지
	// final 메서드 = 오버라이딩(Overriding) 방지 = 메서드 내용 변경 방지
	// final 클래스 = 상속방지 (자식 클래스 생성 금지)
	// 시험문제 나옴. final에는 세가지 있다는 부분.
	int eyes = 2;
	String color = "그레이";
	
	public void sound() {
		System.out.println("울음소리");
	}
	public void hobby() {
		System.out.println("좋아하는 행동");
	}
	// 자식에서 오버라이딩 못 하도록 (변경 못 하도록) 막아버리는 것 => static 자리에 final 추가
	// 멤버필드에 final 붙이면 상수, 메서드에 붙이면 Override 금지.
	// ★ 클래스에 final 붙이면 상속을 못함. 결국, final은 더이상 변경하지 않겠다는 뜻!!
	public final void sleep() {
		System.out.println("8시간 이상 잠을 잔다.");				
	}
}
