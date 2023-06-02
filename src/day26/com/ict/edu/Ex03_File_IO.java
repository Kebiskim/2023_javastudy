package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// D:\KSW\test01.txt 읽어서 D:\KSW\test02.txt에 내용 이어서 추가 (붙이기)
public class Ex03_File_IO {
	public static void main(String[] args) {
		String input_pathname = "D:\\KSW\\test01.txt";
		String output_pathname = "D:\\KSW\\test02.txt";
		File input_file = new File(input_pathname);
		// BIS 추가하는 부분.
		BufferedInputStream bis = null;
		File output_file = new File(output_pathname);
		BufferedOutputStream bos = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// input으로 텍스트를 가져오자.
			fis = new FileInputStream(input_file);
			bis = new BufferedInputStream(fis);
//			byte[] b = new byte[(int) input_file.length()];
//			bis.read(b);
//			String msg = new String(b);
			// input으로 가져온 데이터 출력부.
//			System.out.println(msg);
			
			// output으로 이어써 보자.
			fos = new FileOutputStream(output_file, true);
			bos = new BufferedOutputStream(fos);
			
			// ★ 모든 파일의 복사, 이동은 해당 방식으로 해야 한다!!
			// String으로 해도 되지만, 안해도 됨!!
			// ★ 모든 파일에 적용하기 가장 합리적인 방법!! (훨씬 빠르고 정확한 방법)
			int c = 0;
			while ((c = bis.read()) != -1) {
				bos.write(c);
			}
//			String output_str = msg;
//			byte[] arr = output_str.getBytes();
//			bos.write(arr);
			bos.flush();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try 
				{
				// 버퍼 두개를 먼저 닫는 경우도 있는데, 순서는 그렇게 안 중요함!!
				bos.close();
				fos.close();
				bos.close();
				fis.close();
			}catch (Exception e2) {

			}
		}
	}
}
