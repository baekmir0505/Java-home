
package database_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection1 {
	public static void main(String[] args) {
		// 데이터베이스와 연결이 정상적으로 진행되는지 테스트하는 코드
		
		// 자바에서 '데이터베이스' 프로그램을 사용하는 법 (JDBC)
		// 1. 데이터베이스 서버를 설치한다 (시각화 workbench 포함)
		// 2. Connector 라이브러리를 설치한다 (데이터베이스마다 다름)
		// 3. 프로젝트에 추가를 한다(프로젝트 속성 -> Java Build Path -> Libraries -> Add External Jars.. -> .jar 라이브러리 파일 추가
		
		// 객체화 안한거
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");
//			System.out.println("라이브러리 로드 성공!");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//			
//		try {
//			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/company","root","root");
//			System.out.println("연결 성공");
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("연결 실패");
//		}
		
		// 객체화
		SQLConnector c = new SQLConnector();
		
		// 자료구조 알고리즘 멀티쓰레드 DB 네트워크(소켓)
	}
}

// 연결테스트
class SQLConnector{
	private Connection conn;
	private static final String DBID = "root";
	private static final String DBPW = "root";
	private static final String DBURL = "jdbc:mariadb://localhost:3307/company";       // localhost == 127.0.0.1 (자신의 IP주소)
	
	// 생성자
	public SQLConnector() {
		try {
			System.out.println("생성자 사용");
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(DBURL,DBID,DBPW);
			System.out.println("마리아DB 드라이버 로딩 성공");
		}catch(Exception e) {
			System.out.println("마리아DB 드라이버 로딩 실패");
			e.printStackTrace();
		}
	}
}
