package time;

public class GetInstance {
	// getInstace() : 싱글턴패턴
	// 디자인패턴 : MVC패턴, 싱글턴패턴,...
	// 디자인패턴이란 코딩 방식(구조)
	
	// 싱글턴패턴 : 한번만 객체화를 허용해주되 static로 객체화를 시켜서 어디서든 자유롭게 사용가능하게함
	
	// 생성자를 private로 해서 일반적인 객체화를 불가능하게함
	private GetInstance() {}
	
	private static GetInstance instance;        // 객ㅊ[ㄹ,ㄹ 자징힐 멤버변수
	
	public static GetInstance getInstance() {         // 얘를 통해 객체화
		if(instance == null) {
			instance = new GetInstance();      // getInstance() 메서드를 사용하면 내부에서 객체화
		}
		return instance;
	}
	
	// 멤버변수와 메서드
	public void print() {
		System.out.println("싱글턴패턴 클래스 입니다.");
	}
}
