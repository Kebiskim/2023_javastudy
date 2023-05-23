package day11.com.ict.edu;

public class Ex01_main {
	public static void main(String[] args) {
		// static은 객체 생성과 상관없이 호출 가능
		// static 호출 : 클래스이름.변수, 클래스이름.메서드
		System.out.println(Ex01_method.ki); // 178.5

		Ex01_method.getAvg();
		System.out.println(Ex01_method.ki); // 183.5
		System.out.println("***********************");
		
		Ex01_method t1 = new Ex01_method();
		// new 옆에 있는 것은 class가 아니라 생성자
		// 앞에서 생성자 안 만들었기 때문에, 기본 생성자로 객체를 생성함!!
		// heap => pile, 무더기, 쌓다.
		// new 할 때마다 Ex01_method 전체가 첨부터 다시 만들어짐.
		// t1 대신 t2를 만들면, 같은 구조의 아파트에 다른 사람이 사는 것처럼 됨 => ★ 재활용 이라고 부름!!
		
		
		//			  stack				|			heap
		// ----------------------------------------------------------
		//				t1				|		Ex01_method
		//									String name = "홍길동";
		//									int kor = 80; 
		//									etc... 						=> 멤버필드
		// ----------------------------------------------------------
		//								|	get total() : void			
		//								|	get total2(): int			=> 멤버 메서드
		//								|	get total3(): int
		
		
		// 인스턴스 호출 방법 : 참조변수.변수,		참조변수.메서드
		String n = t1.name;
		
		// void는 호출한 곳으로 아무것도 가져오지 않는다.
		t1.getTotal();
		
		// total 값이 변경된 것을 확인
		int k1 = t1.total;
		
		System.out.println(n);
		System.out.println(k1);
		System.out.println("***********************");
		
		// 1. class 를 불러온다 (Scanner 불러올 때처럼)
		// 2. t1.인스턴스 변수 를 String 변수 안에 넣는다.
		// 3. t1.name;, t1.getTotal(); 등과 같이 쓴다.
		
		// new로 새로 만든 후에, 메서드를 실행하지 않으면, total이 0인 상태로 있다. (실행을 해야 total 값이 변경됨)
		
		// 같은 형태의, t1의 heap에 있는 Ex01_method와 t2의 heap에 있는 Ex02_method 등은 같은 주소기 때문에,
		// 배열에 들어갈 수 있다. (객체형 배열)
		// new 예약어는 heap 메모리에 저장공간을 따로 만든다!!
		
		// 뭔갈 받아서 내 class 안에 있는 값을 변경할 때는 void를 사용하고, 받아서 던져주는 경우에는 int 형 등 반환형 있는 것을 씀.
		
		double k2 = Ex01_method.getAvg2();
		System.out.println(k2);
		
		// instance들은, 자기 값만 변경하고 나머지는 변경할 수 없음.
		// static은 static을 바꾸면 자기 값이 바뀌기 때문에 이를 참조하는 것들이 다 바뀜 (그래서 ★공통으로 사용하는 변수라고 함)
		
		// 기본금리와 변동금리 폭의 차이점과 비교하면 됨. (기본금리가 static, 회사별 변동 금리가 instance)
		// private이면 static 이라도 접근할 수 없음!!
		// ★ 우선순위는 접근제한자가 가장 높음. (private >>> static) 
		// 왼쪽에서 f2 눌러서 이름 바꾸면, 연동되는 부분들의 class명도 함께 바뀜.
	}
}
