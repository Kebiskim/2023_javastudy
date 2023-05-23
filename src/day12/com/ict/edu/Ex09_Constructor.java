package day12.com.ict.edu;

public class Ex09_Constructor {
	// 생성자
	// Ex04를 보고 변경해서 작성.
	// 기본생성자 없고, 이름, 국어, 영어, 수학 받는 생성자 만들기
	// sum, avg, grade 한번에 처리하기 (생성자에서 한방에 처리)
	// rank는 한번에 못 구하고, 따로 구해야 함!! (한사람의 정보만 가지고 있기 때문)
	// 한번에 하고 싶으면, 나중에 java가 편해질 때, 각각의 요소들을 배열로 만들어서 할 수는 있음.
	
	private String name = "";
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int sum = 0;
	private double avg = 0.0;
	private String grade = "";
	private int rank = 0;
	
	public Ex09_Constructor(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = getSum();
		this.avg = getAvg();
		this.grade = getGrade();
	}
	
	
	// 임시로 넣는 생성자
//	public Ex09_Constructor() {
//		prn();
//	}

	public Ex09_Constructor() {
		prn();
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		sum = kor + eng + math;
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		avg = (int)(sum/3.0*10)/10.0;
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getGrade() {
		if (avg >= 90) {
			grade = "A";
		}else if (avg >= 80) {
			grade = "B";
		}else if (avg >= 70) {
			grade = "C";
		}else {
			grade = "F";
		}
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void prn() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);
		System.out.println();
	}
	
	
}
