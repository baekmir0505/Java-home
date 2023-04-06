package cls;

public class Krcontroller {
	public static void main(String[] args) {
		KrModel km = new KrModel();        // 모델
		
		km.setNum(123);
		km.setStr("백미르");
		
		KrService ks = new KrService();        // 꾸며주기 클래스
		ks.decoEquals(km);
		ks.decoPlus(km);
		
		KrView kv = new KrView();            // 출력하는 클래스
		kv.printNum(km);
		kv.printStr(km);
		
		
	}
}

// KrModel 클래스(변수 : num,str / 메서드 : set, get)

class KrModel{
	int num;
	String str;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	
}

// KrView 클래스 (출력용)
class KrView{
	
	void printNum(KrModel km) {
		System.out.println(km.getNum());
	}
	
	void printStr(KrModel km) {
		System.out.println(km.getStr());
	}
}

// KrService 클래스 (자바기능)
class KrService {
	// 출력하기 전에 꾸며주기
	void decoEquals(KrModel km) {
		// 양 옆에 == 표시
		km.setStr("=="+km.getStr()+"==");        // 문자열을 가져온 다음 ==을 붙여서 저장
	}
	
	void decoPlus(KrModel Km) {
		// 양 옆에 + 표시
		// Km.setStr("+"+Km.getStr()+"+");         // 문자열을 가져온 다음 +룰 붙여서 저장
		Km.str = "+"+Km.str+"+";
	}
}