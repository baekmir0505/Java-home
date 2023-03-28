package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1. 1 ~ 10중 짝수만 출력하기
		
		for(int i = 1;i<=10;i++) {
			i++;
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("=============================");
		
		// 2. 정수형태 비밀번호 맞추기 (기회는 5번, 맞추면 맞췄다고하고 종료해주기, 기회를 모두 사용하면 접속불가)
		int pw;
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요: ");
		pw = sc.nextInt();
		
		for(int n=1;n<=10;n++) {
			i++;
			if()
		}
		
		
		
	}
}
