package collection_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Set2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NationSet ns = new NationSet();
		int choice = 0;
		String nation = "";
		
		while(true) {
			System.out.println("== 국가 이름 저장 프로그램 == ");
			System.out.println("1.추가 2.조회 3.변경 4. 삭제 0.끝내기");
			choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				System.out.println("추가할 국가명을 입력>> ");
				nation = sc.nextLine();
				ns.addNation(nation);
			}else if(choice == 2) {
				ns.showAll();
			}else if(choice == 0) {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			}else if(choice == 3) {
				// 변경
				System.out.println("변경할 항목을 입력하세요>>");
				nation = sc.next();
				System.out.println("변경 후의 국가명을 입력하세요>>");
				nation = sc.nextLine();
				ns.setNation(nation,nation);
			}else if(choice == 4) {
				// 삭제
			}
		}
	}
}

// 국가 이름을 보관하는 프로그램, 중복값이 없어야 한다
class NationSet {
	// 멤버변수 private
	private HashSet<String> hs = new HashSet<>();
	
	
	// 메서드 public
	public void addNation(String nation) {
		hs.add(nation);
	}
	
	public void deleteNation(String nation) {
		hs.remove(nation);
	}
	
	public void setNation(String nation, String nation_after) {
		hs.remove(nation);
		hs.add(nation_after);
	}
	
	public void showAll() {
		for(String e : hs) {
			System.out.println(e);
		}
		
	}
}