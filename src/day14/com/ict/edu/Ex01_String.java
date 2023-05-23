package day14.com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		
		String s1 = "ictedu";
		String s2 = "ictedu";
		// 같은거 만들면, JVM이 알아서 상수풀에서 만들어지는 객체들을 관리함.
		String s3 = new String("ictedu");
		String s4 = new String("ictedu");
		char[]ch = {'i','c','t','e','d','u'};
		String s5 = new String(ch);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println();
		
		// 객체의 주소가 같나?
		if (s1 == s2) {
			System.out.println("같다");
		}else {
			System.out.println("같지 않다.");
		}
		
		if (s1 == s3) {
			System.out.println("같다");
		}else {
			System.out.println("같지 않다.");
		}
		
		if (s1 == s4) {
			System.out.println("같다");
		}else {
			System.out.println("같지 않다.");
		}
		
		if (s1 == s5) {
			System.out.println("같다");
		}else {
			System.out.println("같지 않다.");
		}
		
		// equals() : 내용이 같나?
		if (s1.equals(s2)) {
			System.out.println("같다");
		}else {
			System.out.println("같지 않다.");
		}
		
		if (s1.equals(s3)) {
			System.out.println("같다");
		}else {
			System.out.println("같지 않다.");
		}
		
		if (s1.equals(s4)) {
			System.out.println("같다");
		}else {
			System.out.println("같지 않다.");
		}
		
		if (s1.equals(s5)) {
			System.out.println("같다");
		}else {
			System.out.println("같지 않다.");
		}
		
		s1 = s1 + "대한민국";
		System.out.println(s1);
		System.out.println(s2);
		
		// String 불변의 법칙 (string은 만들어놓고, 못 고친다 (배열보다 메모리 소모가 더 심함))
		// 위 법칙이 절대적임!!
		s1 = "ictedu";
		// 위 변수에 추가가 안 되기 때문에, s2 = "ictedu 대한민국"이란 텍스트를 새로 생성해버리는 것!!
		// s1 => 사용 안할 경우 가베지가 되는데, 이후 JVM에서 알아서 가베지콜렉션을 함.
		
		// 기본적으로 String은 기본자료형처럼 쓰는 것. 메모리 만들 때마다 새로 생겨나기 때문에,
		// concat도 새로 만드는 것.
		// String을 추가할 때는, 스트링버퍼를 써야 함 (메모리 소모가 없고 처리가 빠름)
		// 16칸을 미리 만들어 놓고, 이보다 넘어갈 때는 알아서 뒤에 칸을 추가하면서 작업하기 때문에, 주소가 바뀌지 않음!!
		
	}
}
