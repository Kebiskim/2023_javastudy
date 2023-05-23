package day06.com.ict.edu2;

import java.util.Scanner;

public class Scan_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("책 가격의 총합을 적으시오 : ");
		int total = scan.nextInt();
		System.out.println("첫 번째 책 가격을 적으시오 : ");
		int book_1 = scan.nextInt();
		System.out.println("두 번째 책 가격을 적으시오 : ");
		int book_2 = scan.nextInt();
		System.out.println("세 번째 책 가격을 적으시오 : ");
		int book_3 = scan.nextInt();
		System.out.println("네 번째 책 가격을 적으시오 : ");
		int book_4 = scan.nextInt();
		
		int book_sum = book_1 + book_2 + book_3 + book_4;
		
		System.out.println("다섯 번째 책 가격은 : " + (total - book_sum) + " 원 입니다.");
	}
}
