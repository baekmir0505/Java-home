package cls;

public class Class6 {
	public static void main(String[] args) {
		Car 아빠차 = new Car();
		// 아빠차.name = "그랜저";       // private하면 직접 사용이 불가능해짐
		// System.out.println(아빠차.name);     대입도 사용도 안됨
		
		아빠차.setName("그랜저");
		System.out.println(아빠차.getName());
		아빠차.setColor("검은색");
		System.out.println(아빠차.getColor());
		아빠차.setNum(1542);
		System.out.println(아빠차.getNum()); 
	}
}

// 객체지향의 법칙 : 멤버 변수는 private, 메서드는 public
/*
 접근권한 제어자
 	private : 내 클레스에서만 접근가능 ( 다른 클래스에서 접근 불가능)
    default(안적으면) : 다른 패키지에서 접근 불가능
 	protected : 다른 패키지에서 접근 불가능하지만 상송했을 경우에는 가능
 	public : 접근 가능 (같은 프로젝트), 단 폴더가 같아야한다
 */
// 캡슐화 : 멤버변수를 private으로 만들어서 외부 클래스로부터 데이터를 보호하고 public 메서드로 사용한다
class Car{
	// 차명, 색상, 차번호(뒷자리)
	private String name;           // private이 되면 다른 클래스에서 사용 불가능
	private String color;
	private int num;
	
	// 대입을 위해선 set
	public void setName(String name) {         // public 메서드로 제공되지 않는 private변수는 대입이나 사용이 불가능
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	
	// 사용을 위해선 get
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getNum() {
		return num;
	}
	
}