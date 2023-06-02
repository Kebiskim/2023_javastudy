package day28.com.ict.edu;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// 보낼 사람은 직렬화할 outputstream과 데이터 VO를 가지고 있고,
// 받는 사람은 풀어줄 inputstream 이랑 VO를 가지고 있음.

// ObjectOutputStream : 객체 출력 스트림
// WriteObject : 객체 직렬화 메서드
public class Ex04_ObjectOutputStream {
	public static void main(String[] args) {
		// 1. 객체 만들기
		Ex04_VO vo1 = new Ex04_VO("고길동", 27, "서울 마포구", true, 179.5);
		Ex04_VO vo2 = new Ex04_VO("이길동", 21, "서울 마포구", false, 170.0);
		Ex04_VO vo3 = new Ex04_VO("김길동", 17, "서울 강남구", true, 183.3);
		Ex04_VO vo4 = new Ex04_VO("박길동", 33, "서울 서초구", false, 165.5);
		Ex04_VO vo5 = new Ex04_VO("홍길동", 26, "서울 중량구", true, 173.5);		
		
		// 2. 만들어진 객체를 컬렉션으로 모으자
		ArrayList<Ex04_VO> list = new ArrayList<>();
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		list.add(vo4);
		list.add(vo5);
		
		// 3. 모은 객체들을 직렬화한 후에 파일에 저장한다.
		// 직렬화가 된 정보는 볼 수 없다.
		// 읽을 때 역직렬화를 해야 볼 수 있다.
		
		// ser 파일은 제대로 볼 수 없음 사람이.
		// 열어보면 정보가 줄바꿈 없이 한 행으로 쭉나감.
		String pathname = "D:\\KSW\\object01.ser";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 4. 객체 직렬화 
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
