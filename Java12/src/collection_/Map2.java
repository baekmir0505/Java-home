package collection_;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.추가 2.변경 3.삭제 4.조회 0.끝내기
		MyDictionary dic = new MyDictionary();         // 생성자에서 flower:꽃, sea:바다, new:새로운
		String word1 = "", word2 = "", temp = "";
		int choice = 0;
		
		while(true) {
			System.out.println("1.추가 2.변경 3.삭제 4.조회 0.끝내기");
			choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				// 1. 추가
				System.out.print("추가할 영단어를 입력하세요>> ");
				word1 = sc.nextLine();
				System.out.print("추가할 한국어 뜻을 입력하세요>> ");
				word2 = sc.nextLine();
				dic.
			}else if(choice == 2) {
				// 2.변경
				System.out.println("변경할 영단어를 입력하세요>> ");
				word1 = sc.nextLine();
				System.out.println("변경 후 한국어 뜻을 입력하세요>> ");
				word2 = sc.nextLine();
				dic.
			}else if(choice == 3) {
				// 3. 삭제
				System.out.println("삭제할 영단어 또는 한국어 뜻을 입력하세요>> ");
				word1 = sc.nextLine();
				dic.deletWord(word1);
			}else if(choice == 4) {
				// 4.조회
				// dic
			}else if(choice == 0) {
				// 0.끝내기
				break;
			}else {
				/* no actions */
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}

// 한영사전 만들기
// 생성자에 단어 3개정도 만들기
class MyDictionary{
	// 멤버변수 private
	private Map<String, String>map;        // 다형성 (Map은 HashMap의 부모 클래스)
	
	
	// 메서드 public
	public MyDictionary() {
		map = new HashMap<String,String>();
		map.put("flower","꽃");
		map.put("sea","바다");
		map.put("new","새로운");
	}
	
	public void deleteWord(String word) {
		if(map.containsKey(word)) {
			map.remove(word);               // 키 값을 찾아서 삭제
		}else if(map.containsValue(word)) {
			// 값을 통해서 키의 위치를 찾고 키값으로 삭제
			// AI
		}
	}
}