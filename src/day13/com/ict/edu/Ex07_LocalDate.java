package day13.com.ict.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex07_LocalDate {
	public static void main(String[] args) {
		// 자바버전 8.0 이상이어야 함!!
		// LocalDate : 날짜 정보만 필요할때
		// LocalTime : 시간 정보만 필요할때
		// LocalDateTime : 날짜, 시간 모두 필요할 때
		
		LocalDate cDate = LocalDate.now();
		System.out.println(cDate);
		
		LocalTime cTime = LocalTime.now();
		System.out.println(cTime);
		
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println(cdt);
		System.out.println();
		
		System.out.println("날짜");
		System.out.println("getYear() : " + cDate.getYear());				// 년도
		System.out.println("getMonth() : " + cDate.getMonth());				// May
		System.out.println("getMonthValue() : " + cDate.getMonthValue());	// 월(1,2,3,...)
		System.out.println("getDayOfYear() : " + cDate.getDayOfYear());		// 년의 몇번째 일
		System.out.println("getDayOfMonth() : " + cDate.getDayOfMonth());	// 일
		System.out.println("getDayOfWeek() : " + cDate.getDayOfWeek());		// 요일(MONDAY)
		System.out.println("isLeapYear() : 윤년여부" + cDate.isLeapYear());		// 윤년여부
		// boolean형은 get 대신 is 사용
		
		// current => 현재시점
		System.out.println("-- 시간 --");
		System.out.println("getHour() : " + cTime.getHour());
		System.out.println("getMinute() : " + cTime.getMinute());
		System.out.println("getSecond() : " + cTime.getSecond());
		// 1970년 1월 1일 UTC의 첫 번째 순간 이후의 현재 시간까지의 나노초를 나타내는 값.
		// 초끼리 연산할 때 (날짜끼리 비교할 때)는 숫자로 비교하는 것이 훨씬 빠름.
		System.out.println("getNano() : " + cTime.getNano());
		System.out.println();
		
		// 국제표준화기구 (International Standard Organization)
		System.out.println(cDate.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(cdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS")));
		System.out.println();
		
		System.out.println("-- 날짜 차이 계산 --");
		LocalDate sDate = LocalDate.now();
		LocalDate eDate = LocalDate.of(2023, 05, 10);
		// 클래스 쓰고 앞에 클래스의 소문자를 써서 코딩을 빨리 하는 방법.
		Period period = Period.between(sDate, eDate);
		
		// between 에서 일자를 앞 날짜로 변경하면 -> -가 됨.
		System.out.println(period.getYears());	// 연
		System.out.println(period.getMonths());	// 월
		System.out.println(period.getDays());	// 일
		// 31일, 30일 주의해서 사용.
		System.out.println(ChronoUnit.DAYS.between(sDate, eDate));	// 일
		System.out.println();
		
		System.out.println(sDate.plusYears(2));
		System.out.println(sDate.plusMonths(2));
		// 오늘부터 D-day 계산에도 활용할 수 있음.
		System.out.println(sDate.plusDays(100));
	}
}