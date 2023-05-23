package day14.com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int su = (int)(Math.random()*100)+1;	// 랜덤 숫자는 1~100 사이
		int num = 0;	// 숫자 입력
		int me = 0;		// 높음 낮음 선택
		
		int win = 0; // 이긴 횟수
		int lose =0; // 진 횟수
		int total = win+lose; // 전체 게임 횟수
		
		// 결과 값
		esc:
			while(true) {
				System.out.println("===== 게임을 시작합니다! =====");
				System.out.print("숫자를 입력하세요 : ");
				num = scan.nextInt();
				System.out.println("당신이 고른 숫자는 com의 숫자보다 높을까요? 낮을까요?");
				System.out.print(" 높음(1) | 낮음(2) : ");
				me = scan.nextInt();
			
				switch(me) {
				case 1: 	// 높음(1)을 골랐을 때
					if(su>num) {
						System.out.println("com 보다 낮습니다! (실패)");
						lose++;
					}else if(su==num){
						System.out.println("com과 같습니다.(실패)");
						lose++;
					}else if(su<num){
						System.out.println("com 보다 높습니다!! (성공)");
						win++;
					} total++; break;
				case 2:		// 낮음(2)을 골랐을 때
					if(su>num) {
						System.out.println("com보다 낮습니다! (성공)");
						win++;
					}else if(su==num) {
						System.out.println("com과 같습니다. (실패)");
						lose++;
					}else if(su<num) {
						System.out.println("com보다 높습니다! (실패)");
						lose++;
					} total++; break;
					default : // 이외의 숫자를 눌렀을 때
					if(me!=2) {
					System.out.println("다시 입력해주세요");
					total++;
					break;
					}
					
				}
				 while(true) {
						System.out.print("계속 하시겠습니까?(y) / (n) : ");
						String s1 = scan.next();
						if (s1.equalsIgnoreCase("y")) {
							continue esc;
						}else if(s1.equalsIgnoreCase("n")) {
							System.out.println("전체 횟수 : " + total);
							System.out.println("이긴 횟수 : " + win);
							double rate = (int)(win*1.0/ (total)*1000)/10;
							System.out.println("승률 : " + rate + "% 입니다.");
							break esc;
						}else {
							System.out.println("다시 입력하세요");
							continue;
						}
					}
				
			} 
		
		
	}
}
