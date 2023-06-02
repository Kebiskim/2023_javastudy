package day25.com.ict.edu3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 바이트 출력 스트림 : OutputStream 자식클래스 FileOutputStream 사용
//					FileOutputStream을 이용해서 해당파일에 내용을 1byte 쓰기(출력, 저장)
// 		  주요메서드 : write(int b) : int b => 숫자(아스키코드(0-255), 한 글자),
//									** 아스키코드(숫자, 대문자, 소문자, 일부 특수문자를 숫자와 1:1 매칭한 코드)
//					 write(byte[] b) : 배열은 아스키코드 배열이다.
//					 ** String 클래스에서 getBytes()를 이용해서 byte[]로 만들어서 사용
//					 flush() : 버퍼 내용이 채워지지 않아도 출력하게 만듦
//					 close() : 출력 스트림 닫기
public class Ex04_OutputStream {
	public static void main(String[] args) {
		String pathname = "D:\\KSW\\test01.txt";
		File file = new File(pathname);
		// 선언하고 나중에 생성해야 함!! 그래야 아래 fos.close()가 오류가 안 남!!
		FileOutputStream fos = null;
		// FileOutputStream 기본생성자가 없어서, 위에 먼저 만들고 (위치값) 아래에 생성.
		try {
			// 파일이 없으면 생성, 있으면 덮어쓰기 한다.
//			fos = new FileOutputStream(file);
			// 파일이 없으면 생성, 있으면 이어쓰기 한다!!!
			fos = new FileOutputStream(file, true);
			// 한 글자 쓰기 (1byte 출력 = 아스키코드가 1byte)
			// 다중catch문 자동으로 들어가게 만들자!! (오류 수정)
//			fos.write(97);
//			fos.write(65);
//			fos.write(49);
//			fos.write('b');
//			fos.write('o');
//			fos.write('y');
//			fos.write('\n');
//			fos.write('\n');
//			fos.write('\r');
//			fos.write('y');
			// ASCII 코드 아닌 것은 안 된다!! 영어, 숫자를 제외하고 사용 불가
			fos.write('대');
			fos.write('한');
			
			// 한글 입력하면 오류 발생
//			byte[] arr = {'h', 'e', 'l', 'l', 'o', 'H', 'I', '1', '2'};
//			fos.write(arr);
			String str ="Hello\n대한민국123456"; 
			byte[] arr = str.getBytes();
			fos.write(arr);

					
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			}catch (Exception e) {

			}
		}
	}
}
