package review;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		// 복습퀴즈 : 사용자에게 정수를 입력받고
		// 천의 자리로 ,를 넣어주세요
		
		/*
		 * 100 ==> 100
		 * 1000 ==> 1,000
		 * 1000000 ==> 1,000,000
		 * 10000 => 10,000
		 * 10억까지만 하기
		 * */
		
		int money = 0;
		// 금액을 입력받아서 형변환하고 처리해보세요
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요: ");
		money = sc.nextInt();
		int 천 = 0;
		int 천나머지;
		String str_n = null;
		
		if(money < 999) {
			System.out.println(money);
		}else if(money < 9999999) {
			천 = money/1000;
			천나머지 = money % 1000;
			if(천나머지 < 10) {
				str_n = "00"+천나머지;
			}else if(천나머지 < 100) {
				str_n = "0"+천나머지;
			}else if(천나머지 < 1000) {
				str_n = ""+천나머지;
			}
			System.out.println(천+","+str_n);
		}
	}
	
}
