package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int kor, eng, math; 
		String name = "";
		kor = 0;
		eng = 0;
		math = 0;
		int components = 8;
		
		System.out.println("학생 수를 입력하세요 : ");
		int students = scan.nextInt();
		for (int i = 0; i < students; i++) {
			System.out.println(i+1 + "번째 학생 이름을 입력하세요 : ");
			name = scan.next();
			System.out.println(i+1 + "번째 학생 국어 성적을 입력하세요 : ");
			kor = scan.nextInt();
			System.out.println(i+1 + "번째 학생 영어 성적을 입력하세요 : ");
			eng = scan.nextInt();
			System.out.println(i+1 + "번째 학생 수학 성적을 입력하세요 : ");
			math = scan.nextInt();
		}
		
//		int students = scan.nextInt();
//		String name = scan.next();
//		int kor, eng, math; 
//		kor = scan.nextInt();
//		eng = scan.nextInt();
//		math = scan.nextInt();
//		int components = 8;
//		// 위에 scan.nextInt() 선언하면 사용 못함. (입력을 다 받아버림)
		
		String name_grade[][] = new String[students][2];
		double scores[][] = new double[students][6];
		
		System.out.println("===== 결과 =====");
		for (int i = 0; i < students; i++) {
			Ex09_Constructor c1 = new Ex09_Constructor(name, kor, eng, math);
			name_grade[i][0] = name;
			name_grade[i][1] = c1.getGrade();
			scores[i][0] = c1.getSum();
			scores[i][1] = c1.getAvg();			
			scores[i][2] = c1.getRank();
		}
		// 순위
		for (int i = 0; i < students; i++) {
			for (int j = 0; j < students; j++) {
				if (scores[i][0] > scores[j][0])
					scores[i][2]++;
			}
		}
		
		// 정렬
//		// 임시저장용
//		Ex09_Constructor tmp_3 = new Ex09_Constructor();
//		// 인자가 있는 생성자를 사용해도 상관없다!!
//		Ex09_Constructor tmp_3 = new Ex09_Constructor("ppp", 40, 40, 40);
		
		String tmp_2[] = new String[2];
		double tmp[] = new double[6];
		for (int i = 0; i < students; i++) {
			for (int j = i + 1; j < students-1; j++) {
				if (scores[i][0] < scores[j][0])
					tmp = scores[i];
					scores[i] = scores[j];
					scores[j] = tmp;
					tmp_2 = name_grade[i];
					name_grade[i] = name_grade[j];
					name_grade[j] = tmp_2;
			}
		}
		
		for (int i = 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp.length; j++) {
				System.out.print(name_grade[i][0] + "\t");
				System.out.print(name_grade[i][1] + "\t");
				System.out.print(scores[i][0] + "\t");
				System.out.print(scores[i][1] + "\t");
				System.out.print(scores[i][2] + "\t");
				System.out.println();
			}
		}
		
	}
}
