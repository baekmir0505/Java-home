package cls;

public class Constructor1 {
	public static void main(String[] args) {
		// 클래스의 생성자
		// 클래스는 초보자를 위한 문법, 초기에 먼저 해줘야할 작업을 자꾸 빼먹는다...
		// 생성자 : 사람이 초기값을 입력하지 않으면 실행이 안되게끔 해버리는 문법(반드시 초기값을 입력하게끔 해놓는 문법)
		// 생성자는 메서드, 클래스의 이름과 동일한 이름의 메서드
		// 생성자는 객체화를 하는 순간에 자동 실행
		MyClass9 m1 = new MyClass9(23, "백미르", 180);          // 클래스명 객체명 = new 생성자명();
		MyClass9 m2 = new MyClass9(23, "첫사랑", 165);
		// MyClass9 m3 = new MyClass9();       허용X, 이유 : ()안에 조건을 넣지 않아서
		
		
		// 해당 놀이기구는 나이가 13세 이상이면서 키가 150cm 이상이어야 탑승이 가능합니다
		MyClass9Test mt = new MyClass9Test();
		mt.test(m1);
		mt.test(m2);
		
	}
}

class MyClass9{
	// 생성자 (초기셋팅을 빼먹지 못하도록)
	// public MyClass9(){      // 자료형을 적지 않습니다
		// 초기값 셋팅을 위한 메서드이기 때문에 자료형은 적지 않는다
		
	// }
	
	// 생성자 오버로딩 (매개변수만 바꿔놓기)
	public MyClass9(int age, String name, double height) {
		this.age = age;
		this.name = name;
		this.height = height;		
	}
	
	// 멤버변수
	private int age;
	private String name;
	private double height;

	// 메서드
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
}	

// 탑승이 가능한지 판별해주는 클래스
class MyClass9Test{
	public void test(MyClass9 mc) {
		if(mc.getAge() < 13) {
			System.out.println(mc.getName()+"은(는) 나이가 적습니다. 탑승불가!");
		}else if(mc.getHeight() < 150) {
			System.out.println(mc.getName()+"은(는) 키가 충족되지 않습니다. 탑승불가!");
		}else {
			System.out.println(mc.getName()+"은(는) 탑승가능~");
		}
	}
}
