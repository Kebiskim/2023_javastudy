package day13.com.ict.edu;

public class Ex01_main {
	public static void main(String[] args) {
		
		Ex01_Constructor p1 = new Ex01_Constructor();
		
		// p1과 기본생성자 옆에 있는 주소가 똑같음!!
		// p1.name => p1 변수의 heap 메모리(주소)로 가서, Constructor 안에 있는 name을 찾음!!
		// ★ 메인메서드 실행하자마자 생성자가 호출되기 때문에, p1 출력보다 위에줄이 먼저 출력됨!! 
//		System.out.println(p1.name); // 안되는 이유
		// 접근제한자가 private일 경우, 볼 수는 있지만 접근이 차단되어서 접근만 못함!!
		// private 인데도 this.name이 접근 가능한 이유 => ★ 자기 자신 안에 있어서(생성자)
		System.out.println(p1);
		System.out.println(p1.getName());
		// 기본생성자의 주소는, 다시 실행해도 변화가 없음!! (가베지라고 판단해서 지우기 전까지는)
		
	}
}
