package day03.com.ict.edu2;

public class Test_prac {
	public static void main(String[] args) {
		// 3989초
		int time = 3989;
		int h = time / (60 * 60);
		int res = time % (60 * 60);
		int m = res / 60;
		int s = res % 60;

		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
	}
}
