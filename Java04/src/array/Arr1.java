package array;

public class Arr1 {
	public static void main(String[] args) {
		// 배열 : 같은 주제의 변수들을 한 곳으로 뭉쳐놓은것
		
		// 정수형 배열 
		int numbers[] = {1,2,3,4};     // 정수변수 4개를 한 곳(numbers)으로 뭉침
		
		// 실수형 배열
		double dnumbers[] = {1.1, 2.2, 3.3, 4.4};      // 실수변수 4개를 dnumbers로 뭉침
		
		// 문자열형 배열
		String strs[] = {"안녕하세요", "감사해요", "잘있어요", "다시만나요"};      // 문자열 변수 4개를 strs로 뭉침
		
		// 값을 넣진 않고 공간만 만듦 (기본값 또는 임의의 값이 들어가 있음)
		int nums[] = new int[5];      // 정수변수 5개를 묶어만듬
		double dnums[] = new double[3];
		String ss[] = new String[4];
		
	}
}
