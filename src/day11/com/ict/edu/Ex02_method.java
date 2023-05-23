package day11.com.ict.edu;

public class Ex02_method {
	String name = "홍길동";
	int kor = 90;
	int eng = 80;
	int math = 80;
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	// 모두 void
	// 총점 구하는 메서드
	public void getSum() {
		sum = kor + eng + math;
		System.out.println("총점 : " + sum);
		// ★ 안에서 출력까지 전부 해버리려면, 굳이 밖에서 sum 전역변수를 안 만들어도 됨!!
	}
	
	// 평균 구하는 메서드
	public void getAvg() {
		avg = sum / 3.0;
		System.out.println("평균 : " + avg);
	}
	
	// 학점 구하는 메서드
	public void getHak() {
		if (avg >= 90) {
			hak = "A";
		}else if (avg >= 80) {
			hak = "B";
		}else if (avg >= 70) {
			hak = "C";
		}else {
			hak = "F";
		}
		System.out.println("학점 : " + hak);
	}
}

// 계산하려는 sum 등의 변수를 메서드 안에서 선언하면 오류 남 (메서드 끝나면 사라짐). 그래서 초기화를 밖에 따로 해야함.
// 만들고 나서, 메인 없으니까 실행 안됨 => 메인 만들어줘야 함.