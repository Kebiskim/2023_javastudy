package day11.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_method t1 = new Ex02_method();
		// 여기서 바로 출력해버리면 초기값으로 각 값들이 나오게 됨!!
		
		System.out.println("=== 메서드 실행하기 전 ===");
		System.out.println("총점 : " + t1.sum);
		System.out.println("평균 : " + t1.avg);
		System.out.println("학점 : " + t1.hak);
		
		System.out.println("=== 메서드 실행 ===");
		t1.getSum();
		t1.getAvg();
		// 위에 것들을 실행했을 때 이동을 해서 작업을 해주는 애들을 thread라고 부름.
//		System.out.println("평균 : " + t1.avg);
		t1.getHak();
//		System.out.println("총점 : " + t1.sum);
//		System.out.println("학점 : " + t1.hak);
		// 메서드를 만드는 장점 (1. 오류가 났을 때 수정하기 쉬움, 2. 재사용해서 일반적으로 사용 가능함)
		// 이를 모듈화 라고 함. 교체가 쉬움.
		
		// 팀장이 인터페이스 만들때 반환형까지 만들어서 or 안 만들어서 팀원들이 쓰게끔 뿌려줌 => 그대로 만들면 됨.
	}
}
