package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import javax.print.DocFlavor.INPUT_STREAM;

// D:\KSW\java1.png 읽어서 D:\KSW\java1.png 쓰기(복사)
public class Ex04_File_IO {
	public static void main(String[] args) {
		
		String input_pathname = "D:\\KSW\\java1.png";
		String output_pathname = "D:\\KSW\\util\\imagetest.png";
		
		File input_file = new File(input_pathname);
		BufferedInputStream bis = null;
		File output_file = new File(output_pathname);
		BufferedOutputStream bos = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(input_file);
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream(output_file, true);
			bos = new BufferedOutputStream(fos);
			
			// 바로 읽고 쓰는 경우에 이렇게 쓰면 된다!! (배열처리보다 속도가 빠름!!)
			int c = 0;
			while ((c = bis.read()) != -1) {
				bos.write(c);
			}

			bos.flush();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try 
				{
				bos.close();
				fos.close();
				bos.close();
				fis.close();
			}catch (Exception e2) {

			}
		}
	}
}
