package day03.com.ict.edu;

public class Ex03_oper {
	public static void main(String[] args) {
		// 비교연산자 : >, <, >=, <=, ==(같다), !=(같지 않다=다르다)
		// 비교연산자를 사용하는 자료형은 문자(char), 정수(int), 실수(double), 논리(boolean)은 사용 x
		// 연산 결과는 무조건 boolean으로 나오므로, boolean으로 결과를 저장하자.
		
		int su1 = 90 ;
		int su2 = 80 ; 
		
		boolean res = su1 >= su2 ;
		System.out.println("결과는 : " + res) ;
		
		double su3 = 89.999;
		double su4 = 80.0;
		
		res = su1 >= su3 ;
		System.out.println(res);
		
		res = su2 == su4 ;
		System.out.println(res);
		
		char c1 = 'a';
		char c2 = 'A';
		int su5 = 97;
		
		res = su1 >= c1;
		System.out.println(res);
		
		res = c1 == su5;
		System.out.println(res);
		
		res = c1 >= c2 ;
		System.out.println(res);
	}
}