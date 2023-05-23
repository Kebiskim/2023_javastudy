package day13.com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05_Date {
	public static void main(String[] args) {
		// 날짜 관련 클래스
		// 1. Date 클래스, 2. Calendar클래스, LocalDate 클래스
		// ☆LocalDate를 사용할 것임 앞으로는!! (뒤에 나왔으니까 지원을 오래할 것)
		
		// 1. Date 클래스 : 기본생성자로 생성하면 컴퓨터의 시간으로 설정된다.
		// Deprecated => 언제든지 지원을 안할 수 있다. 다른 것을 사용하세요.
		// 기본적으로 회사에서 Deprecated 해놓은 것은 쓰면 안됨.
		Date date = new Date();
		System.out.println(date);
		
		// A year y is represented by the integer y - 1900.
		// 데이터에 00, 01, 02 라고 써있는 경우 1900년대인지, 2000년대인지 헷갈림
		// 밀레니얼버그 (1900년에서 2000년 넘어갈 때)
		// A month is represented by an integer from 0 to 11; 0 is January, 
		// 1 is February, and so forth; thus 11 is December. 
		// 자바에서는 월 표시할 때 항상 +1 해줘야 함!!

		// 2. 기본형태로 변환하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
		// Month와 minute가 겹치기 때문에 앞에는 M으로 씀.
		System.out.println(sdf.format(date));
		
		System.out.println(date.getYear()+1900 + "년"); // Deprecated 된 것.
		System.out.println(date.getMonth()+1 + "월");
		System.out.println(date.getDate() + "일"); 
		System.out.println(date.getHours() + "시");
		System.out.println(date.getMinutes() + "분");
		System.out.println(date.getSeconds() + "초");
		
		// 0-6 (0=>일요일, 6=>토요일
		int k = date.getDay();  // 요일
		switch (k) {
		case 0: System.out.println("일요일"); break;
		case 1: System.out.println("월요일"); break;
		case 2: System.out.println("화요일"); break;
		case 3: System.out.println("수요일"); break;
		case 4: System.out.println("목요일"); break;
		case 5: System.out.println("금요일"); break;
		case 6: System.out.println("토요일"); break;
		}
		
		
	}
}
