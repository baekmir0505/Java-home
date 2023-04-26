package except;

import java.util.Scanner;

public class Try2 {
	public static void main(String[] args) {
		// try ~ catch를 사용해서 나누기를 해보세요
		// 숫자 2개를 나누기하되 
		// 0이 들어올 수 있으니까 try로 예외처리
		// 방법 1
		int x = 10;
		int y = 0;
		int num;
		
		try {
			num =x/y;
			System.out.println(num);
		}catch(Exception e){
			System.out.println("0으로 나눔");
		}
		
		// 방법2
		Scanner sc = new Scanner(System.in);
		MyClass6 mc6 = new MyClass6();
//		
//		while(true) {
//			System.out.println("숫자1을 입력하세요>> ");
//			int num1 = sc.nextInt();
//			System.out.println("숫자2를 입력하세요>> ");
//			int num2 = sc.nextInt();
//			
//			try {
//				mc6.div(num1,num2);
//			}catch(Exception e) {
//				System.out.println("나누기할 때 예외가 발생했습니다.");
//			}
//		}
		
		// #2
		// int a = sc.nextInt(); 에 대한 예외처리 (숫자를 입력해야 하는 함수에 문자열을 입력할 수 있음)
//		System.out.println("숫자를 입력하세요>> ");
//		int a = 0;
//		try {
//			a = sc.nextInt();       // nextInt : 숫자만 입력해줘야함
//			System.out.println(a);	
//		}catch(Exception e) {
//			System.out.println("숫자를 입력해주세요");
//		}
		
		// 형변환 String -> int
		int c = 0;
		String str = "글자";
		try {
			c = Integer.parseInt(str);
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("숫자만 가능"+e);
		}
	}
}
class MyClass6{
	public void div(int num1, int num2) {
		System.out.println(num1 / num2);
	}
}