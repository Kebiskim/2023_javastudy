package Bj_Prac;

class ClassName_2<K, V>{
	private K first;  // K 타입(제너릭)
	private V second; // V 타입(제너릭)
	
	void set(K first, V second) {
		this.first = first;
		this.second = second;
	}
	
	K getFirst() {
		return first;
	}
	
	V getSecond() {
		return second;
	}
}
