package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime2 {
	public static void main(String[] args) {
		MyDate md = new MyDate();
		
		while(true) {
			System.out.println(md.now());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}

class MyDate{
	// 현재 시간을 가져오기
	// 0000년 00월 00일 00시 00분 00초
	
	public String now() {
		String str = null;
		Calendar cal = Calendar.getInstance();       // 컴퓨터의 시간을 받아옴
		Date date = cal.getTime();              // 형 변환용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		str = sdf.format(date);
		
		return str;
	}
}