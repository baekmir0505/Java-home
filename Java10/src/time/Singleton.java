package time;

public class Singleton {
	
	// 디자인 패턴을 싱글턴패턴으로 해서 클래스를 구성(디자인)
	private Singleton() {}
	
	private static Singleton instance;
		
	public static Singleton getInstance() {         // 얘를 통해 객체화
		if(instance == null) {
			instance = new Singleton();      // getInstance() 메서드를 사용하면 내부에서 객체화
		}
		return instance;
	}	
		
	// 맴버변수와 매서드
	private String str;
	public String getstr() {return str;}
	public void setstr(String str) {this.str = str;}
}
