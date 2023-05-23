package day03.com.ict.edu2;

public class Test02 {
	public static void main(String[] args) {
		// 2시간 40분 30초는 몇 초일까요?
		
		int hour = 2;
		int minute = 40;
		int second = 30;
		
		int seconds = hour * 3600 + minute * 60 + second; 
		System.out.println("정답 :" + seconds + "초 입니다.");
		
		System.out.println("=============================");
		/*
		 * int h = 2 * 60 * 60;
		 * int m = 40 * 60;
		 * int s = 30;
		 * 
		 * int result = h + m + s;
		 * System.out.println("2시간 40분 30초는 " + result + "입니다.");
		 * 
		*/
	}
}