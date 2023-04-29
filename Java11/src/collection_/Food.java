package collection_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Food {
	public static void main(String[] args) {
		// 1.추가 2.변경 3.삭제 4.전체보기 0.끝내기
		// 음식점 항목을 관리하는 프로그램 만들기
		// 기본메뉴 : 김밥, 떡볶이, 순대
		// 가격 : 1000 ,2000, 3000
		FoodList fl = new FoodList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==항목을 선택하세요==");
		String str = "";
		String after = "";
		int choice = 0;
		String fl_name = "";
		int fl_price = 0;
		
		while(true) {
			System.out.println("1.추가 2.변경 3.삭제 4.전체보기 0.끝내기");
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("추가할 음식: ");
				str = sc.next();
				System.out.println("추가 음식의 가격");
				fl_price = sc.nextInt();
				fl.addFood(fl_name, fl_price);
			}else if(choice == 2) {
				System.out.println("변경할 음식: ");
				str = sc.next();
				System.out.println("변경 후 음식: ");
				after = sc.next();
				fl.setFood(str, after);
			}else if(choice == 3) {
				System.out.println("삭제할 음식: ");
				str = sc.next();
				fl.deleteFood(str);
			}else if(choice == 0) {
				System.out.println("프로그램 종료");
				sc.close();
				break;
			}else {
				fl.showAll();
			}
		}
	}
}

class FoodList{
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();
	
	public FoodList() {
		String arr1[] = {"김밥", "떡볶이", "순대"};
		int arr2[] = {1000, 2000, 3000};
		
		name.addAll(Arrays.asList(arr1));
		for(int i=0;i<arr2.length;++i) {
			price.add(arr2[i]);
		}
	}
	
	public void addFood(String fl_name, int fl_price) {
		name.add(fl_name);
		price.add(fl_price);
	}
	
	public void setFood(String prev, String after) {
		int number = name.indexOf(prev);
		name.set(number, after);
	}
	
	public void deleteFood(String str) {
		int number = name.indexOf(str);
		name.remove(number);
	}
	
	public void showAll() {
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i)+" : "+price.get(i)+"원");
		}
	}
}