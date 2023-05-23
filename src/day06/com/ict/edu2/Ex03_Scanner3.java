package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 근무시간이 8시간까지는 시간당 9620이고
        // 8시간을 초과한 시간 만큼은 1.5배 지급한다.
        // 현재 근무한 시간이 10이다.
        // 얼마를 받아야 하는가?
        System.out.print("근무시간 : ");
        int work_time = scan.nextInt();
        int overtime = 8;
        int pay = 9620;
        int pay_overtime = (int)(pay * 1.5);
        int salary = 0;
        int salary_normal = pay * work_time;
        int salary_overtime = (pay * overtime) + ((work_time-overtime) * pay_overtime);
        
        if (work_time > 8)
        	System.out.println("지급할 급여는 : " + salary_overtime + "원 입니다.");
        else 
        	System.out.println("지급할 급여는 : " + salary_normal + "원 입니다.");
       
        // menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
        // 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
        // 친구와 함께 2잔을 10000 내고 먹었다.
        // 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
        // (친구와 같은 음료을 먹어야 한다.)
         System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)"
                 + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
         // 메뉴를 번호로 1, 2, 3, 4로 집어넣어야 함. (받는 정보가 숫자)
         int menu = scan.nextInt();
         int cafe_mocha = 3500;
         int cafe_latte = 4000;
         int americano = 3000;
         int fruit_juice = 3500;
         int change = 0;
         int order_quantity = 2;
         int payment = 10000;
         for (int error_input = 0; true; error_input++) {
	         if (menu == 1) {
	        	 change = payment - (int)(order_quantity * cafe_mocha * 1.1);
	         	 System.out.println("받을 거스름돈은 : " + change + "원 입니다.");
	         	 break;
	         }
	         else if (menu == 2) {
	        	 change = payment - (int)(order_quantity * cafe_latte * 1.1);
	         	 System.out.println("받을 거스름돈은 : " + change + "원 입니다.");
	         	 break;
	         }
	         else if (menu == 3) {
	        	 change = payment - (int)(order_quantity * americano * 1.1);
	         	 System.out.println("받을 거스름돈은 : " + change + "원 입니다.");
	         	 break;
	         }
	         else if (menu == 4) {
	        	 change = payment - (int)(order_quantity * fruit_juice * 1.1);
	         	 System.out.println("받을 거스름돈은 : " + change + "원 입니다.");
	         	 break;
	         }
	         else { 
	        	 System.out.println("1 ~ 4 중에서 하나를 입력해 주세요.");
	         	 menu = scan.nextInt();
	         	 error_input++;
	         }
        }
        // choice를 먼저 선택 받고, 그 이후에 계산식을 넣어서 풀어 써도 됨
         
        // total = ...
        // out = ...
         
        	 
        // 나라를 입력하면 수도가 출력되게 하자 
        // 한국=>서울,  중국=>베이징, 일본=>도쿄, 미국=>워싱턴 , 이외에는 데이터 없음 
        // (switch~case)
        System.out.print("나라 : ");
		String country = scan.next();
		String capital = "";

		for (int i = 0; true; i++) {
			switch(country) {
			case "한국" : capital = "서울";   break;
			case "중국" : capital = "베이징";	break;
			case "일본" : capital = "도쿄";	break;
			case "미국" : capital = "워싱턴";	break;
				default:
					System.out.println("데이터 없음 : 한국, 중국, 일본, 미국 중에 하나를 입력해 주세요.");
					country = scan.next();
					continue;
			}
			System.out.println(country + "의 수도는 " + capital + "입니다.");
			break;
		}
	}
}