package day15.com.ict.edu3;

// ★ 아래부분 시험
// 추상클래스, 인터페이스를 부모클래스로 가지고 있다. (순서 : extends, implements 순)
// extends는 같은 종류끼리
public class Ex02_Calc extends Ex02_Oper implements Ex02_Add, Ex02_Sub{
	
	@Override
	public double minus(double s1, double s2) {
		return s1-s2;
	}
	
	@Override
	public double plus(double s1, double s2) {
		return s1+s2;
	}
	
	@Override
	public double mul(double s1, double s2) {
		return s1*s2;
	}
	
	@Override
	public double div(double s1, double s2) {
		return s1/s2;
	}
}
