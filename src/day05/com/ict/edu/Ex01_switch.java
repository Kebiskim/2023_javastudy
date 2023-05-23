package day05.com.ict.edu;

public class Ex01_switch {
	public static void main(String[] args) {
		/*
		   switch ~ case : 다중 if ~ else 문과 같은 조건문
		 * if문의 조건식은 boolean, 비교연산, 논리연산 즉 true, false일 때 사용
		 * switch문 int, char, String일 때만 사용 (long, float, double은 사용 불가)
		 * 형식) switch(인자값 = int, char, String){
		 * 	    case 조건값1 : 인자값과 조건값 1이 같을 때 수행할 문장; break;    // 이곳에는 원래 블록 안씀(여러 줄이더라도)
		 * 		case 조건값2 : 인자값과 조건값 2이 같을 때 수행할 문장;   
		 * 					  인자값과 조건값 2이 같을 때 수행할 문장; break;
		 * 	    case 조건값3 : 인자값과 조건값 3이 같을 때 수행할 문장; break;
		 * 		default : 조건식 1, 2, 3 모두 아닐 때 (나머지) 수행할 문장;, (default는 생략 가능) break; (break도 생략 가능)
		 * 
		 * ** 주의사항 : break가 없으면 break를 만날때까지 모든 실행문을 실행한다.
		 * 	  break의 역할은 실행중인 범위({ } 블록)를 벗어나는 역할을 한다.
		 * 	  default는 생략 가능하다.       
		 */ 
			
		// int k1이 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카노, 4이면 과일쥬스 를 출력하자.
	    int k1 = 2;
		String res = "";
		switch (k1) {
			case 1 : res = "카페모카";  break;
			case 2 : res = "카페라떼";  break;
			case 3 : res = "아메리카노"; break;
			case 4 : res = "과일쥬스";  break;
			// 위에서부터 순차적으로 (폭포식)으로 확인하지 않고, k1가 3이면 바로 case 3을 실행!!
			// 위의 경우, 맨 마지막꺼만 저장되어서 결과로 도출됨!
		}
		System.out.println("결과 : " + res);
		System.out.println("============================");
		int k2 = 1;
		switch (k2) {
			case 1 : System.out.println("결과 : 카페모카");
			case 2 : System.out.println("결과 : 카페라떼");
			case 3 : System.out.println("결과 : 아메리카노");
			case 4 : System.out.println("결과 : 과일쥬스");
			// break가 없으므로, 2 이후로 전부 다 실행하게 됨. (break 만날 때까지 아래로 전부 실행한다는 뜻)
		}
		
		// char k3이 A, a 이면 아프리카, B, b 이면 브라질, C, c이면 브라질, 나머지는 한국 
		char k3 = 'e';
		String res2 = "";
		switch (k3) {
			// case 'A' || 'a' : res2 = "아프리카"; break; // 이렇게 못 씀!!
			case 'A' : res2 = "아프리카"; break;
			case 'a' : res2 = "아프리카"; break;
			case 'B' : res2 = "브라질";  break;
			case 'b' : res2 = "브라질";  break;
			case 'C' : res2 = "캐나다";  break;
			case 'c' : res2 = "캐나다";  break;
			default  : res2 = "한국";    break; // 여기 break; 는 써도 되고, 안 써도 됨!!
		}
		System.out.println("국가 이름은 : " + res2);
		
//		switch (k3) {
//		// case 'A' || 'a' : res2 = "아프리카"; break; // 이렇게 못 씀!!
//		case 'A' : 
//		case '1' : 
//		case 'a' : res2 = "아프리카"; break;
//		case 'B' : 
//		case 'b' : res2 = "브라질";  break;
//		case 'C' : 
//		case 'c' : res2 = "캐나다";  break;
//		default  : res2 = "한국";    break; // 여기 break; 는 써도 되고, 안 써도 됨!!
		
		// String k4가 한국이면 서울, 중국이면 베이징, 일본이면 도쿄
		String k4 = "한국";
		String res3 = "";
	
		switch (k4) {
			case "한국" : res3 = "서울";   break;
			case "중국" : res3 = "베이징"; break;
			case "일본" : res3 = "도쿄";   break;
		}
		
		System.out.println(res3);
		
		// int k5가 3~5 : 봄, 6~8 : 여름, 9~11 : 가을, 12, 1, 2 : 겨울
		int k5 = 7;
		String res4 = "";
		
		switch (k5) {
			case 12 : 
			case 1 : 
			case 2 : res4 = "겨울";  break;
			case 3 : 
			case 4 : 
			case 5 : res4 = "봄";   break;
			case 6 : 
			case 7 : 
			case 8 : res4 = "여름"; break;
			case 9 : 
			case 10 : 
			case 11 : res4 = "가을"; break;
			// 한 묶음 (봄 끼리, 여름 끼리) 는 순서를 바꿔서 위로 올려도 상관 없음!!
		}
		System.out.println(res4);
		
		// switch에서 범위가 넓어지면 사용하지 말자 (if문 사용하자)
		// int k6의 정수가 90 이상이면 A학점, 80 이상이면 B학점, 70 이상이면 C학점, 나머지 F학점
//		int k6 = 85;
//		String res5 = "";
//		switch (k6) {
//			case 100:  	
//			case 99:
//			case 98:
//				...
//		}
		// 노가다 => case가 너무 많음.
		// 99~90 까지를 / 10 해서 9.9, 9.0 등으로 만든 다음에 int 만들어서 할 수는 있음!
		int k6 = 55;
		String res6 = "";
		switch ((int)(k6/10)) {
			case 10:
			case 9: res6 = "A학점"; break;
			case 8: res6 = "B학점"; break;
			case 7: res6 = "C학점"; break;
			default: res6 = "F학점";
		}
		System.out.println(res6);
	}
}
