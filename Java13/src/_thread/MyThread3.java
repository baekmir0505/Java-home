package _thread;

import java.util.Scanner;

public class MyThread3 {
	public static void main(String[] args) {
		// 객체화 2개
		MyInput2 input2 = new MyInput2();
		MyInput3 input3 = new MyInput3();
		
		// Start() 2개
		input2.start();
		input3.start();
	}
}

// 클래스 2개를 생성해서 쓰레드를 각각 상속받고 
// 반복문을 100번 돌려서 0.5초마다 동시에 출력
// 1. 쓰레드1
// 2. 쓰레드2

class MyInput2 extends Thread{
	
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("쓰레드1");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyInput3 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("쓰레드2");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}