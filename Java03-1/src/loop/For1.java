package loop;

public class For1 {
	public static void main(String[] args) {
		// 반복문 : while, for
		// for : while이 가독성이 떨어져서 사용
		
		// 0 ~ 9까지 출력 while
		// while의 단점 : 바깥에 플래그를 만들어 줘야함, {}안에서 플래그를 증감, 결론으로 가독성이 떨어짐
		int i = 0;
		while(i<10) {
			// 반복할 코드
			System.out.println("while: "+i);
			i++;
		}
		
		System.out.println("=============================");
		
		// 0 ~ 9까지 출력 for
		// for문 : 플래그 관련 코드는 ()에 몰아버리자! 반복할 코드만 {}에 남기자
		for(int j = 0; j < 10; j++) {
			System.out.println("for: "+j);
		}
		// for(초기값;조건식;증감량){ 반복할 코드; }
		// for문이 장점: while에 비해 가독성이 좋고 개발에 편리함
		// for문의 단점 : while만큼 자유롭지는 않음
		
	}
}
