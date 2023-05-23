package day11.com.ict.edu;

import java.util.Scanner;

public class Ex06_main {
	public static void main(String[] args) {
//		Ex06_method t1 = new Ex06_method();
		
//		int students, sum, grade;
//		double avg;
//		
//		
//		students = t1.getStudents();
//		double arr[][] = new double[students]
//		
//		for (int i = 0; i < students; i++) {
//			t1.getInfo();
//		}
//		
//		
//		sum = t1.returnSum();
//		
//		avg = t1.returnAvg();
//		
//		grade = t1.returnGrade();
		
		
		Scanner scan = new Scanner(System.in);
		int components = 5;
		String[] name = new String[components];
		int[] kor = new int[components];
		int[] eng = new int[components];
		int[] math = new int[components];
		int[] sum = new int[components];
		double[] avg = new double[components];
		String[] grade = new String[components];
		
		// 특정 메서드 호출해서 사용만 하고, 저장 안할 경우에는 밖에다가 객체 만들고 호출하면 됨!!
		
		Ex06_method ex06 = new Ex06_method();
		// ★ static 이 아닌 instance기 때문에, 위에 객체 만드는 순간 같이 만들어짐!!
		
		for (int i = 0; i < grade.length; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
			
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			
			System.out.print("수학 : ");
			math[i] = scan.nextInt();
			
			// 총점
			sum[i] = ex06.getSum(kor[i], eng[i], math[i]);
			
			// 평균
			avg[i] = ex06.getAvg(sum[i]);
			
			// 학점
			grade[i] = ex06.getGrade(avg[i]);
		}
		
		
		// 출력
		for (int i = 0; i < grade.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.println(grade[i]);
		}
		
		
		
		// 5명의 이름, 국어, 영어, 수학을 입력 받아서
		// 이름, 총점, 평균, 학점 구하고
		// 출력 하자
		
		// 입력 받기
		
		// 총점 구하기
		
		// 평균 구하기
		
		// 학점 구하기
		
		
		
		// 출력하기
		
		
		
	}
}
