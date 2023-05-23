package day05.com.ict.edu;

public class Ex03_for2 {
	public static void main(String[] args) {
		// 중첩 for 문 : for문 안에 또 다른 for문이 존재하는
		
		for (int i = 1; i < 4; i++) {
			System.out.println("실행문 - 1");
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + ", j = " + j);
			} // 안쪽 for문 끝
			System.out.println("실행문 - 2");
		} // 바깥쪽 for문 끝
		
		// 9 * 9단 만들기 할때 사용 (이중 for문)
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println("구구단을 외자. 구구단을 외자. (" + i + " 단)");
				System.out.println(i + " 곱하기 " + j + "은(는) : " + i * j + "입니다.");
			}
		}
		
		System.out.println("===============================");
		
		// 구구단 (1)
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(i + "단");
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + (i*j));
//			}
//		}
		
		// 구구단 (2)
		// 2 x 1 = 2	2 x 2 = 4	2 x 3 = 6
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <=9; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "  ");
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		
		// 구구단 (3)
		// 2 x 1 = 2	3 x 1 = 3	...	  9 x 1 = 9
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <=9; j++) {
				System.out.print(j + " * " + i + " = " + i * j + "  ");
			}
			System.out.println();
		}
		
		// ★★★ 행렬에서 축을 바꾸는 개념으로 이해하기 (i의 시작점과 j의 시작점을 맞바꾸기!!) 행과 열을 맞바꾸기.
		// 어디가 고정되는지를(천천히 변하는 부분) 먼저 보고 (=> 전체 for문), 자주 바뀌는 부분을 작업 (=> 안쪽 for문)
		// 실제로 쓰이는 for문은 회사에서 쓰는 건 더 쉬움!!
		
		// 다음 과제 (별찍기)
		for (int i = 1; i <= 9; i++) {
			System.out.println("★");
		}
		
		// while문은 for문과 유사하며, 조건비교에 만족할 때만 반복 처리하는 제어문.
		// while문은 while문 안에 증감식이 반드시 있음!
		// 초기식;
		
		// while(조건식){
		
		// 수행문;
		
		// 조건식;
		
		// while (true) { => 무한루프
		
		// if( 조건문 ) break;
		
		// } 
	}
}




