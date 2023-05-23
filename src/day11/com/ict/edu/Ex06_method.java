package day11.com.ict.edu;

//import java.util.Scanner;

public class Ex06_method {
	
//	int num, kor, eng, math;
//	int students, sum, grade;
//	double avg;
	// 변수가 없으니 받아야 함, 저장X
//	Scanner scan = new Scanner(System.in);
//	
//	public int getStudents() {
//		System.out.println("학생 수를 입력하세요 : ");
//		students = scan.nextInt();
//		return students;
//	}
//	
//	public void getInfo() {
//
//		System.out.println("번호를 입력하세요 : ");
//		num = scan.nextInt();
//		System.out.println("국어 점수를 입력하세요 : ");
//		kor = scan.nextInt();
//		System.out.println("영어 점수를 입력하세요 : ");
//		eng = scan.nextInt();
//		System.out.println("수학 점수를 입력하세요 : ");
//		math = scan.nextInt();
//	}
	
	// 총점을 구하는 총점 리턴하는 메서드
	public int getSum(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
	}
	
	// 평균을 구하는 메서드
	public double getAvg(int sum) {
		double avg = (int)(sum/3.0*10)/10.0;
		return avg;
	}
	
	// 학점을 구하는 메서드
	public String getGrade(double avg) {
		String grade = "";
		if (avg >= 90)
			grade = "A학점";
		else if (avg >= 80)
			grade = "B학점";
		else if (avg >= 70)
			grade = "C학점";
		else
			grade = "F학점";
		return grade;
	}
	
	// 총점, 평균, 학점 구하고 출력하기

	
}
