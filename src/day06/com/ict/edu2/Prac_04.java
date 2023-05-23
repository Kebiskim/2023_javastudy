package day06.com.ict.edu2;

import java.util.Scanner;


public class Prac_04 {
	public static void main(String[] args) {
	
	// scanner을 이용하여 숫자르 받고 받은 숫자까지 더해서 누적합을 구하기
    //(1번) 1 + (-2) + 3 (-4) + 5 (-6) + 7 +(-8) + 9 ...
    // while문을 이용한 누적합
		
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하세요 : ");
		int num = scan.nextInt(); // 원하는 숫자 입력받기
		int count = 0;
		int sum = 0;

		for (int i = 1; i <= num; i++) {   // ★★★ 부등호 방향 잘 확인 (while이랑 다름!!)
			if (i % 2 == 0) {
				sum = (int)(sum + (i * -1));
			}
			else
				sum = sum + i;
			}
			System.out.println("누적 합은 : " + sum + "입니다.");
		
		
	
	

//(2 번) - * switch~ case문 사용
    // 입력값을 받아서 만들것
    // 농구공 5개씩 한 박스에 들어간다.
    // ex)40개면 8상자, 26개면 6개이다.
	
		System.out.println("공 개수를 입력하세요 : ");
		int ball = scan.nextInt();
		int ball_in_box = 5;
		int box = 0;
		
		if (ball % 5 == 0) {
			box = ball / ball_in_box;
		}
		else
			box = (ball / ball_in_box + 1);
		
		System.out.println("필요한 박스 수는 : " + box + " 박스 입니다.");

//=================================================
    // (4 번) - * 이중 while문으로 풀기
    //1 0 0 0
    //0 1 0 0
    //0 0 1 0
    //0 0 0 1
		
		String one = "1";
		String zero = "0";
		int i = 0; // 행 번호
		int j = 0; // 열 번호
		
		while (i < 4) {
			j = 0;
			while (j < 4) {
				if (i == j)
					System.out.print(one);
				else
					System.out.print(zero);
			j++;
			}
			System.out.println();
		i++;
		}
		

//=================================================
    // (7 번) - * while문
    //       *
    //     * *
    //   * * *
    // * * * *
	
		String star = "*";
		String blank = " ";
		int i_2 = 0;
		int j_2 = 3;
			
		while (i_2 < 4) {
			j_2 = 3;
			while (j_2 >= 0) {
				if (j_2 > i_2)
					System.out.print(blank);
				else
					System.out.print(star);
			j_2--;
			}
			System.out.println();
			i_2++;
		}
		
    }
}