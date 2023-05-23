package day09.com.ict.edu;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12_Array_01 {
	public static void main(String[] args) {
		// *팀별 과제
		// 학생수, 번호, 국어, 영어, 수학 점수 입력받기 (스캐너)>> Ex06 참고
		//		1	2	3	4	5(총점)	6(평균)	7(학점)	8(순위)
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요 : ");
		int num = scan.nextInt();
		
		// 번호, 국어, 영어, 수학, 총점, 평균, 학점, 순위(초기값 지정)
		int[][]arr = new int [num][8];
		int count = 0;
		int kor = 1;
		int eng =2;
		int math =3;
		int sum = 4;
		double avg = 5;
		int hak = 6;
		int rank = 7;
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <4; j++) {
				if (j==count) {
				System.out.println("번호를 입력하세요 : ");
				arr[i][count] = scan.nextInt(); 
				} else if (j==kor) {
					System.out.println(arr[i][count]+"번 학생 국어 점수 입력하세요 : ");
					arr[i][kor] = scan.nextInt(); 
				} else if (j==eng) {
					System.out.println(arr[i][count]+"번 학생 영어 점수 입력하세요 : ");
					arr[i][eng] = scan.nextInt();
				} else if (j==math) {
					System.out.println(arr[i][count]+"번 학생 수학 점수 입력하세요 : ");
					arr[i][math] = scan.nextInt();
				}
			}
		}
		
		// 총점(5), 평균(6), 학점(7) 구하기
		//총점, 평균
		for (int i = 0; i < num ; i++) {
			arr[i][sum]=arr[i][kor]+arr[i][eng]+arr[i][math];
			arr[i][5]= (int)(((arr[i][sum])/3.0*10)/10.0);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][5]>=90) {	// 평균이 5이어서 [i][5]
				arr[i][hak] = 'A';
			} else if (arr[i][5]>=80) {
				arr[i][hak] = 'B';
			} else if (arr[i][5]>=70) {
				arr[i][hak] = 'C';
			} else if (arr[i][5]>=60) {
				arr[i][hak] = 'D';
			} else {
				arr[i][hak] = 'F';
			}
		}
		
		
	
		// 순위
		for (int i = 0; i < arr.length; i++) {
			arr[i][rank]=1; // 초기값 1로 지정
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][sum]==arr[j][sum]) continue;
				if (arr[i][sum] < arr[j][sum]) {
					arr[i][rank]++;
			}
		}
		}
		// 순위로 오름차순 정렬 
		int [][] tmp = new int[num][8];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length; j++) {
				 if (arr[i][rank] > arr[j][rank]) {
		                tmp[i] = arr[i];
		                arr[i] = arr[j];
		                arr[j] = tmp[i];
			}
		}
		}
		// 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\t순위");	
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			System.out.print(arr[i][count]+"\t");
			System.out.print(arr[i][kor]+"\t");
			System.out.print(arr[i][eng]+"\t");
			System.out.print(arr[i][math]+"\t");
			System.out.print(arr[i][sum]+"\t");
			System.out.print(arr[i][5]+"\t");
			System.out.print((char)(arr[i][hak])+"\t");
			System.out.print(arr[i][rank]+"\t");
			System.out.println();
		}
	
		System.out.print(arr[0].length);	
		
	}
	}

