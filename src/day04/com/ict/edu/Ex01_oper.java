package day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
		// 삼항 연산자 : 조건식 => 조건이 참 일 때와 거짓일 때를 구분해서 실행한다.
		// 만드는 방법이 까다로워서 if, else 문을 사용함
		// 형식) 자료형 변수이름 = (조건식) ? 는 조건식이 참일 때 실행할 문장 : 는 조건식이 거짓일 때 실행할 문장.
		// **주의사항) 변수, 참일 때 실행 결과, 거짓일 때 실행한 결과 모두 같음 자료형이어야 한다. (JS랑 다른 부분임)
		// 조건이 참일 때 실행할 문장을 왼쪽 변수 부분에 저장. 거짓일 때는 실행할 문장을 왼쪽에 저장. ('분기'라고 부름)
		// 조건식 : 분기문(나눠진다)은 알고리즘에서 마름모로 표시. 참일 때와 거짓일 때로 나뉘는 예 -> 로그인 성공 시, 실패 시.
		// 조건식은 원래 괄호가 없어도 되는데, 헷갈리니까 쓰는 것.
		// 조건식에는 boolean(true, false), 비교연산자(>,< 등), 논리연산자(&&, ||, !)가 들어갈 수 있다.

		// String str = (true) ? "강아지" ;
		// Syntax error, insert ": Expression" to complete Expression
		/*
		 * String str = (true) ? "강아지" : 10 ; Exception in thread "main"
		 * java.lang.Error: Unresolved compilation problems: Type mismatch: cannot
		 * convert from int to String Duplicate local variable str
		 */
		String str = (3 > 1) ? "강아지" : "고양이";
		System.out.println(str);

		// str = (조건식) ? 참일때 : 거짓일때;
		int avg = 55;
		str = (avg >= 60) ? "합격" : "불합격";
		System.out.println("결과 : " + str);

		// 실수와 정수는 비교할 수 있다!! (저장하고 하는 것이 아니라 비교만 하는 것)
		// 결과가 true, false가 나오는 것은 다 넣을 수 있다는 것!
		double avg2 = 55.3;
		str = (avg2 >= 60) ? "합격" : "불합격";
		System.out.println("결과 : " + str);

		char c1 = '5';
		// str = ('z' > c1 > 'a') ? "소문자" : "소문자 아님";
		// Syntax error on token ">", >> expected 에러 발생
		// Q. 위 에러 발생하는 이유? 왼쪽 것을 기준으로 하기 때문인지?
		str = (c1 >= 'a' && c1 <= 'z') ? "소문자" : "소문자 아님";
		System.out.println(str);

		int gender = 7; // 성별 : 1, 3이면 남자, 2, 4면 여자로 해야하는데, "1, 3이 아니면 여자"로 해봄.
		// 1 또는 3이면 남자, 아니면 여자
		str = (gender == 1 || gender == 3) ? "남자" : "여자";
		System.out.println(str);

		str = (gender % 2 == 1) ? "남자" : "여자";
		System.out.println(str);

		// 3의 배수인지 아닌지 알아보자.
		int su1 = 157;
		str = (su1 % 3 == 0) ? "3의 배수" : "3의 배수 아님";
		System.out.println(str);

		// 근무시간이 8시간까지는 시간당 9620원
		// 8시간을 초과한 시간만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?

		// 근무시간이 8시간을 넘는가?
//		int pay = 9620;
//		int worktime = 12;
//		int pay_overtime = (int)(pay * 1.5);
//		int result = 0;
//		
//		result = (worktime > 8) ? ((8 * pay) + ((worktime - 8) * pay_overtime)) : (worktime * pay);
//		System.out.println(result);
//		
////		System.out.println(pay_overtime);
//		System.out.println(pay);

		// 근무시간이 8시간을 넘는가??

		int pay = 9620;
		int worktime = 12;
		int pay_overtime = (int) (pay * 1.5);
		int over_pay = ((8 * pay) + ((worktime - 8) * pay_overtime));
		int normal_pay = worktime * pay;
		int result = 0;

		result = (worktime > 8) ? over_pay : normal_pay;
		System.out.println(result);

//		
//		int time = 10;
//		int dan = 9620;
//		int pay = 0;
//		  
//		int pay = (time > 8) ? (8 * dan) + (int)((time - 8) * dan * 1.5) : time * dan;
//		int pay = System.out.println("결과 : " + pay);

		int num1 = 12;
		int num2 = 47;
		int res = (num1 > num2) ? num1 : num2;
		System.out.println("큰값 : " + res);

		res = (num1 - num2 > 0) ? num1 : num2;
		System.out.println(res);

		int res2 = Math.max(num1, num2); // 단점 : 2개밖에 못 받음.
		System.out.println(res2);
		// abs : 절대값.
		// 팀별 과제 : Math 클래스에 나오는 메서드 10개 조사해 오기.

		int res3 = -1234;
		int res4 = (res3 > 0) ? res3 : res3 * -1;
		System.out.println("절대값 결과 : " + res4);

		int res5 = Math.abs(res3);
		System.out.println("절대값 결과 : " + res5);
	}
}