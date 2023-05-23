package day20.com.ict.edu;

import java.util.Scanner;

public class Test_Sub {
	public static void main(String[] args) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			int su1 = 50;
			System.out.println("정수 입력 : ");
			try {
				int su2 = scan.nextInt();
				System.out.println("정답 : " + (su1/su2));
			}catch (Exception e){
				System.out.println("올바른 자료형을 입력하세요.");
				continue;
			}
		}
		
	}
}
