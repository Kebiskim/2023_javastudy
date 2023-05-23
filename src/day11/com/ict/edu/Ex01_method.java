package day11.com.ict.edu;

public class Ex01_method {
	
	// 클래스 : 멤버필드, 멤버메서드, 생성자
	// 멤버필드 : 인스턴스변수, 인스턴스상수, static 변수, static 상수
	
	String name = "홍길동";	// 인스턴스 변수
	int kor = 80;			// 인스턴스 변수
	int eng = 95;			// 인스턴스 변수
	int math = 85;			// 인스턴스 변수
	int total = 0;			// 인스턴스 변수
	double avg = 0.0;		// 인스턴스 변수
	
	static double ki = 178.5;
	// 파란색 = 전역변수 색, 갈색 (t1, k1 등) => 지역변수 색
		
	
	// 멤버 메서드() : 동작, 기능, 실행하는 것
	// 반환형 : 결과물의 자료형
	// 아래 인자(=입력값)는 있을 수도 있고, 없을 수도 있음
	// ** 메서드는 호출해야만 실행할 수 있고, 실행 후 반드시 호출한 곳으로 되돌아감!
	// 형식) [접근제한자] [메서드종류] 반환형 메서드이름([인자],...){ 실행할 내용 }
	// 		** 반환형 : 반드시 호출한 곳으로 되돌아 가는데 실행 결과를 가지고 갈때 실행결과의 자료형을 반환형(return type)이라고 부름.
	// 				   전제조건 : 메서드는 자기 호출한 곳으로 되돌아 간다. (그냥 돌아가는 경우가 있고, 뭔가를 가지고 가는 경우도 있다.)
	// 				   실행결과를 가지고 가지 않으면 void 라는 예약어를  사용한다.
	//				   반환형에는 참조자료형도 넣을 수 있다!! (기본자료형을 비롯해서)
	
	// instance 메서드
	public void getTotal() {
		// void는 자료형이 없음 (뭘 갖고 가는 것이 아니기 때문)
		total = kor + eng + math;
		return; // 그래서 return 후에 바로 세미콜론. (안 갖고가기 때문에 void에서는 return; 을 굳이 안 써도 됨!)
	}
	// instance 메서드
	public int getTotal2() {
		int sum = kor + eng + math;
		// 반환형이 void가 아니면 맨 마지막 return 데이터나 데이터를 가지고 있는 변수
		return sum;
		// 각 메서드의 이름을 다르게 해야 하고, return 도 써야 오류가 안 남!!??
	}
	// instance 메서드
	public int getTotal3() {
		// static 변수 사용 가능
		return kor + eng + math + (int)(ki);
	}
	// 2처럼 변수 만들어서 써도 되고, 3번처럼 써도 되는데, 보통 ☆2번 처럼 변수 만들어서 사용하는 것을 권장!!
	// Spring은 클래스들을 처음 시작할 때부터 객체로 만들어버림. 그래서 첨 잘못 만들면 시작도 못함 (안 켜짐)
	// return에서 돌려줄 때는, 주소값으로 돌려줌 (call by value vs call by reference (이것에 해당)) heap에 있는 값을 돌려주는 것이 아님.
	// return 뒤가 참조자료형이면 값을 돌려줄 수가 없으므로, CBR (call by reference)로 돌려줌.

	// static
	public static void getAvg() {
		// static일 경우는 instance 변수 사용 불가
		// avg = total / 3.0;
		
		// ki가 static 이므로 오류가 안 남! (사용 가능함)
		ki = ki + 5;
	}
	public static double getAvg2() {
		return ki = ki + 0.7;
	}
	
}