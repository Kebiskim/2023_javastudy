package day09.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		// instance 는 가져다 쓰려면 객체 생성을 먼저 해줘야 함!
		// static은 객체 생성을 안해줘도 바로 갖다쓸 수 있음!
		// System.out.println(Ex02_class.); // 여기서 s, f 에 주목!!
		System.out.println(Ex02_class.AVG);
		System.out.println(Ex02_class.sum);
		
		// System.out.println(Ex02_class.name); // Cannot make a static reference to the non-static field Ex02_class.GENDER
		// System.out.println(Ex02_class.GENDER);
		// 위 두 가지는 객체 생성을 해야 쓸 수 있는 애들!! 객체 생성을 하고, 참조변수를 통해 접근해야 함.
		// 하지만, static의 경우 바로 접근 가능.
		
		// instance는 객체 생성 후 접근해야 함.
		// 객체 생성)
		// 클래스이름   참조변수 = new 생성자([인자]);
		// ** 해당 클래스의 생성자가 없으면 기본생성자 사용
		// ** 기본 생성자란 인자가 없는 생성자,   클래스이름() = 기본생성자()
		Ex02_class test = new Ex02_class();
		// 접근법 : 참조변수.멤버필드 
		System.out.println(test.name);
		System.out.println(test.GENDER);
		// AVG, sum 도 접근 가능
		System.out.println(test.AVG);
		System.out.println(test.sum);
		// 하지만 static은 굳이 instance처럼 접근하지 말고, 아래처럼 접근하기!!
		System.out.println(Ex02_class.AVG);
		System.out.println(Ex02_class.sum);
		System.out.println(test);  // 주소 출력됨
		
		
		//		static 메모리 (스택이랑 힙 말고, 실행되기 전에 그 위에 먼저 ☆별도의 공간에 저장되어 있음)
		//		Ex02_class.sum = 300;  	=> 똑같은 이름 두개가 있을 수 없음. 공용 이라고 부름(누구나 호출 가능)
		
		// 		스택			|			힙								
		//		test		=>		Ex02_class
		//							String name = "홍길동;
		//							final String name = "남성";
		// System.out.println(test.AVG); 처럼 호출하면, 이렇게 한단계 더 거쳐서 test => heap => static (메모리를 더 사용)
		// 배열처럼 생각을 해서, test가 Ex02_class 클래스 주소를 가지고 있다고 생각.
		// ★static 을 많이 쓰면 아주 느려짐!! 딱 필요한 것만 static을 만들고, 필요없는 것들은 instance로 만들어서 씀!!
		
		// 지역변수의 개념으로, 메서드가 호출할 때 만들어졌다가 사라짐. 메서드가 끝나는 순간 지워짐 (객체 생성할 때는 안 만들어짐)
		// C언어의 구조체 => 자바의 class
		
		// ★저장 측면에서 끝판왕은 class => 다양한 자료형과 함께 모든 것을 저장할 수 있고, 배열과 비교하면
		// for문 돌려서 순서대로 부를 필요가 없음! 변수 => 배열 => 클래스 순으로 저장.
		// DB 저장할 때 class를 DAO(Data Access Object) 혹은 VO(Value Object)라고 부름
		
		// 상수 쓸때는 static final 쓰는 게 맞는데, 너무 많아지면 속도가 느려져서, 
		// ☆final 이 붙으면 상수. static이 붙으면 static, 아무것도 안 붙으면 instance.
		
		
		// 변수와 상수의 차이
		test.name = "일지매";
//		test.GENDER = "여성"; // => 오류. (변수는 변경될 수 없으므로) 갖다대면 final 지우라고 뜨는데, 상수로 바꾸란 뜻.
		
		Ex02_class.sum = 1000;
		// 상수라서 변경 못함
//		Ex02_class.AVG = 12345;
		
		System.out.println(test.name);
		System.out.println(Ex02_class.sum);
		
	}
}
