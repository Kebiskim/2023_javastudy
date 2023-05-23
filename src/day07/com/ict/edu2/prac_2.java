package day07.com.ict.edu2;

import java.util.Scanner;

public class prac_2 {
	public static void main(String[] args) {
		//!과제! [0503 과제] - 제출 0504까지
		// 입력한 숫자가 홀수인지 짝수인지.
		//1,2를 제외한 다른 숫자를 눌렀을 때 "다시 입력하세요." 나오게
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
					
			String str ="";
			if (su%2==0) {
				str="짝수";
			} else {
				str="홀수";
			}
			System.out.println(su + "는 " + str + "입니다.");
			System.out.println("계속할까요? [1.yes / 2.no]");
			int s1=scan.nextInt();
			if (s1>2 && s1==0) {
				System.out.println("다시 입력하세요.");
			}else if (s1==2) {
				break;
			}
		}
		System.out.println("========================");
	}
}
