package mybatis.com.ict.edu;

import java.util.List;
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
		// 자기자신을 객체생성하여 아래부분에 test.prn() 형태로 사용하기로 함
		Ex01 test = new Ex01();
		System.out.println("선택하세요");
		System.out.println("1. customer 테이블 전체보기");
		System.out.println("2. customer 테이블 특정 데이터 보기");
		System.out.println("3. customer 테이블 데이터 삽입");
		System.out.println("4. customer 테이블 데이터 삭제");
		System.out.println("5. customer 테이블 데이터 수정");
		System.out.println("  >>>>>>>>>>>>>>>>>>>>>>  ");
		
		int menu = scan.nextInt();
		List<VO3> list = null;
		switch (menu) {
			// 그냥 prn()이 안되는 이유는, 메인이 static인데 일반메서드 호출 불가능하기 때문!
			case 1: list = DAO.getList(); test.prn(list); break;
			case 2: 
				System.out.print("custid를 입력하세요. >> ");
				String custid = scan.next();
				// next로 받은 String을 DAO의 getList에 전달함!!
				VO3 vo = DAO.getOne(custid);
				// DAO의 getOne으로 custid를 보내면, vo에다가 해당 값을 담아서 return 한다. (자신을 호출한 곳으로 되돌아옴)
				test.prn2(vo);
				break;
			case 3: 
				System.out.println("삽입 정보를 입력하세요. >> ");
				System.out.println("이름 : ");
				String name = scan.next();
				System.out.println("주소 : ");
				String address = scan.next();
				System.out.println("전화번호 : ");
				String phone = scan.next();
				VO3 vo2 = new VO3();
				vo2.setName(name);
				vo2.setAddress(address);
				vo2.setPhone(phone);
				int result = DAO.getInsert(vo2);
				if(result>0) {
					list = DAO.getList();
					test.prn(list);
				}
				break;
			case 4:  
				System.out.println("삭제할 custid를 입력하세요. >> ");
				String custid2 = scan.next();
				VO3 vo3 = new VO3();
				vo3.setCustid(custid2);
				int result2 = DAO.getDelete(vo3);
				if(result2>0) {
					list = DAO.getList();
					test.prn(list);
				}
				break;
			case 5: 
				System.out.println("갱신정보를 입력하세요. >> ");
				
				System.out.println("갱신할 번호 : ");
				String custid3 = scan.next();
				System.out.println("이름 : ");
				String name2 = scan.next();
				System.out.println("주소 : ");
				String address2 = scan.next();
				System.out.println("전화번호 : ");
				String phone2 = scan.next();
				
				VO3 vo4 = new VO3();
				vo4.setCustid(custid3);
				vo4.setName(name2);
				vo4.setAddress(address2);
				vo4.setPhone(phone2);
				int result3 = DAO.getUpdate(vo4);
				if(result3>0) {
					list = DAO.getList();
					test.prn(list);
				}
				break;
		// 맨 마지막은 break 넣어도, 안 넣어도 ㄱㅊ
		default: System.out.println("제대로 입력하세요.");break;
		}
	}
	// 테이블 전체보기 메서드
	public void prn(List<VO3> list) {
		System.out.println("번호\t이름\t주소\t전화번호");
		for (VO3 k : list) {
			System.out.print(k.getCustid()+"\t");
			System.out.print(k.getName()+"\t");
			System.out.print(k.getAddress()+"\t");
			System.out.print(k.getPhone()+"\n");
		}
	}
	public void prn2(VO3 vo) {
		System.out.println("번호\t이름\t주소\t전화번호");
			System.out.print(vo.getCustid()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAddress()+"\t");
			System.out.print(vo.getPhone()+"\n");
	}
}