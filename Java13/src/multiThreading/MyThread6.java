package multiThreading;

import java.util.Scanner;

public class MyThread6 {
	public static void main(String[] args) {
		MyModel mm = new MyModel();
		
		Models1 md1 = new Models1(mm);
		Models2 md2 = new Models2(mm);
		Models3 md3 = new Models3(mm);
		
		md1.start();
		
		try {       
			md1.join();           // md1의 실행을 보장
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		md2.start();
		
		try {
			md2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		md3.start();
		
	}
}

// 쓰레드 3개를 만든 다음
// join을 통해서
// 첫번째의 쓰레드가 먼저 수행된 다음 
// 나머지 쓰레드가 수행되게 해주세요
// for문 1초마다

class Models1 extends Thread{
	MyModel mm;
	
	public Models1(MyModel mm) {
		this.mm = mm;
	}
	
	@Override
	public void run() {
		mm.list.add("안녕!");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mm.list.add("반갑!");
	}
}

class Models2 extends Thread{
	MyModel mm;
	
	public Models2(MyModel mm) {
		this.mm = mm;
	}
	
	@Override
	public void run() {
		for(String str : mm.list) {
			System.out.println(str);
		}
	}
}

class Models3 extends Thread{
	MyModel mm;
	
	public Models3(MyModel mm) {
		this.mm = mm;
	}
	
	@Override
	public void run() {
		mm.list.set(0, "반갑!");
		System.out.println("쓰레드5");
		for(String str : mm.list) {
			System.out.println(str);
		}
	}
}