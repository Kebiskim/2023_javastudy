package day06.com.ict.edu2;

public class Test_1 {
	public static void main(String[] args) {
		String name = "홍길동";
		int korean = 95;
		int english = 85;
		int math = 85;
		int total = korean + english + math;
		int avg_cal = (int)((double)(total / 3.0) * 10);		
		double avg = avg_cal / 10.0; 
		
		System.out.println("이름은 : " + name + " 이고, 총점은 : " + total + " 점 이고, 평균은 : " + avg + " 점 입니다.");
		
		
		int seconds = 3989;
		int hour = seconds / (60 * 60);
		int minute = (seconds % (60 * 60)) / 60;
		int second = (seconds % (60 * 60)) % 60;
		
		System.out.println(seconds + "초는 : " + hour + "시간, " + minute + "분, " + second + "초 입니다.");
		
		int cafe_mocha = 8500;
		int cups = 2;
		int pay = 20000;
		int change = pay - (int)(cafe_mocha * cups * 1.1);
		
		System.out.println("잔돈은 : " +  change + " 원입니다.");
		
		
		int k1 = 4;
		String res = (k1 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(k1 + "은(는) : " + res + "입니다.");
		
		char k2 = 'a';
		String str = "";
		if (k2 >= 'A' && k2 <= 'Z')
			str = "대문자";
		else
			str = "대문자 아님";
		
		System.out.println(k2 + "는 : " + str);
		
		int overtime = 8;
		int pay_2 = 9620;
		int worktime = 10;
		int overtime_pay = (overtime * pay_2) + (int)((worktime - overtime) * pay_2 * 1.5);
		
		if (worktime > overtime)
			System.out.println(overtime_pay);
		else
			System.out.println("받을 돈은 : " + worktime * pay_2 + "입니다.");
	}
}
