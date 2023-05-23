package day04.com.ict.edu;

public class Prac_java {
	public static void main(String[] args) {
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000을 내고 먹었다.
		// 잔돈은 얼마인가? (부가세 10% 포함), 친구와 같은 음료만 선택 가능
		
		int cafe_mocha = 3500;
		int cafe_latte = 4000;
		int americano = 3000;
		int fruit_juice = 3500;
		int order_quantity = 2;
		int pay = 10000;
		int change = 0;
		int menu = 6;
		
		if (menu == 1) {
			change = pay - (int)((cafe_mocha * order_quantity) * 1.1);  
		}else if (menu == 2) {
			change = pay - (int)((cafe_latte * order_quantity) * 1.1);  			
		}else if (menu == 3) {
			change = pay - (int)((americano * order_quantity) * 1.1);  
		}else {
			change = pay - (int)((fruit_juice * order_quantity) * 1.1);  
		}
		System.out.println(change);
		
		// char k2가 대문자인지, 숫자인지, 기타문자인지 판별하자.	
		
		char k2 = '6';
		String result = "초기값";
		
		if (k2 >= 'A' && k2 <= 'Z') 	 result = "대문자";
//		else if (k2 >= 0) 			result = "숫자";
		else if (k2 >= '0' && k2 <= '9') result = "숫자";
		else							 result = "특수문자"; 
		
		System.out.println(result);
	}	
}



