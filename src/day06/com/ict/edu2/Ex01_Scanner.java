package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner 클래스 : 키보드에 입력된 정보를 받아서 처리하는 클래스
		// System.out => 표준 출력장치 (모니터)
		// System.in  => 표준 입력장치 (키보드)
		// 회사에서 제공하는 클래스를 사용하기 위해서 import를 해야 된다.
		
		// ★ import를 안해서 오류나는 경우임!!	
		// 클래스를 자료형으로 (왼쪽 Scanner) 하여서 선언.
		// System.in(키보드)를 통해 입력한 내용이 => scan으로 들어감.
		
		// class가 새로 나오는 경우에는, Package가 java.lang에 있는지 항상 확인! 없을 경우, import 해줘야 함
		// 왼쪽 Scanner 바로 오른쪽에 커서 놓고, ctrl + space 눌러주면 상단에 import 들어감!!
		// 혹은 ctrl + shift + o 눌러주면 자동으로 import 입력해 줌!! (웹에서는 안 먹힘. 자바에서만 가능)
		// 그러므로, 위 단축키보다는 Scanner 입력하고 ctrl + space 입력하는 습관 들이기.
		// => 클래스를 쓰면 무조건 ctrl + space 눌러주기.
		
		// java.lang 패키지 안에 존재하는 클래스는 아무런 제약 없이 사용 가능(import 안함)
		// java.lang 패키지 외에 존재하는 클래스는 무조건 import 를 해야 한다.
		
		// import 방법) 1. 클래스 이름 뒤에서 ctrl + space bar
		// 			   2. ctrl + shift + o
		
		Scanner scan = new Scanner(System.in);	// 한번만 입력해주면 됨!!
		// 해당 클래스 커서를 뒤에 놓고 shift + f2 => 해당 클래스 API 설명서가 나타난다.
		// class 안에는 field와 메서드가 존재한다.
		// API에서 method 검색해서 하단에 next() 보면 왼쪽에 자료형 뭐써야 하는지 (String) 나옴.
		
		
		System.out.print("이름 : ");
		// scanner가 받은 숫자를 문자 취급할 지, 숫자 취급할지 형식 지정해 줌.
		// .next(); => 입력한 내용을 String으로 처리하는 메서드
		String name = scan.next();	// 위에서 입력된 값을 (홍길동 등) 버퍼에 저장해 놓고 있다가, next가 name에 저장함.
		System.out.println("받은 내용 : " + name);
		// next는 띄어쓰기나 엔터를 치면 그 이후로는 입력이 안 됨. (거기까지만 읽음)
		// next의 단점 => 띄어쓰기 이전 값까지만 기억함!! 그리고 띄어쓰기 이후 값은 다음 입력값에 지장을 줌 (테스트해 보기)
		// 대신에 nextLine() 사용하면 개행문자 입력 가능.
		// ★ [5/2 숙제] next()와 nextLine()의 차이점 알아오기!!
		// String 넣어야 할 때 숫자 넣어도 오류는 안 남! 대신, 숫자 넣어야할 때 String 넣으면 오류 남!
		
		
		System.out.print("나이(1) : ");
		String age = scan.next();	// 입력받은 값을 변수 (age 등)에 저장해놔야 함 (저장안하면 사라지니까)
		System.out.println("받은 내용 : " + (age+1));		// 문자일 경우 단순 나열 더하기 (19 입력 시, 191로 나옴)
	
		System.out.print("나이(2) : ");
		// .nextInt(); => 입력한 내용을 String이 아니라 int로 처리하는 메서드.
		// 문자를 입력하면 오류가 남 => next로 인해서 띄워진 부분이 뒤로 넘어와서 nextInt()에 들어가는 경우에도, 마찬가지로 오류 발생!!
		int age2 = scan.nextInt();	
		System.out.println("받은 내용 : "  + (age2+1));
		
		System.out.print("키 : ");
		// .nextDouble() : 입력한 내용을 double 로 처리하는 메서드. (문자를 입력하면 오류)
		double height = scan.nextDouble();
		System.out.println("받은 내용 : "  + height);

		// char는 String 으로 들어감. (별도의 next 포함한 메서드가 없음) => nextChar()는 존재 x, 사용 x
		System.out.print("당신은 남성입니까?(true/false)");
		// .nextBoolean() : 입력한 내용을 boolean으로 처리하는 메서드(숫자 및 다른 문자 입력하면 오류)
		boolean gender = scan.nextBoolean();
		System.out.println("받은 내용 : "  + gender);
		if(gender) {
			System.out.println("당신은 남성입니다.");
		}else {
			System.out.println("당신은 여성입니다.");
		}
	}
}