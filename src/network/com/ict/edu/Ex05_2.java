package network.com.ict.edu;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Ex05_2 {
	public static void main(String[] args) {
		String jsonData = "{\"Persons\":[{\"name\":\"고경태\",\"age\":\"30\",\"블로그\":\"ktko.tistory.com\",\"gender\":\"남자\"}, "
				+ "{\"name\":\"이홍준\",\"age\":\"31\",\"블로그\":\"없음\",\"gender\":\"남자\"}, "
				+ "{\"name\":\"서정윤\",\"age\":\"30\",\"블로그\":\"없음\",\"gender\":\"여자\"}], "
				+ "\"Books\":[{\"name\":\"javascript의모든것\",\"price\":\"10000\"},"
				+ "{\"name\":\"java의모든것\",\"price\":\"15000\"}]}";
		try {
			JSONParser jsonParser = new JSONParser();
			
			// JSONParser에 json 데이터를 넣어 파싱한 다음, JSONObject로 변환한다.
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonData);
			
			// Persons가 배열되어 있으므로, JSONArray (Persons가 키, 오른쪽이 Value)
			JSONArray personArray = (JSONArray) jsonObj.get("Persons");
			for (int i = 0; i < personArray.size(); i++) {
				System.out.println("=====person : " + i + "=====");
				JSONObject person_obj = (JSONObject) personArray.get(i);
				System.out.print(person_obj.get("name")+"\t");
				System.out.print(person_obj.get("age")+"\t");
				System.out.println(person_obj.get("gender")+"\t");
			}
			JSONArray booksArray = (JSONArray) jsonObj.get("Books");
			for (int i = 0; i < booksArray.size(); i++) {
				System.out.println("=====books : " + i + "=====");
				JSONObject books_obj = (JSONObject) booksArray.get(i);
				System.out.print(books_obj.get("name")+"\t");
				System.out.println(books_obj.get("price")+"\t");
			}
			
		} catch (Exception e) {

		}
	}
}

