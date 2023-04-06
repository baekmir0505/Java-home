package cls;

public class Constructor2 {
	public static void main(String[] args) {
		// 객체화
		Person person = new Person("백미르", 23);           // 기본 생성자를 안만들어놔서 무조건 입력
		Person person1 = new Person("첫사랑", 23);           // 기본 생성자를 안만들어놔서 무조건 입력
		
		PersonView pv = new PersonView();                  // 기본생성자를 오버로딩해놔서 입력안해도 가능
		PersonView pv1 = new PersonView(person1);
		
		pv.info(person);        // info : 들어온 값을 저장하고 정보출력
		
		pv1.info();            //  info : 바로 정보 출력 (오버로딩)
	}
}

class Person{
	// 멤버변수 : 이름, 나이
	private String name;
	private int age;
	// 생성자 (생성자 통해서 멤버변수 초기화)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 게터세터
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}

class PersonView{
	Person person;
	// 기본 생성자
	public PersonView() {}           // 여러 형태의 생성자(객체화)를 허용해주려고
	// 생성자 오버로딩 : 받아온 객체를 맴버변수에 백업
	// PersonView b = new PersonView(person);
	public PersonView(Person person) {
		this.person = person;
	}
	
	// 메서드(멤버변수 출력용)
	public void info() {
		System.out.println("이름: "+person.getName()+", 나이: "+person.getAge());
	}
	
	// 메서드 오버로딩( 바뀐 사람을 저장 후 출력)
	public void info(Person person) {
		this.person = person;
		System.out.println("이름: "+person.getName()+", 나이: "+person.getAge());
	}
	
}