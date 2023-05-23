package day11.com.ict.edu;

public class Ex07_method {

	// void로 해서 만든다.
	int sum = 0;
	double avg = 0.0;
	String grade = "";
	
	// 총점을 구하는 메서드 (return 하지 않음. void 이므로)
	public void getSum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}
	
	// 평균을 구하는 메서드
	public void getAvg() {		// ()에 인자(입력값)를 굳이 넣을 필요가 없음 
		avg = (int)((sum/3.0)*10)/10.0;
	}
	
	public void getAvg(int sum) {
		avg = (int)((sum/3.0)*10)/10.0;
	}
	// ☆ 위 처럼 Avg는 두가지 방법으로 구할 수 있음!!! 정답은 없다.
	// ★ void는 일한 값을 저장할 변수가 반드시 있어야 함!! (return을 안 하기 때문에, 위쪽에 변수 선언해두기)
	
	// 학점을 구하는 메서드
	public void getGrade() {
		if (avg >= 90) {
			grade = "A학점";
		}else if (avg >= 80) {
			grade = "B학점";
		}else if (avg >= 70) {
			grade = "C학점";
		}else {
			grade = "F학점";
		}
	}
}
