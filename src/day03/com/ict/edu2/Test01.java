package day03.com.ict.edu2;

public class Test01 {
	public static void main(String[] args) {
		// 이름이 홍길동인 사람의 점수가
		// 국어 90, 영어 80, 수학 80점이다.
		// 총점과 평균을 구하자.
		// 화면 출력은 이름, 총점, 평균만 출력하자.
		// (단, 평균은 소수점 첫째자리까지 구하자.)
		
		String name = "홍길동" ;
		int kor = 90 ;
		int eng = 80 ;
		int math = 80 ;
		
		int total = kor + eng + math ;
		double avg = (double)(kor + eng + math) / 3.0 ;  // 가운데 total로 변경 가능
		double avg_first = (int)(avg * 10) / 10.0 ;		 // Q. 한줄로 쓸 수 있는 방법?? Round가 한자리만 표시돼서 불편하게 함?
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + avg_first + "점");
		
		System.out.println("=============================");
		
		// 입력정보 판단 : 원하는 정보를 얻기 위한 정보 (재료)
		/*
		 * String name = "홍길동";
		 * int kor = 90;
		 * int eng = 80;
		 * int math = 80;
		 * 
		 * int sum = kor + eng + math;
		 * double avg = (double)(sum) / 3;
		 * double avg2 = (int)(avg * 10) / 10.0;
		 * 
		 * 이름, 총점, 평균  
		 */
	}
}