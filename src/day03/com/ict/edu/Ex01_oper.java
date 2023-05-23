package day03.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
		// 산술연산자 : + - * / % (나머지)
		int su1 = 9 ;
		int su2 = 4 ;
		int result = 0 ;
		
		result = su1 + su2 ;  // 통째로 넘어가는 것이 아닌, 계산 완료한 결과값만 넘어가서 저장됨 (과정은 의미 X)
		System.out.println("덧셈 결과 : " + result);
		
		result = su1 - su2 ;
		System.out.println("뺄셈 결과 : " + result);
		
		result = su1 / su2 ;
		System.out.println("나눗셈 결과 : " + result);
		
		double res = (double)su1 / su2 ;             // su1에는 괄호 안넣어도 실행 됨
		System.out.println("나눗셈 결과 : " + res);
		
		double res2 = 1.0 * su1 / su2 ;
		System.out.println("나눗셈 결과 : " + res2);
		
		double res3 = su1 / (su2 * 0.1) ;
		System.out.println("나눗셈 결과 : " + res3);
		
		result = su1 % su2 ;
		System.out.println("나머지 결과 : " + result);
		
		
		
		
		
	}
	
}
