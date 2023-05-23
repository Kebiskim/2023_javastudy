package day06.com.ict.edu2;

import java.util.Scanner;

public class Prac_03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 입력받은 개수만큼 아래로 내려가며 별찍기 (해당 갯수를 초과하는 라인에 도달 혹은 초과 시 자동 스탑) 
		// ex) 6개 입력 시
		// *
		// **
		// ***
		// ex) 9개 입력 시
		// *
		// **
		// ***
		// ****
		System.out.println("원하는 별 갯수를 입력하세요 : ");
		int stars = scan.nextInt(); // 원하는 별 개수 입력받음
		int count = 0; // 별 갯수 카운팅
		int i = 0; // 행 순서
		int j = 0; // 별 찍기
		
		loop:
		while (count < stars) {
			for (i = 1; true; i++) {
				loop_2:
				for (j = 1; true; j++)
					if (j <= i) {
						System.out.print("*");
						count++;
					}
					else {
						System.out.println();
						if (count >= stars)
							break loop;
						break loop_2;
					}
				}	
			}
		
	}
}
