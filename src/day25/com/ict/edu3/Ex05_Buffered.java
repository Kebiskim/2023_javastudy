package day25.com.ict.edu3;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Ex04의 속도 향상을 위해서 BufferedOutputStream 사용 (혼자서는 사용 불가. File 등과 항상 같이 사용!!)
// BufferedOutputStream은 혼자서는 사용하지 않는다. 반드시 OutputStream 중 하나와 같이 사용된다.
public class Ex05_Buffered {
	public static void main(String[] args) {
		String pathname = "D:\\KSW\\test02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(bos);
			
			String msg = "Hello\n안녕\n大韓\n123456";
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				// bos가 먼저 닫아져야 함!! (문제 생기는 것은 아닌데 먼저 연걸 나중에 닫아야 하므로!!)
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
