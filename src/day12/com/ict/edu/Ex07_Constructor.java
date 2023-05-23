package day12.com.ict.edu;

public class Ex07_Constructor {
	// 생성자는 다른 생성자 or 메서드를 호출할 수 있다.???
	private String name = "홍길동";
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int sum = 0;
	private double avg = 0.0;
	private String grade = "";
	
	
	// 생성자
	public Ex07_Constructor() {
		// 생성자가 다른 생성자 호출할 수 있다.
		// 첫째줄에서만 호출해야 한다.
//		this.name = name;
//		Ex07_Constructor(70,80,70);
		// 생성자 이름을 쓰면 안 된다. (그대신 this 써야 한다) (메서드는 메서드 이름을 그대로 써도 됨!!)
		// this 랑 this()는 다르다. ★ this()는 생성자를 뜻한다!!
	}
	
	public Ex07_Constructor(String name) {
		this(70,80,70);
		this.name = name;
	}
	
	public Ex07_Constructor(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 총점 구하기
	public void gSum(int kor, int eng, int math) {
		sum = kor + eng + math;
		gAvg();
	}
	public void gSum() {
		sum = kor + eng + math;
	}
	// 평균 구하기
	public void gAvg() {
		avg = (int)(sum/3.0*10)/10.0;
		gGrade();
	}
	// 학점 구하기
	public void gGrade() {
		if (avg >= 90) {
			grade = "A";
		}else if (avg >= 80) {
			grade = "B";
		}else if (avg >= 70) {
			grade = "C";
		}else {
			grade = "F";
		}
		prn();
	}
	
	// 출력하는 메서드
	public void prn() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);
		System.out.println();
	}
	// prn 끝나고 나면, prn을 호출한 곳(gGrade)로 돌아감, 그리고 gGrade()로 돌아감, 결국 처음으로 돌아감!!
	// 한 메서드에서 한방에 호출하는 게 빠른지, 아니면 단계적으로 오는 게 빠른지 모름. 
	// 둘중에 편한 방법으로 사용하면 됨!!
	
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
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	
	
}
