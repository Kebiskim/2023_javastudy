package Bj_Prac;

// 자바 List Interface 입니다. <br>
// List는 ArrayList, SignlyLinkedList, DoublyLinked에 의해 각각 구현됩니다.

public interface List<E> {
	
	// 리스트에 요소를 추가합니다.
	
	boolean add(E value);
	
	void add(int index, E value);
	
	E remove(int index);
	
	boolean remove(Object value);
	
	E get(int index);
	
	void set(int index, E value);
	
	boolean contains(Object value);
	

	/**
	 * 리스트에 특정 요소가 몇 번째 위치에 있는지를 반환합니다.
	 * 
	 * @param value 리스트에서 위치를 찾을 요소 변수  
	 * @return 리스트에서 처음으로 요소와 일치하는 위치를 반환.
	 *         만약 일치하는 요소가 없을경우 -1 을 반환 
	 */
	int indexOf(Object value);
 
	/**
	 * 리스트에 있는 요소의 개수를 반환합니다.
	 * 
	 * @return 리스트에 있는 요소 개수를 반환  
	 */
	int size();
 
	/**
	 * 리스트에 요소가 비어있는지를 반환합니다.
	 * @return 리스트에 요소가 없을경우 {@code true}, 요소가 있을경우 {@code false}를 반환 
	 */
	boolean isEmpty();
 
	/**
	 * 리스트에 있는 요소를 모두 삭제합니다.
	 */
	public void clear();
}
