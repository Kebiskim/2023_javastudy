package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner3 {
	public static void main(String[] args) {
		// 계속할까요(1. yes, 2.no)일 때 Ex01_Scanner2숫자로 받았는데
		// 문자가 들어오면 오류가 발생된다.
		// 그래서 문자로 받아서 처리하자.
		
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
				
				String cont = "";
				do {
					System.out.println("계속할까요? (Y(y) / N(n)) >> ");
					cont = scan.next();
					if (cont.equalsIgnoreCase("y")) continue esc;	// 별도 loop: 를 지정할 필요가 없음!!
					if (cont.equalsIgnoreCase("n")) break esc;		// ★ String 은 == 쓰지 말 것!! 욕먹음
					else System.out.println("제대로 입력하세요."); continue;
				}while (cont != ("y") || cont != ("n")); // 같지 않다???
				// String의 경우, 문자든 숫자든 다 받아주기 때문에, 숫자 들어와도 인식해 버림.
			}
		}
		double per = (int)(((double)(even*1.0 / count*1.0)) * 1000.0) / 10.0; 
		System.out.println("전체 횟수 : " + count + ", 짝수 횟수 : " + even + ", 짝수 퍼센트 : " + per + "퍼센트");
//		double per = (even/sum)*10/10.0; => 0으로 나옴!! even 과 sum 에 각각 double을 해줘서 형변환 해야 함!!
		
	}
}