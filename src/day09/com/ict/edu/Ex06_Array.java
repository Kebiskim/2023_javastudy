package day09.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요.");
		int students = scan.nextInt();
		
		String std[] = new String[students];
		int kor[] 	 = new int[students];
		int eng[]  	 = new int[students];
		int math[]	 = new int[students];
		int sum[]  	 = new int[students];
		double avg[] = new double[students];
		int rank[] 	 = new int[students];
		
		for (int i = 0; i < students; i++) {
			System.out.println((i+1) + "번째 학생 이름을 입력하세요.");
			std[i] = scan.next();  
			}
		
		for (int i = 0; i < students; i++) {
			System.out.println((i+1) + "번째 학생의 국어 점수를 입력하세요.");
			kor[i] = scan.nextInt();  
			}
		
		for (int i = 0; i < students; i++) {
			System.out.println((i+1) + "번째 학생의 영어 점수를 입력하세요.");
			eng[i] = scan.nextInt();  
			}
		
		for (int i = 0; i < students; i++) {
			System.out.println((i+1) + "번째 학생의 수학 점수를 입력하세요.");
			math[i] = scan.nextInt();  
		}
		
		// 총점 계산 하기
		for (int i = 0; i < std.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
		}
		
		// 평균 계산 하기
		for (int i = 0; i < std.length; i++) {
			avg[i] = ((int)(sum[i]/3.0*10)/10.0);
		}
		
		// 순위 계산 하기
		for (int i = 0; i < std.length; i++) {
			for (int j = 0; j < std.length; j++) {
				if (i == j) continue; 			// sum[i]랑 sum[j] 비교가 아님!! // continue를 위에 줄에 넣음으로써,
				else if (sum[i] < sum[j])		// 아래 줄 코드 실행 x => 보다 효율적인 코드. 예외처리를 먼저 하는 것.
					rank[i]++;
			}
		}		

		System.out.println("이름\t합계\t평균\t순위");
		for (int i = 0; i < std.length; i++) {
			System.out.print(std[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.println(rank[i] + "\t");
		}
		
//		String[] p1 = {"홍길동", "90", "80", "80.0"} => 이런 형식은 너무 번거로워서 실제로는 잘 안함. 
//		굳이 하려면 class를 만들어서 쓰기!! String 받아서 int 옮기고, 다시 String 옮기고.. 
		
		// 정렬을 할 줄 알면, 최대값 최소값을 따로 구할 필요가 없음(자동으로 오름차순 됨)
		
		// 다차원 배열 : 1차원 배열 안에, 값이 들어가는 것이 아니라, 다른 배열의 "주소" 가 들어감.
		// su[] 안에 k1[]의 주소값, k2[]의 주소값, k3[]의 주소값, k4[]의 주소값이 들어가고,
		// k1[], k2[], k3[], k4[] 안에 ★★실제 값들이 들어감!!
		// su[0] => k1[]으로 감. su[0][0] => k1의 [0] 값이 나옴.
		// 3차원도 마찬가지!! 주소값 (or 생성ID값)이 저장되지만, 게임 아니면 3차원 배열까지 갈 일은 거의 없음!!
		
		// 가변 길이. 다차원 배열은, 고정 길이와, 가변 길이로 나눠짐!!
		// new int[2][3] => 1차원 배열이 두개, 2차원 배열이 3개, 총 6개의 값이 있다는 뜻!
		// 가변 길이 => new int[2][ ] (뒤에 숫자는 없어도 오류가 아님.)
		
		
		
	}
}