package day07.com.ict.edu;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int s1 = scan.nextInt();
		
		System.out.print("두번째 수 : ");
		int s2 = scan.nextInt();
		
		System.out.print("연산자 : ");
		int op = scan.nextInt();
		
		double res = 0.0;
		String oper = "";
		if (op == 1) {
			res = s1 + s2;
		}else if (op == 2) {
			
		}else if (op == 4) {
//			res = (int)(s1 * 10 / s2) / 10.0;
			res = (int)((s1 * 10.0) / s2) / 10.0;
			
			oper = "/";
		}
		System.out.println(oper + res);
	}
}