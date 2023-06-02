package day27.com.ict.edu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream과 DataOutputStream
// 기본자료형의 데이터를 주고 받을 때 사용
// ** 반드시 입력순서와 출력순서를 맞춰야 한다.
// 기본생성자가 없어서 BufferedStream처럼 FileStream을 이용해야 한다. 

public class Ex01_DataStream {
	public static void main(String[] args) {
		String pathname = "D:\\KSW\\test04.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			// 아래 부분 안 넣으면 제대로 안 읽어지고 글자 깨짐!
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// writeXXXX() => XXXX는 기본자료형을 말한다.
			dos.writeChar(97);
			dos.writeChar('A');
			dos.writeInt(245);
			dos.writeDouble(178.05);
			dos.writeBoolean(false);
			dos.writeChar('가');
			dos.writeChar(97);
			dos.writeChar('A');
			dos.flush();
			// readXXX(), XXX는 기본자료형이다.
			// 반드시 쓰기 순서대로 읽어야 함.
			// 서로 순서를 알고 있는 사람끼리만 정보를 주고받을 수 있음!!
			// 자바랑 Python 등 inter language 간에 정보교류 할 때 사용한다고 함.
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			
		} catch (Exception e) {

		} finally {
			try {
				dis.close();
				fis.close();
				dos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
