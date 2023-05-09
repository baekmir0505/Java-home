package multiThreading;

public class Sync2 {
	public static void main(String[] args) {
		// 사람 3명(Thread 3개)
		DressRoom dr = new DressRoom();
		Thread 백미르 = new Thread(dr, "백미르");
		Thread 최민석 = new Thread(dr, "최민석");
		Thread 송윤희 = new Thread(dr, "송윤희");
		
		백미르.start();
		최민석.start();
		송윤희.start();
	}
}

// 의상 탈의실
// 의류 가게에서는 한 사람이 옷을 갈아 입으러 탈의실에 들어가면 나올때까지 밖에서 대기 해줘야한다(10초)
class DressRoom implements Runnable{

	
	@Override
	public void run() {
		synchronized(this) {           // 이미 사용중이면 다른 사람은 대기
			String name = Thread.currentThread().getName();
			System.out.println(name+"탈의실 들어감");
			for(int time = 1;time < 11; time++) {
				System.out.println(name + "탈의실 사용 중... "+time+"초");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(name+" 탈의실 나옴");
		}
	}
}
	
