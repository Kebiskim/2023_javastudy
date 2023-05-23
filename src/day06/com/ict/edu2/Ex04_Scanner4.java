package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex04_Scanner4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("원하는 반복 횟수 : ");
//		int rep = scan.nextInt();
//		System.out.println("원하는 단어 : ");
//		String str = scan.next();
//		
//		// for문 만들 때는 0부터 만듬 => 배열 때문이기도 하지만, 3 등의 수를 집어넣었을 때 해당 횟수만큼 반복하기 위해.
//		// 현업에서는 0부터 시작함! 1부터 쓰기보다는.
////		for (int i = 0; i < rep; i++) {
////			System.out.println(str);
////		}
//		
////		int i = 0;
////		while (i < rep) {
////			
////			i++;
////		}
////		// while 문의 기본 형태!!
//		
//		int i = 0;
//		while (i < rep) {
//			System.out.println(str);
//			i++;
//		}
//		
		
//		원하는 회수를 입력 받고 
//		숫자를 입력 받아서 
//		입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
		
		System.out.println("원하는 횟수를 입력하세요 : ");
		int rep_2 = scan.nextInt();
		
		for (int i = 0; i < rep_2; i++) {
			System.out.println("숫자를 입력하세요.");
			int num = scan.nextInt();
			if (num % 2 == 0) 
				System.out.println("해당 숫자는 짝수입니다.");
			else
				System.out.println("해당 숫자는 홀수입니다.");
			}
			System.out.println("홀짝 판독기를 종료합니다.");
			
			
		System.out.println("이름을 입력하세요 : ");
		
		
//
//		이름, 국어, 영어, 수학를 입력 받아서 
//		총점, 평균, 학점을 구하고 
//		이름, 총점, 평균, 학점을 출력하는 코딩 
//		(평균은 소숫점 첫째자리까지 구하자)
//
//
//		첫번째 숫자 받기
//		두번째 숫자 받기
//		연산자 받기("1 => + \n 2 => - \n 3 => * \n 4 =>  / \n>>>>   ")
		// 1번 누르면 더하기, 2번 누르면 빼기, 3번 누르면 곱하기, 4번 누르면 나누기 (계산기!!)
		// 나누기의 경우에는, 소숫점 있기 때문에. 결과는 모두 소수점 있게 (double형)으로 저장!!
	}
}