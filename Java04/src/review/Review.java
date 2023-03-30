package review;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ctrl + shift + f = 자동정렬
		
		// 1. 1 ~ 10중 짝수만 출력하기
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
//
//		System.out.println("=============================");

		// 2. 정수형태 비밀번호 맞추기 (기회는 5번, 맞추면 맞췄다고하고 종료해주기, 기회를 모두 사용하면 접속불가)
//		int pw = 1234;
//		int pwd = 0;
//
//		for (int n = 0; n < 5; n++) {
//			System.out.println("비밀번호를 입력하세요: ");
//			pwd = sc.nextInt();
//			if (pwd == pw) {
//				System.out.println("맞았습니다 !");
//				break;
//			}
//
//			if (n == 4) {
//				System.out.println("접속불가");
//			}
//		}
		
		// 3.  시험합격 점수는 국어, 영어, 수학이 각각 40점 이상이고, 총점수가 150점 이상이면 합격
		// 40점 이하의 점수가 있으면 과락, 각 과목이 40점 이상이나 총점이 미달되면 총점미달
		
		int ha = 49;
		int eg = 40;
		int ma = 100;
		int sum = 0;
		
		sum = ha + eg + ma;
		
		if(ha >= 40 && eg >=40 && ma >= 40) {
			// 과락 X
			if(sum >= 150) {
				System.out.println("합격");
			}else {
				System.out.println("총점미달");
			}
		}else {
			System.out.println("과락");
		}
		
		System.out.println("==================================");
		
		// 4. 1 ~ 10까지의 합 구하기
		int 합계 = 0;
		for(int i=1;i<=10;i++) {
			합계 += i;
		}
		System.out.println(합계);
		
		System.out.println("======================================");
		
		// 5. 10~1까지 거꾸로 출력하기
		for(int n=10;n>=1;--n) {
			System.out.println(n);
		}
	
	}
}
