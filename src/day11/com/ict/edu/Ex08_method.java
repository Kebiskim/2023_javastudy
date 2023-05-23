//package day11.com.ict.edu;
//
//import java.util.Scanner;
//
//public class Ex08_method {
//	// 저장 적인 측면에서 다른 자료형을 여러개 저장할 수 있는 것은, 변수도, array도 아니고 class뿐!! 
//	String name = "";
//	int kor = 0;
//	int eng = 0;
//	int math = 0;
//	int sum = 0;
//	double avg = 0.0;
//	String grade = "";
//	int rank = 0;
//	// 나중에는 위에 정보들은 private으로 바꾸기 때문에, 변경도 끄집어내는 것도 못하게 됨.
//	
//	Scanner scan = new Scanner(System.in);
//	
////	총점, 평균, 학점을 구하는 메서드가 있는 클래스를 만들고 
////	이름, 국어, 영어, 수학를 받아서 
////	총점, 평균, 학점, 순위를 구하고 
////	순위 기준으로 오름차순으로 정렬하여 
////	출력하는 main 메서드를 가지는 클래스를 만들어라 
////	단, 처리는 2차원배열을 이용해라
//	
//	// 집어넣는 메서드 
//	
//	int su = scan.nextInt();
//	int components = 8;
//	double[][] arr = new double[su][components];
//	
//	for (int i = 0; i < arr.length; i++) {
//		// * for문 실행될 때마다 한사람의 정보를 담을 수 있는 배열을 만들자!!
//		// ★ for문 안에서는, 선언이 여러번 된다!! (int i = 0; 초기화와 똑같음)
//		// 밖에서 선언하면 오류남!!??
//		double[] p = new double[components];
//		
//		// 키보드로 번호, 국어, 영어, 수학 받기
//		System.out.println("번호 : ");
//		p[0] = scan.nextInt();
//		
//		System.out.println("국어 : ");
//		p[1] = scan.nextInt();
//		
//		System.out.println("영어 : ");
//		p[2] = scan.nextInt();
//		
//		System.out.println("수학 : ");
//		p[3] = scan.nextInt();
//		
//		// 합계
//		p[4] = p[1] + p[2] + p[3];
//		
//		// 평균
//		p[5] = (int)(p[4] / 3.0 * 10) / 10.0;
//		
//		if (p[5] >= 90) {
//			p[6] = 'A';
//		}else if(p[5] >= 80) {
//			p[6] = 'B';
//		}else if(p[5] >= 70) {
//			p[6] = 'C';
//		}else {
//			p[6] = 'F';
//		}
//		
//		// 순위 초기화
//		p[7] = 1;
//		
//		// 다차원배열에 넣자
//		arr[i] = p;
//	}
//	
//	// 순위
//	for (i = 0; i < arr.length; i++) {
//		for (int j = 0; j < arr.length; j++) {
//			// if (i == j) continue; (생략가능)
//			if (arr[i][4] < arr[j][4]) {
//				arr[i][7]++;
//			}
//		}
//	}
//	
//	// 순위로 오름차순 정렬
//	// 자리를 바꾸기 위해서 임시
//	double[] tmp = new double[8];
//	for (i = 0; i < arr.length; i++) {
//		for (int j = i+1; j < arr.length; j++) {
//			if (arr[i][7] > arr[j][7]) {
//				tmp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = tmp;
//			}
//		}
//	}
//	
//	// 출력
//	System.out.println("번호\t총점\t평균\t학점\t순위");
//	for (i = 0; i < arr.length; i++) {
//		for (int j = 0; j < arr[i].length; j++) {
//			// 국, 영, 수는 출력에서 제외
//			if (j == 1 || j == 2 || j == 3) continue;
//			if (j == 6) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			else if (j == 6) {
//				System.out.print((char)(arr[i][j]) + "\t");
//			}else {
//				System.out.print((int)(arr[i][j]) + "\t");
//			}
//		}
//		System.out.println();
//	}
//}
//}
//
//	
//
