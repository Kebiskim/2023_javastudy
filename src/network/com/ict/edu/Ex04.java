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

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

// 파싱 : 구문분석, 문장을 이루고 있는 구성 성분을 분해하고, 분해된 성분의 관계를 분석하여 구조를 결정하는 것
//		 즉, 데이터를 분해 분석하여 원하는 형태로 조립하고, 다시 빼는 과정을 말한다.
// HTML : Hyper Text Markup Language => 
// XML  : eXtensible Markup Language => 확장된 마크업 언어 (HTML보다)
//		  사용자가 태그를 만들어서 사용하는 언어
// 태그  : <시작태그 속성="값" 속성="값"> 텍스트 </끝태그>

// XML 파싱 : XML로 구성된 데이터를 원하는 데이터만 추출, 가공하는 것
// DOM(Document Object Modeling) 방식 : 웹 브라우저가 태그를 해석하고 표현하는 방식
// 링크  http://www.kma.go.kr/XML/weather/sfc_web_map.xml
// stn_id 속성, icon 속성, desc 속성. local 태그, weather 태그, current태그
public class Ex04 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		// 파일 쓰기
		String pathname = "D:"+File.separator+"ksw"+File.separator+"오늘날씨.txt";
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
//			http://www.kma.go.kr/XML/weather/sfc_web_map.xml
			// 안드로이드는 XML 파싱하는 방법이 세가지, 자바에서는 두가지. 가장 전통적인 방식이 DOM
			// 안드 : DOM 파서 or SAX 파서 or Pull parser
			// XML 파싱 : DOM 방식
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(in);
			// ☆ 디자인 패턴에서 팩토리 방식임 
			// 내가 최종으로 원하는 것은 document (웹페이지 하나) 이를 만들기 위해서 builder가 있어야 함
			// builder를 만들려면 factory가 있어야 함!!
			
			// 원하는 태그 찾기
			NodeList locals = document.getElementsByTagName("local");
			StringBuffer sb2 = new StringBuffer();
			
			for (int i = 0; i < locals.getLength(); i++) {
				// 태그의 텍스트 구하기
				String txt = locals.item(i).getFirstChild().getNodeValue();
				
				// 속성구하기
				String attr1 = ((org.w3c.dom.Element)(locals.item(i))).getAttribute("ta");
				String attr2 = ((org.w3c.dom.Element)(locals.item(i))).getAttribute("desc");
				
				sb2.append(txt+"\t");
				sb2.append(attr1+"\t");
				sb2.append(attr2+"\n");
			}
			System.out.println("도시\t온도\t상태");
			System.out.println(sb.toString());
		} catch (Exception e) {

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
