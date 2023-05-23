package day11.com.ict.edu;

public class Ex04_method {

	int su1 = 0;
	int su2 = 0;
	int result = 0;
	
	// 메서드이름([인자],...)
	// 인자 : 메서드가 실행할 때 외부에서 필요한 정보를 받기 위한 통로이다.
	// 이름이 같지만 인자의 수나 자료형에 따라서 여러개를 만들 수 있다. (오버로딩, 오버로드)
	
	// 더하기
	public void add() {
		result = su1 + su2;
	}
	public void add(int k1) {	// k1은 외부에서 받아올 자료 (인자)
		result = k1 + su2;		// su2는 내부에 있는 자료
	}
	public void add(int k1, int k2) {
		result = k1 + k2;
	}
	
	public int sub() {
		result = su1 - su2;
		return result;
	}
	
	public int sub(int k1) {
		int res = k1 - su1;
		return res;
	}
	
	public int sub(int k1, int k2) {
		return k1-k2;
	}
}
