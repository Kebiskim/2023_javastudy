package day13.com.ict.edu;

import java.util.Random;

public class Ex04_Random {
	public static void main(String[] args) {
		// 난수(정해지지 않은 수)를 발생하는 방법
		// 3으로 나눈 나머지가 0,1,2밖에 안 나오는 원리를 이용 => 가위바위보
		// 0을 가위, 1을 바위, 2를 보 로 설정하면 됨.
		// 아무 숫자나 던지면, 컴퓨터에서 가위 바위 보가 나옴.
		
		// Math.random(), Random 클래스
		// Class 이름.메서드 => 이렇게 쓰는 것은 static임.
		
		// pseudo => fake
		// 1. Random 클래스
		Random ran = new Random();
		// nextDouble(); => 0.0에서 1.0 미만으로만 나옴! (1.0 이상은 나올 수 없음!!)
		// nextInt(int bound) => 7 넣을 경우, 0~6까지 나옴!! (- 값은 안 나옴)
		// nextInt() => -도 나옴!!
		
		// 각종 기본자료형의 난수 발생 : 자료형 범위 안에서 난수 발생 (double형은 여기 속하지 않음!)
		// 이것들은 자주 안 씀 (-랑 + 부호까지도 랜덤으로 나옴)
		System.out.println("boolean형 : " + ran.nextBoolean());
		System.out.println("int형 : " + ran.nextInt());
		System.out.println("long형 : " + ran.nextLong());
		
		// double은 0.0 이상 ~ 1.0 미만에서 난수 발생
		System.out.println("double형 : " + ran.nextDouble());
		
		// 특정 범위를 지정하는 방법
		// 1. nextInt(범위) : 0 ~ 범위 전까지 난수 발생 (정수)
		System.out.println("int(범위) : " + ran.nextInt(5));	// 0 ~ 4
		
		// 2. (int)(nextDouble() * 범위) : 0 ~ 범위 전까지 난수 발생 (정수)
		System.out.println("int(범위) : " + (int)(ran.nextDouble() * 5));
		
		// Math 클래스 : 전체메서드가 static, 객체 생성없이 호출 가능
		// 1) random()
		System.out.println("Math.random() : " + Math.random()); // randomDouble과 동일한 결과 (길이도 같음)
		
		// 특정범위 지정
		System.out.println("Math.random(0~4) : " + (int)(Math.random() * 5));
		// Math API에서, public final class Math로 되어있는데, class 앞에 final 은 상수란 뜻이 아님!!
		// ★상속 불가능이란 뜻!!
		
		// 올림, 버림, 반올림
		System.out.println("올림 : " + Math.ceil(3.45));
		System.out.println("올림 : " + Math.ceil(3.55));
		
		System.out.println("반올림 : " + Math.round(3.45)); // 반올림만 정수로 나옴
		System.out.println("반올림 : " + Math.round(3.55)); // 반올림만 정수로 나옴
		
		System.out.println("버림 : " + Math.floor(3.55));
		System.out.println("버림 : " + Math.floor(3.55));
		
	}
}
