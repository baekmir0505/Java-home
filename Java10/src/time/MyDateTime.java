package time;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime {
	String str1 = "멤버변수";                    // 객체화 없이는 사용 불가능
	static String str2 = "static 정적 멤버변수";    // 객체화 안하고 사용 가능 (변수 생성시점 이후에만 가능)
	public static void main(String[] args) {
		MyTime mt = new MyTime();
		System.out.println(mt.dateTime());
		
		MyTime mt1 = new MyTime();
		System.out.println(mt1.date());
		System.out.println(mt1.time());
		System.out.println(mt1.tomorrow());
		System.out.println(mt1.after());
		
		// System.out.println(MyDateTime.str1); -- 객체화를 해야 변수와 메서드 사용 가능
		// System.out.println(str1);    -- 객체화를 해야 변수와 메서드 사용 가능
		System.out.println(MyDateTime.str2);       // static이어서 어느 클래스 안에 있는지만 알려주면 바로 접근 가능
		
		// static으로 올려 놓으면 객체화없이 그 안에 있는 메서드와 멤버변수를 바로 사용 가능
		GetInstance get = GetInstance.getInstance();          // GetInstance : static으로 올려놔서 막 접근이 가능
		GetInstance get2 = GetInstance.getInstance();       // get == get2
		
		// getInstance() : 가 보이면 static로 객체화 한것
		
		get.print();
		
		// 정석적인 객체화
		// 1. Singleton 홍길동 = new Singleton();
		// 2. Singleton 이순신 = new Singleton();
		
		Singleton 홍길동 = Singleton.getInstance();
		Singleton 이순신 = Singleton.getInstance();
		홍길동.setstr("홍길동입니다.");
		System.out.println(이순신.getstr());
		
		// getInstance() : 객체화하는 작업
	}
}

class MyTime{
	// 자바 코드로 현재 시간을 가져오는 법
	// Calendar, Date, SimpleDateFormat, String
	
	// 맴버 변수
	private String str;
	
	// 매서드
	public String dateTime() {
		// 현재 시간을 반환
		Calendar cal = Calendar.getInstance();        // 객체화(싱글턴패턴, 1회용 객체화), 이때 시간을 가져옴
		Date date = cal.getTime();                   //  Date 형변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");        // 시간을 출력할 형태를 생성자로 결정
		
		str = sdf.format(date);
		return str;
	}
	
	public String date() {
		// 년.월.일 반환
		Calendar cald = Calendar.getInstance();
		Date date1 = cald.getTime();
		SimpleDateFormat sdft = new SimpleDateFormat("yyyy.mm.dd");
		
		str = sdft.format(date1);
		return str;
	}
	
	public String time() {
		// 10:00:55초
		Calendar cld = Calendar.getInstance();
		Date date2 = cld.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		
		str = sdf.format(date2);
		return str;
	}
	
	public String tomorrow() {	
		// 내일, 한시간 뒤
		Calendar cal = Calendar.getInstance();     // 싱클턴패턴 객체화, 이때 시간을 가져옴
		Date date = cal.getTime();        // Date 형변환
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH");
		SimpleDateFormat sdf5 = new SimpleDateFormat("mm");
		SimpleDateFormat sdf6 = new SimpleDateFormat("ss");
		
		String year = sdf1.format(date);           // 년
		String month = sdf2.format(date);          // 월
		String day = sdf3.format(date);            // 일
		String hour = sdf4.format(date);           // 시
		String minute = sdf5.format(date);         // 분
		String second = sdf6.format(date);         // 초
		
		// 년-월-일 시:분:초
		str = year + "년-" + month + "월-" + (Integer.parseInt(day)+1) + "일" + (Integer.parseInt(hour)+1) + 
		"시:" + minute + "분:" + second + "초";
		
		return str;
	}
	
	// 30분 뒤 시간
	public String after() {
		Calendar cal = Calendar.getInstance();       // 싱글턴패턴 객체화 (이때 시간을 가져옴)
		cal.add(Calendar.MINUTE, 30);         // 이걸로 시간을 조절해줄 수 있음 
		Date date = cal.getTime();           //  Date 형변환
		SimpleDateFormat sdf4 = new SimpleDateFormat("HH"); 
		SimpleDateFormat sdf5 = new SimpleDateFormat("mm"); 
		SimpleDateFormat sdf6 = new SimpleDateFormat("ss"); 
		
		String hour = sdf4.format(date);           // 시
		String minute = sdf5.format(date);         // 분
		String second = sdf6.format(date);         // 초
		
		str = hour + "시:" + minute + "분:" + second + "초";
		
		
		return str;
	}

}