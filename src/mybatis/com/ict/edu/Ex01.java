package mybatis.com.ict.edu;

import java.util.Scanner;

// 마이바티스 셋팅하기
// 1. config.xml 만들기 - DB 접속
// 2. mapper.xml 만들기 - 실제 SQL 작성하는 파일 (실제 DB에 갔다와서 결과를 내보내는 파일)
// 3. VO.java -> DB에 들어갈 파라미터 및 결과 저장을 담당하는 파일 (테이블의 컬럼명과 일치)
// 4. DAO.java -> mapper와 연결되어 자바에서 DB를 실행시키는 파일
// 5. DBService -> config.xml을 읽고 MyBatis를 실행할 수 있도록 하는 파일

// 1. 환경설정파일(config.xml) 만들기

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1. customer 테이블 전체보기");
		System.out.println("2. customer 테이블 특정 데이터 보기");
		System.out.println("3. customer 테이블 데이터 삽입");
		System.out.println("4. customer 테이블 데이터 삭제");
		System.out.println("5. customer 테이블 데이터 수정");
		System.out.println("  >>>>>>>>>>>>>>>>>>>>>>  ");
		
		int menu = scan.nextInt();
		
		switch (menu) {
		case 1:  break;
		case 2:  break;
		case 3:  break;
		case 4:  break;
		case 5:  break;
		// 맨 마지막은 break 넣어도, 안 넣어도 ㄱㅊ
		default: System.out.println("제대로 입력하세요.");break;
		}
	}
}