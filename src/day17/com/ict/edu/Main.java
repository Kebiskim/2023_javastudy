package day17.com.ict.edu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		
//		*
//		**
//		***
//		****
//		*****
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력");
//		int rows = scan.nextInt();
//		
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int rows = scan.nextInt();
		
		for (int i = 0; i > rows; i++) {
			for (int j = 0; j > rows; j--) {
				if (j >= i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
//		   j i
		// 5 1
		// 4 2, 5 2
		// 3 3, 4 3, 5 3 
		
	}
}
