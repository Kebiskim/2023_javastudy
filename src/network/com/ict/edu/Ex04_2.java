package network.com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Ex04_2 {
	
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		// 파일 쓰기 
		String pathname_home = "C:"+File.separator+"Users"+File.separator+"PC"+File.separator+
				"Downloads"+File.separator+"JavaPractice"+File.separator+"KSW"+File.separator+"ksw01.txt";
		File file = new File(pathname_home);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			
			is = conn.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg);
			}
			InputSource in = new InputSource(new StringReader(sb.toString()));
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(in);
			
			// 원하는 태그 찾기
			NodeList locals = document.getElementsByTagName("local");
			StringBuffer sb2 = new StringBuffer();
			
			for (int i = 0; i < locals.getLength(); i++) {
				// 태그의 텍스트 구하기
				String txt = locals.item(i).getFirstChild().getNodeValue();
				
				// 속성 구하기
				String attr1 = ((Element)(locals.item(i))).getAttribute("ta");
				String attr2 = ((Element)(locals.item(i))).getAttribute("desc");
				
				sb2.append(txt+"\t");
				sb2.append(attr1+"\t");
				sb2.append(attr2+"\n");
				
			}
			System.out.println("도시\t온도\t상태");
			System.out.println(sb.toString());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {

			}
		}
		
	}
	
}
