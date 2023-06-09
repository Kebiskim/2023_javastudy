package jdbc.com.ict.edu3;

import java.util.Iterator;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1. 테이블 전체 데이터 보기");
		System.out.println("2. 테이블 특정 데이터 보기");
		System.out.println("3. 테이블 데이터 삽입");
		System.out.println("4. 테이블 데이터 삭제");
		System.out.println("5. 테이블 데이터 수정");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		
		int menu = scan.nextInt();
		String c_id2, c_name, c_age, c_rank, c_job, c_point; 
		c_id2 = null;
		c_name = null;
		c_age = null;
		c_rank = null;
		c_job = null;
		c_point = null;
		String c_id4, c_name4, c_age4, c_rank4, c_job4, c_point4; 
		c_id4 = null;
		c_name4 = null;
		c_age4 = null;
		c_rank4 = null;
		c_job4 = null;
		c_point4 = null;
		String[] arr = {"고객아이디", "고객이름", "나이", "등급", "직업", "적립금"};
		String[] arr_2 = {c_id4, c_name4, c_age4, c_rank4, c_job4, c_point4};
		switch (menu) {
		// static이므로 이렇게 바로 호출하면 됨!!
			case 1: DAO.getInstance().getSelectAll(); break;
			case 2: 
				System.out.println("고객 아이디 : ");
				String c_id = scan.next();
				DAO.getInstance().getSelectOne(c_id); break;
			// 없는 ID 공백으로 뜨게 or 안뜨게??
			case 3: 
				System.out.println("삽입정보를 입력하세요");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] +  " : ");
					arr[i] = scan.next();
				}
				DAO.getInstance().getInsert(c_id2, c_name, c_age, c_rank, c_job, c_point);
				break;
				// switch 안에서 변수의 중복선언 불가함!!
			case 4:
				System.out.println("삭제할 고객 아이디 : ");
				String c_id3 = scan.next();
				DAO.getInstance().getDelete(c_id3); break;
			case 5:
				System.out.println("수정할 정보를 입력하세요.");
				for (int i = 1; i < 7; i++) {
					System.out.println(arr[i] + " : ");
				}
				DAO.getInstance().getUpdate(c_id4, c_name4, c_age4, c_rank4, c_job4, c_point4);
			// String으로 보내면 DB에서 자동으로 형변환 한다.
		}
	}
}
