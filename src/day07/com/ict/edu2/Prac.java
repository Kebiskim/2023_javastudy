package day07.com.ict.edu2;

import java.util.Scanner;

public class Prac {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int od=0; // 홀수
	    int evens=0; //짝수
	    while (true) {
	        System.out.print("숫자 입력 : ");
	        int su = scan.nextInt();

	        String str ="";
	        if (su%2==0) {
	            str="짝수";
	            evens=evens+1;
	        } else {
	            str="홀수";
	            od=od+1;
	        }
	        System.out.println(su + "는 " + str + "입니다.");
	        System.out.println("계속할까요? [1.yes / 2.no]");
	        int s1=scan.nextInt();
	        if (s1==2) {
	            int sum = od+evens;
	            System.out.println("전체횟수 : "+ sum);
	            System.out.println("짝수횟수 : "+ evens);

	            System.out.println("짝수확률 : "+ (double)((double) evens/(double) sum*10.0)/10.0);

	            break;
	        }
	}
	
	}
}
