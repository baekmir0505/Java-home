package rand;

import java.util.Random;
import java.util.Scanner;

public class Random1 {
	public static void main(String[] args) {
		// 자바에서 랜덤을 사용하는 법
		// Math클래스 또는 Random클래스 사용
		MyRandom mr = new MyRandom();
		mr.go1();
		mr.go2();
		mr.go3();
		
		Randoms rd = Randoms.getInstance();
		System.out.println(rd.go());
	}
}

class MyRandom{
	// nextInt : 0 ~ 0.99999999까지 랜덤 후 int로 형변환, // result : 변수
	public void go1() {
		// 0 ~ 9 랜덤
		Random random = new Random();
		int result = random.nextInt(10);         // 0~9까지 랜덤 (0*10 ~ 0.9999*10)
		System.out.println(result);
	}
	
	public void go2() {
		// 100 ~ 105까지 랜덤
		Random random = new Random();
		int result = random.nextInt(6) + 100;       // (0*6 ~ 0.99999*6) + 100         == 100 ~ 105
		System.out.println(result);
	}
	
	public void go3() {
		Random random = new Random();
		int result = random.nextInt(10)+1;          // (0*10 ~ 0.99999*10) +1          == 1 ~ 10
		System.out.println(result);
	}
}

// 싱글턴패턴 클래스로 생성하여 사용자에게 두 수를 입력받아 그 사이에서 랜덤을 돌려 리턴해주는 메서드 만들기 (syso는 메인에서)
// 예외처리 필요 : 첫번째 숫자에 더 큰 수를 입력했을 경우 대비
class Randoms {
	// 생성자를 막고
	public void Randoms() {}
	
	// 객체
	private static Randoms instance;
	
	// 객체화를 진행할 메서드
	public static Randoms getInstance() {
		if(instance == null) {
			instance = new Randoms();
		}
		return instance;
	}
	
	// 멤버변수와 메서드
	public int go() {
		// 숫자 2개 입력받고
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1을 입력하세요>> ");
		int num1 = sc.nextInt();
		System.out.println("숫자 2를 입력하세요>> ");
		int num2 = sc.nextInt();
		int temp = 0;
		
		// 첫번째 숫자가 더 크면 교체하고
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		// 랜덤 돌리기
		Random random = new Random();
		int result = random.nextInt(num2-num1+1)+num1;
		
		// 정리작업
		sc.close();
		return result;
	}
	
}