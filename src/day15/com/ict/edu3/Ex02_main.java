package day15.com.ict.edu3;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_Calc calc = new Ex02_Calc();
		
		// 프로모션 디모션 헷갈리면 자료형 무조건 맞추면 되고, 안 맞으면 형변환 하면 됨!!
		int s1 = (int)(calc.plus(9, 3));
		System.out.println(s1);
		
		double s2 = calc.minus(9, 3);
		System.out.println(s2);
		
		double s3 = calc.mul(9, 3);
		System.out.println(s3);
		
		double s4 = calc.div(9, 3);
		System.out.println(s4);
		
		// 계산할 때, 0으로 나누면 오류나도록 처리해줘야 함!
	}
}
