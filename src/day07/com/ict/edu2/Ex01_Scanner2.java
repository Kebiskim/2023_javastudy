package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int even = 0;
		
		esc:
		while(true) {
			for (int i = 0; true; i++) {
				System.out.println("숫자를 입력하세요 : ");
				int num = scan.nextInt();
				String str = "";
				if (num % 2 == 0) {
					str = "짝수";
					even++;
				}
				else {
					str = "홀수";
				}
				count++;
				System.out.println(num + "는 : " + str);
				
				int cont = 0;
				do {
					System.out.println("계속할까요? (1.yes, 2.no) >> ");
					cont = scan.nextInt();
					if (cont == 1) continue esc;	// 별도 loop: 를 지정할 필요가 없음!!
					if (cont == 2) break esc;
				}while (cont != 1 || cont != 2);
			}
		}
		double per = (int)(((double)(even*1.0 / count*1.0)) * 1000.0) / 10.0; 
		System.out.println("전체 횟수 : " + count + ", 짝수 횟수 : " + even + ", 짝수 퍼센트 : " + per + "퍼센트");
//		double per = (even/sum)*10/10.0; => 0으로 나옴!! even 과 sum 에 각각 double을 해줘서 형변환 해야 함!!
	}
}