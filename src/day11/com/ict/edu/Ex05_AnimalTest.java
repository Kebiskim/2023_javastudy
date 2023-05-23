package day11.com.ict.edu;

public class Ex05_AnimalTest {
	public static void main(String[] args) {
		// 객체생성
		Ex05_Animal t1 = new Ex05_Animal();
		
		
		// 이름 : 큰뿔소
		t1.getName();
		
		
		// 나이 : 3
		t1.getAge();
		
		
		// 생존여부 : true
		t1.getLive();
		
		
		// 결과 출력
		
		
		
		// 이름을 펭귄, 나이를 1살, 생존여부 true 으로 변경
		String k1 = t1.changeName("펭귄");
		int k2 = t1.changeAge(1);
		boolean k3 = t1.changeLive(true);
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		
	}
}
