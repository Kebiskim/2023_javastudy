package day07.com.ict.edu;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("국어점수 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학점수 : ");
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		double avg = (int)(sum / 3.0 * 10) / 10.0;	// ★★★ 평균 계산하는 공식 다시 보기!
		System.out.println(avg);
		
	}
}