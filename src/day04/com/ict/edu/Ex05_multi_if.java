package day04.com.ict.edu;

public class Ex05_multi_if {
	public static void main(String[] args) {
		// 다중 if문
		// 형식) if(조건식1){
		//         조건식1이 참일 때 실행할 문장;
		//         조건식1이 참일 때 실행할 문장;
		//      }else if(조건식2){
		//         조건식1이 거짓이면서 조건식2가 참일 때 실행할 문장;
		//         조건식1이 거짓이면서 조건식2가 참일 때 실행할 문장;
		//      }else if(조건식3){
		//         조건식1,2가 거짓이면서 조건식3이 참일 때 실행할 문장;
		//         조건식1,2가 거짓이면서 조건식3이 참일 때 실행할 문장;
		//      }else{
		//         조건식1,2,3 모두 거짓인 경우;
		//      }
		
		// int k1의 점수가 90 이상이면 A학점, 80 이상이면 B학점, 70 이상이면 C학점, 나머지 F학점
//		int k1 = 75;
//		String score = "학점(초기값)";
//		if (k1 >= 90) {
//			score = "A학점";
//		}else if (k1 >= 80) {
//			score = "B학점";
//		}else if (k1 >= 70) {
//			score = "C학점";
//		}else {
//			score = "F학점";
//		}
//		System.out.println(score);
//		
		int k1 = 75;
		String score = "학점(초기값)";
		
		if      (k1 >= 90) score = "A학점";
		else if (k1 >= 80) score = "B학점";
		else if (k1 >= 70) score = "C학점";
		else  			   score = "F학점";
		
		System.out.println(score);
//		
//		// char k2가 대문자인지, 숫자인지, 기타문자인지 판별하자.
//		char k2 = 12353;
//		String res = "문자형태(초기값)";
//		if (k2 >= 'A' && k2 <= 'Z') {
//			res = "대문자";
////		}else if (k2 >= '0' && k2 <= '9') {   // 숫자 ASCII 코드?
//		}else if (k2 >= 0) {    // 0 이상일 경우 숫자!
//			res = "숫자";
//		}else {
//			res = "기타문자";
//		}
//		System.out.println(res);
		
		// char k2가 대문자인지, 숫자인지, 기타문자인지 판별하자.
		char k2 = '6';
		String res = "문자형태(초기값)";
		
		if      (k2 >= 'A' && k2 <= 'Z') res = "대문자";
		else if (k2 >= 0)                res = "숫자";
		else 	  						 res = "기타문자";
		
		System.out.println(res);
//		
//		// char k3이 A, a 이면 아프리카, B, b 이면 브라질, C, c 이면 캐나다, 나머지는 한국
//		char k3 = 'd';
//		String res2 = "국가이름(초기값)";
//		if (k3 == 'A' || k3 == 'a') {
//			res2 = "아프리카";
//		}else if (k3 == 'B' || k3 == 'b') {
//			res2 = "브라질";
//		}else if (k3 == 'C' || k3 == 'c') {
//			res2 = "캐나다";
//		}else {
//			res2 = "한국";
//		}
//		System.out.println(res2);
		
		// char k3이 A, a 이면 아프리카, B, b 이면 브라질, C, c 이면 캐나다, 나머지는 한국
		
		char k3 = 'd';
		String res2 = "국가이름(초기값)";
		
		if      (k3 == 'A' || k3 == 'a') res2 = "아프리카";
		else if (k3 == 'B' || k3 == 'b') res2 = "브라질";
		else if (k3 == 'C' || k3 == 'c') res2 = "캐나다";
		else 							 res2 = "한국";

		System.out.println(res2);
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000을 내고 먹었다.
		// 잔돈은 얼마인가? (부가세 10% 포함), 친구와 같은 음료만 선택 가능
		int menu_1 = 3500;
		int menu_2 = 4000;
		int menu_3 = 3000;
		int menu_4 = 3500;
		int pay = 10000;
		int change = 0;
		int total = 2;
		int order = 2;
		
		if (order == 1) {
			change = pay - (int)((menu_1 * total) * 1.1);
		}else if (order == 2) {
			change = pay - (int)((menu_2 * total) * 1.1);
		}else if (order == 3) {
			change = pay - (int)((menu_3 * total) * 1.1);
		}else if (order == 4) {
			change = pay - (int)((menu_4 * total) * 1.1);
		}
		System.out.println("거스름돈은 " + change + " 원 입니다.");
		
//		
//		int menu = 3;
//		int in = 10000;
//		int su = 2;
//		
//		int dan = 0;
//		String drink = "";
//		int total = 0;
//		int vat = 0;
//		int out = 0;
//		
//		// 여기서는 else를 안 쓰는 것이 맞음(시험문제 상), but 실제로는 확장성 고려하여 else를 넣어줘야 함.
//		// refactoring : 결과 나왔을 때, 중복된 것을 지워서 중복되지 않게 쪼개는 것!
//		if(menu == 1) {
//			drink = "카페모카";
//			dan = 3500;
////		}else if (menu == 2) {
//			drink = "카페라떼";
//			dan = 4000;
////		}else if (menu == 3) {
//			drink = "아메리카노";
//			dan = 3000;
////		}else if (menu == 4) {
//			drink = "과일쥬스";
//			dan = 3500;
//		}
//		
//		int total = dan * su;
//		int vat = (int) (total * 0.1);
//		int out = in - (total + vat);
		
//		System.out.println("선택메뉴 : " + drink);
//		System.out.println("잔돈 : " + out);
//		
		
		int menu = 3;
		int in = 10000;
		int su = 2;
		int dan = 0;
		
		total = 0;
		int vat = 0;
		int out = 0;
		
		// 여기서는 else를 안 쓰는 것이 맞음(시험문제 상), but 실제로는 확장성 고려하여 else를 넣어줘야 함.
		// refactoring : 결과 나왔을 때, 중복된 것을 지워서 중복되지 않게 쪼개는 것!
		if(menu == 1) {
			dan = 3500;
			String dring = "카페모카";
			total = dan * su;
			vat = 0;
			out = 0;
			
		}else if (menu == 2) {
			dan = 4000;
			String dring = "카페라떼";
			total = dan * su;
			vat = 0;
			out = 0;
			
		}else if (menu == 3) {
		}else if (menu == 4) {
		}		
	}
}
