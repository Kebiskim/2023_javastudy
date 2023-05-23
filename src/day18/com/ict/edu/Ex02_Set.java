package day18.com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 : 중복안됨, 특정 기준으로 정렬할 수 없음.
		// 		(단, TreeSet은 항상 오름차순을 유지한다.)
		// 형식 : HashSet<제네릭타입=객체타입=클래스> 참조변수 = new HashSet<[제네릭타입=객체타입=클래스>();
		//		 TreeSet<제네릭타입=객체타입=클래스> 참조변수 = new TreeSet<[제네릭타입=객체타입=클래스>();
		
		// 1. 컬렉션 생성 (랩퍼Wrapper클래스 : 기본자료형들을 클래스로 만들어주는 클래스)
		//				(종류 : Integer, Double, Character, String)
		// 아래 : 오류남
//		HashSet<int> h1 = new HashSet<>();
		HashSet<Integer> h1 = new HashSet<>();
		HashSet<Double> h2 = new HashSet<>();
		HashSet<Character> h3 = new HashSet<>();
		HashSet<String> h4 = new HashSet<>();
		
		System.out.println(h1); // 배열은 아닌데, 이렇게 값을 넣을 수 있는 빈 공간을 만들어준다.
		
		// 2. 컬렉션에 객체를 넣을 수 있다. (add를 통해서 크기 지정하지 않고, 계속 추가 가능)
		h1.add(new Integer(14));
		h1.add(new Integer("16"));
		h1.add(20);	// 오토박싱이라고 부름. 기본자료형이 알아서 객체가 되어 들어간다.
					// 오토 언박싱 : 해당 객체를 기본자료형으로 되돌리는 것.
		System.out.println(h1);
		
		h2.add(new Double(30.1));
		h2.add(new Double("35.1"));
		h2.add(38.2);
//		h2.add(30);	// 무조건 제네릭타입을 맞춰야 한다. (double이 아니라서 오류. promotion 생각하면 안됨)
		
		System.out.println(h2);
		
		h3.add(new Character('j'));
		h3.add('a');
		h3.add('v');
		h3.add('a');	// 중복 안됨. 들어가지 않음
		System.out.println(h3);
		
		// 일반 for문을 사용할 수 없음. (인덱스값이 없기 때문에)
		System.out.println("하나씩 처리하기 (개선된 for문)");
		for (Integer k : h1) {
			System.out.println(k+10);
		}
		System.out.println();
		
		System.out.println("하나씩 처리하기 (iterator)");
		// T가 Type의 약자. 제네릭 타입을 뜻함.
		Iterator<Double> it =  h2.iterator();
		while (it.hasNext()) {
			Double k = (Double) it.next();
			System.out.println(k);
		}
		// 위처럼 개선된 for문 혹은 iterator 둘 중 하나를 이용해서 처리하면 됨.
		System.out.println();
		Iterator<Character> it2 = h3.iterator();
		while (it2.hasNext()) {
			Character k2 = (Character) it2.next();
			System.out.println(k2);
			
		}
	}
}
