package day13.com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Homework_20230512_RockSP {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		loop:
		while (true){
		System.out.println("가위(0), 바위(1), 보(2) 입력하세요 >>> ");
		int rsp = scan.nextInt();
		Random ran = new Random();
		
		int com_rsp = (int)(Math.random() * 2);

		if (rsp == com_rsp)
			System.out.println("비겼습니다.");
		else if (rsp == 0 && com_rsp == 1)
			System.out.println("졌습니다.");
		else if (rsp == 0 && com_rsp == 2)
			System.out.println("이겼습니다.");
		else if (rsp == 1 && com_rsp == 0)
			System.out.println("이겼습니다.");
		else if (rsp == 1 && com_rsp == 2)
			System.out.println("졌습니다.");
		else if (rsp == 2 && com_rsp == 0)
			System.out.println("졌습니다.");
		else if (rsp == 2 && com_rsp == 1)
			System.out.println("이겼습니다.");
		
		
		System.out.println("계속 할까요? (y/n) >>> ");
		String yorn = scan.next();
		if (yorn.equalsIgnoreCase("y")) {
			continue loop;
		}else if (yorn.equalsIgnoreCase("n")) {
			break loop;
		}else {
			System.out.println("다시 입력하세요.");
			continue;
		}
		
			
		}
	}
}
