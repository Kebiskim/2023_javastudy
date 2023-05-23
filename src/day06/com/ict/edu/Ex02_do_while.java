package day06.com.ict.edu;

public class Ex02_do_while {
	public static void main(String[] args) {
		// do ~while문 : while문과 같은 반복문
		//				단, 먼저 실행 후 조건식이 붙는다.
//		형식) 
//				초기식;
//				do {
//					실행문;
//					증감식;
//				}while(조건식);
				
		// 0-10까지 출력
		
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}while(i < 11);
		
		// 0-10까지 홀수 출력
		i = 0;
		int sum = 0;
		do {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}while(i < 11);
		System.out.println("결과 값은 : " + sum);
		
		// 7단 출력
		i = 1;
		int seven_dan = 7;
		do {
			System.out.println(seven_dan + " * " + i + " = " + seven_dan * i);
			i++;
		}while(i <10);
		
		// 0-10까지 홀수의 누적합
		i = 0;
		sum = 0;
		do {
			if (i % 2 == 1) {
				sum = sum + i;
				i++;
			}
			else {
				i++;
			}
		}while(i < 11);
		System.out.println("누적 합은 : " + sum);
	}
}



