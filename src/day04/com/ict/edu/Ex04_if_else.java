package day04.com.ict.edu;

public class Ex04_if_else {
	public static void main(String[] args) {
		// if ~ else 문
		// 조건식이 참일때와 거짓일때 각각 나눠서 처리한다.
		// 형식)  if(조건식){
		//          조건식이 참일 때 실행할 문장;
		//          조건식이 참일 때 실행할 문장;
		//       }else{
		//          조건식이 거짓일 때 실행할 문장;
		//          조건식이 거짓일 때 실행할 문장;
		//       }
		
		// int k1이 60 이상이면 합격, 아니면 불합격
		int k1 = 50;
		String str = "";
		if (k1 >= 60) {
			str = "합격";
		} else {
			str = "불합격";
		}
		System.out.println("결과 : " + str);
		
		// int k2가 홀수인지, 짝수인지 판별하자.
		int k2 = 7;
		String res2 = "결과값(초기)";
		if (k2 % 2 != 0) {
			res2 = "홀수";
		} else {
			res2 = "짝수";
		}
		System.out.println("k2는 " + res2);
		
		// char k3가 대문자인지, 대문자가 아닌지 판별하자.
		char k3 = 'I';
		String res3 = "결과값(초기)";
		if (k3 >= 'A' && k3 <= 'Z') {
			res3 = "대문자";
		} else {
			res3 = "대문자가 아님";
		}
		System.out.println("k3는 " + res3);

		// 근무시간이 8시간까지는 시간당 9620원
		// 8시간을 초과한 시간만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?
		int pay = 9620;
		int limit = 8;
		int pay_overtime = (int)(pay * 1.5);
		int worktime = 11;
		int salary = 0;
		
		if (worktime > limit) {
			salary = (pay * limit) + (pay_overtime * (worktime - limit));
		} else {
			salary = pay * worktime;
		}
		System.out.println("받을 돈은 " + salary);
	}
		
}
