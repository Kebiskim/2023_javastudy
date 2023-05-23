package day09.com.ict.edu;

import java.util.Scanner;

public class Ex01_class {
	// 클래스
	// 자바에서의 클래스는 객체(Ojbect)를 정의하는 틀 또는 설계도면과 같은 의미로 사용된다.
	// 객체란 클래스를 바탕으로 생성된 것을 객체라고 한다.
	
	// 클래스가 가지고 있는 것 : 데이터 = 멤버필드 (변수와 상수)
	//						기능 = 동작 = 멤버 메서드
	//						생성자 = 클래스가 객체로 만들어질 때 한번 호출 돼서 데이터를 초기화할 수 있는 것
	// 						** 클래스이름 = 저장이름 = 파일이름 = 생성자이름

	// 클래스 구조 : 헤더, 멤버필드, 생성자, 멤버 메서드
	// 1. 헤더 : [접근제한자] [클래스 종류에 대한 예약어] class 클래스 이름 {		}
	// 	 1) 접근제한자 : 클래스, 멤버필드, 멤버메서드, 생성자 모두 맨 처음 사용할 수 있다.
	//					외부에서 접근할 수 있는 권한의 단계를 말함
	// 		가) public : 누구나 다 접근 가능
	//		나) protected : 같은 패키지와 상속관계에서는 접근 가능
	//		다) 생략(default) : 같은 패지지에서만 접근 가능
	//		라) private : 외부에서는 접근 불가, 내부멤버 끼리는 접근 가능
	
//	public int su = 10;
//	protected int num = 100;
//	int pe = 200;
	
	//   2) 클래스 종류에 대한 예약어 : 일반적인 클래스 생략한다.
	//		특정 클래스에 해당하는 예약어가 존재한다. (final, abstract... 등등)
	
	//   3) class : 클래스임을 나타내는 예약어
	
	//   4) 클래스이름 : 클래스이름 = 저장이름 = 파일이름 = 생성자이름
	//					첫글자 대문자, 나머지 소문자.
	//					두 단어 이상일 때는 단어 첫 글자들은 대문자
	//					숫자는 중간이나 뒤에 사용, 공백은 사용 불가

	// 2. 멤버필드 : 데이터, 상태값, 속성, 특징
	//	 1) 변수 : 언제든지 변할 수 있는 데이터를 저장하는 공간
	//				첫글자 소문자, 두 단어 이상일 때는 단어 첫 글자들은 대문자
	//				숫자는 중간이나 뒤에 사용, 공백은 사용 불가

	//	 2) 상수 : 한번 저장되면 변경할 수 없는 데이터
	//				모든 글자가 다 대문자, 단어와 단어 사이에 _(언더바)를 사용할 수 있다.
	
	// 3. 멤버메서드 : 동작, 기능, 실행
	//		- 해당 메서드를 호출(실행)하면 해당 메서드안에 존재한 내용이 실행됨 (★ 호출을 해야만, 실행이 되는 것!!)
	//		- 호출해서 내용이 실행된 후에는 호출한 곳으로 되돌아 간다. ★ 중요한 부분!
	//		- 메서드는 다른 메서드를 호출할 수 있다 (그래서 메인메서드 하나만 가지고도 여러개를 실행할 수 있음!!)
	//   1) 구성 : [접근제한자] [메서드종류] 반환형 메서드이름([인자=매개변수]){실행할 내용} 
	//	 			public	  static   void	  main
	//	   가) 접근제한자 : public, protected, 생략(default -> 실제로 default로 쓰면 오류남!), private;
	//	   나) 메서드종류 : 일반메서드 이부분을 생략한다.
	//					특정 메서드에 해당하는 예약어를 사용 (static) => '얘는 static 메서드다' 라고 부름.
	//     다) **반환형 : 해당 메서드가 실행이 끝나면 호출한 곳으로 되돌아갈 때 
	//					함께 가지고 가는 결과의 자료형 (결과 값이 아닌, 결과의 자료형!!)
	//					만약에 결과를 가지고 가지 않으면 void라는 예약어를 사용한다.
	
