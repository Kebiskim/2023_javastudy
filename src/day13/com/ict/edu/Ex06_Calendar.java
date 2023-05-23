package day13.com.ict.edu;

import java.util.Calendar;

public class Ex06_Calendar {
	public static void main(String[] args) {
		// Calendar 클래스 : new 예약어를 사용하지 않고 getInstance()를 사용하면 현재 PC 날짜와 시간으로 설정됨
		Calendar now = Calendar.getInstance(); // API에 static이기 때문에, method. 으로 가져온 것.
		System.out.println(now); // 1900년 1월 1일 00:00:00 부터 시작해서 지금까지 초를 계산한 것 => 1683881171735
		// DB 배울 때 해당 숫자를 집어넣을 일이 있음!!
		System.out.println(now.getTime());
		System.out.println(now.getTimeZone());
		
		System.out.println();
		System.out.println(now.AM); // static final => static이고 상수, 아무데서나 부를 수 있음.
		System.out.println(now.get(Calendar.YEAR) + "년"); // static final => static이고 상수, 아무데서나 부를 수 있음.
		System.out.println(now.get(Calendar.MONTH)+1 + "월"); // static final => static이고 상수, 아무데서나 부를 수 있음.
		System.out.println(now.get(Calendar.DATE) + "일"); 
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "일"); 
		System.out.println(now.get(Calendar.HOUR) + "시");			// 12시간제 (오전/오후)가 필요함 
		System.out.println(now.get(Calendar.HOUR_OF_DAY) + "시"); 	// 
		System.out.println(now.get(Calendar.MINUTE) + "분"); 
		System.out.println(now.get(Calendar.SECOND) + "분"); 
		System.out.println(now.get(Calendar.MILLISECOND) + "밀리초"); 
		
		// ctrl + space 눌렀을 때 위에 뜨는 sf => 상수임.
		// AM = 0, PM = 1 구하기
		int res = now.get(Calendar.AM_PM);
		if (res==0) {
			System.out.println("AM " + now.get(Calendar.HOUR) + "시");
		}else if (res==1) {
			System.out.println("PM " + now.get(Calendar.HOUR) + "시");
			
		}
		
		// 요일 (1(일요일)...7(토요일)) => 0부터 시작하는 것이 아님!! Date와 다르다.
		res = now.get(Calendar.DAY_OF_WEEK);
		switch (res) {
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;
		}
		
		// 날짜 변경 (month는 0부터 시작)
		now.set(2023, 4, 25);
		System.out.println(now.getTime());
		
		// 날짜 변경 (일수 더하기)
		now.add(Calendar.DATE, 5);
		System.out.println(now.getTime());
	}
	
}
