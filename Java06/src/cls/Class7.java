package cls;

public class Class7 {
	public static void main(String[] args) {
		// 객체화
		Human human = new Human();
		Human human2 = new Human();
		
		human.setName("백미르");
		human.setGender("남자");
		human.setAge(23);
		
		human2.setName("첫사랑");
		human2.setGender("여성");
		human2.setAge(23);
		
		HumanView hv = new HumanView();
		hv.printInfo(human);
		hv.printInfo(human2);
	}
}

// 멤버변수 private
// 메서드 public
class Human{
	// 데이터 : name, gender, age
	private String name;
	private String gender;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int gerAge() {
		return age;
	}
}

class HumanView{
	public void printInfo(Human human) {
		// 이름, 성별, 나이를 한번에 안내(출력)
		System.out.println("이름: "+human.getName()+", 성별: "+human.getGender()+", 나이: "+human.gerAge()+"살");
	}
}