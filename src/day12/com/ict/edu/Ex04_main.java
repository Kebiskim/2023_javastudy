//package day12.com.ict.edu;
//
//import java.util.Scanner;
//
//public class Ex04_main {
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		// 5명의 이름, 국어, 영어, 수학 입력
//		// 이름, 총점, 평균, 학점, 순위 구하기
//		// 순위 기준 오름차순 출력
//		
//		System.out.println("학생 수를 입력하세요 : ");
//		int su = scan.nextInt();
//		
//		int sum = 4;
//		int avg = 5;
//		int components = 8;
//		
//		double arr[] = new double[components];
//		
//		for (int i = 0; i < su; i++) {
//	
//			Ex04_get_set person = new Ex04_get_set();
//			double[] p = new double[components];
//			
//			// 키보드로 번호, 국어, 영어, 수학 받기
//			System.out.println("이름 : ");
//			person.setName(scan.next());
//			
//			System.out.println("국어 : ");
//			person.setKor(scan.nextInt()); 
//			
//			System.out.println("영어 : ");
//			person.setEng(scan.nextInt());
//			
//			System.out.println("수학 : ");
//			person.setMath(scan.nextInt());
//			
//			// 합계
//			person.setSum(person.getKor() + person.getEng() + person.getMath());
//			
//			// 평균
//			person.setAvg((int)(person.getSum()/3.0*10)/10.0);
//			
//			if (person.getAvg() >= 90) 
//				person.setGrade("A학점");
//			else if (person.getAvg() >= 80)
//				person.setGrade("B학점");
//			else if (person.getAvg() >= 70)
//				person.setGrade("C학점");
//			else
//				person.setGrade("F학점");
//			
//			
//			// 순위 초기화
//			person.setRank(1);
//			
//			// 다차원배열에 넣자
//			arr[i] = p;
//		}
//		
//		// 순위
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				// if (i == j) continue; (생략가능)
//				if (arr[i].getSum() < arr[j].getSum()) {
//					arr[i].setRank(arr[i].getRank()+1);
//				}
//			}
//		}
//		
//		// 순위로 오름차순 정렬
//		// 자리를 바꾸기 위해서 임시
//		double[] tmp = new double[8];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr[i].getRank() > arr[j].getRank()) {
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		
//		// 출력
//		System.out.println("번호\t총점\t평균\t학점\t순위");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i].getName() + "\t");
//			System.out.println(arr[i].getSum() + "\t");
//			System.out.println(arr[i].getAvg() + "\t");
//			System.out.println(arr[i].getGrade() + "\t");
//			System.out.println(arr[i].getRank());
//			System.out.println();
//	}
//	}}