	//   2) 메서드이름 : 변수와 같음(소문자로 시작, 첫글자 소문자, 두단어 이상일 경우 단어 첫글자들은 대문자)
	//					숫자는 중간이나 뒤에 사용, 공백은 사용 불가!
	//   3) ** 인자 = 매개변수 : 보통은 실행할때 필요한 정보를 외부에서 받기 위한 통로.
	//						생략 가능하고, 여러개 사용 가능
	//	 4) ** 오버로딩(중복정의) : 메서드 이름이 같으나 인자 수나 인자 자료형이 다르면 다른 메서드로 판단한다.
	//						즉, 인자의 수나 자료형이 다르면 같은 이름의 메서드가 여러개 존재할 수 있다. (고급코딩할 때)
	//						ValueOf 가 좋은 예시!! => 메서드 오버로딩이라고 함.
	//						이름은 같은데, 인자가 달라서 여러개를 넣을 수 있음. 사용자 입장에서는 입력 제한없이 자유로움.
	//	 5) ** getter() : 호출하는 입장에서 메서드를 이용해서 정보를 가져올 수 있다.
	//		** setter() : 호출하는 입장에서 메서드를 이용해서 정보를 변경할 수 있다.
	//		변수가 private 이면 직접 접근을 할 수 없다. => getter/setter를 이용해서 접근한다.
	//		우회도로 (getter, setter)를 이용해서 접근할 수 있다!! 원래는 접근 안 되지만..
	//		백도어를 반드시 만들어 놓음! (개발자 본인이 들어가야 하기 때문에)
	//		스타 미네랄 핵 등 => private가 아니거나, 맞을 경우 getter 등을 이용해 접근하는 것.
	//		리모콘으로 치면, 사용자에게 조작법만 주고 자세한 작동법 등은 안 줌.
	//		메소드는 public 이 기본임 (기능이므로), private은 실전에서 많이 씀.
	//		캡슐화 =>  
	
	// 4. 생성자 : 클래스가 객체로 만드어질 때 한번 호출된다.
	//   1) 목적 : 멤버필드 (변수, 상수)의 초기값을 지정하는 것이 목적이다.
	//   2) 형식 : 클래스 이름과 생성자 이름은 같다.
	//				반환형이 없는 메서드의 형태이다.
	//				[접근제한자] 생성자(클래스이름)([인자]){	실행내용	}
	//				생성자는 메서드로 볼 수도 있고 안 볼수도 있는데, 교수님은 기본적으로 그렇게 안 봄. 근데 그게 꼭 틀린 건 아님
	//				인자가 없는 생성자 => 기본 생성자 라고 한다.
	//	  생성자 오버로딩 가능
	//	  하나의 클래스의 여러개의 생성자가 존재할 수 있다. => 생성자 오버로딩
	//	  ** 모든 클래스는 반드시 생성자를 가지고 있음.
	//		 해당 클래스의 생성자가 없으면 객체를 생성할 때 기본 생성자를 호출한다.
	
	//   3) 클래스를 이용해서 객체 만들때 생성자 호출
	//		Scanner		 scan 		=		 new		 Scanner(System.in);
	//		 클래스		참조변수		=	   new예약어			생성자				=> 앞에 Scanner랑 뒤에랑 다른 것!
	//	Scanner 커서를 S 앞에 놓고 shift + f2 누르면 나옴.
	
	//	 new 예약어를 사용하면 무조건 heap 메모리에 사용 영역(저장영역)을 만든다.
	
	// 5. 클래스를 객체로 만든 후 멤버필드와 멤버메서드에게 접근하는 방법
	//	  참조변수.멤버필드, 	참조변수.멤버메서드(), 	 (단, 접근제한자를 확인)
	//	  sysout => 참조변수 안 만들고, 바로 접근했었음.
	
	// 6. static과 instance : 멤버필드, 멤버메서드에 공통으로 해당하는 사항
	// 멤버필드 -> static, instance. 멤버메서드 -> static, instance. 이중 static은 객체생성과 상관없이 미리 만들어짐!!!
	// JVM 실행할 때 static은 미리 만들어짐. 그 이후, instance는 우리가 객체 만들고 생성자 호출할 때 생김!!
	// static은 무조건 static이라고 붙어있음 (예약어를 사용함)
	//   1) instance(인스턴스) 필드, 메서드 : 객체가 생성될 때 같이 생성되는 필드와 메서드
	//										일반적인 클래스의 멤버필드나 멤버메서드는 모두 인스턴스이다. 
	//		호출방법 : 객체 생성한 다음에 호출
	//				참조변수.멤버필드, 참조변수.멤버메서드
	//				heap 메모리에 만들어진다.
	//				Scanner scan = new Scanner(System.in);
	//				scan.nextInt();
	//				heap 메모리에 만들어진다.
	
	//   2) static
	//    - 객체 생성과 상관없이 미리 만들어진 멤버필드와 멤버 메서드
	//	  - 반드시 static 이라는 예약어를 사용
	//    - 객체 생성과 상관없이 언제든 호출 가능
	//	  - 호출 방법; 클래스이름.멤버필드, 클래스이름.멤버메서드
	//				 System.out, 
	// Math.max(a, b); 이런 식으로, 바로 갖다쓰는 것.
	//	  - static 메모리에 만들어진다.(공용)
	// ★★★ Class 에서 금요일에 다섯문제 제출!!
	
	
}