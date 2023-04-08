package extend;

public class Ex4 {
	public static void main(String[] args) {
		스타벅스 cafe1 = new 스타벅스("본점",123);
		cafe1.printMenu();
		
		스타벅스_부평점 cafe2 = new 스타벅스_부평점("부평점", 100);
		cafe2.printMenu();
		
		스타벅스_강남점 cafe3 = new 스타벅스_강남점("강남점", 180);
		cafe3.printMenu();
	}
}

// 스타벅스 카페
class 스타벅스{
	protected String 지점명;
	protected String 메뉴[] = new String[3];
	protected int 매출;
	
	public 스타벅스(String 지점명, int 매출) {
		this.지점명 = 지점명;
		this.매출 = 매출;
		setMenu();
	}
	
	public void setMenu() {
		메뉴[0]= "아이스 아메리카노,";
		메뉴[1]= "카라멜 마끼아또,";
		메뉴[2]= "딸기 스무디";
	}
	
	public void printMenu() {
		System.out.print(지점명+"의 메뉴판 : ");
		for(int i=0;i<메뉴.length;i++) {
			System.out.print(메뉴[i]+" ");
		}
		System.out.println();
	}
}

// 스타벅스_부평점
class 스타벅스_부평점 extends 스타벅스{

	public 스타벅스_부평점(String 지점명, int 매출) {
		super(지점명, 매출);
	}
	// 오버라이딩 : 상속받은 메서드를 재정의(수정)
	public void setMenu() {
		메뉴[0]= "카페라떼,";
		메뉴[1]= "카라멜 마끼아또,";
		메뉴[2]= "딸기 주스";
	}
	
	// 오버로딩 : 메서드명이 같아도 매개변수가 다르면 다른 메서드로 취급
	public void setmenu(String menu1, String menu2, String menu3) {
		메뉴[0] = menu1;
		메뉴[1] = menu2;
		메뉴[2] = menu3;
	}

}

// 스타벅스_강남점
class 스타벅스_강남점 extends 스타벅스{

	public 스타벅스_강남점(String 지점명, int 매출) {
		super(지점명, 매출);
	}
	// 오버라이딩 : 상속받은 메서드를 재정의(수정)
		public void setMenu() {
			메뉴[0]= "카페라떼,";
			메뉴[1]= "버블티,";
			메뉴[2]= "딸기 에이드";
	}
	// 오버로딩 : 메서드명이 같아도 매개변수가 다르면 다른 메서드로 취급
	public void setmenu(String menu4, String menu5, String menu6) {
		메뉴[0] = menu4;
		메뉴[1] = menu5;
		메뉴[2] = menu6;
	}	
		
}
