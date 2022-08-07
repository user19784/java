package day14;

public class Sync1 {

	public static void main(String[] args) {
		Toilet to = new Toilet();
		Thread hu = new Thread(to, "사람1");
		Thread hu2 = new Thread(to, "사람2");
		hu.start();
		hu2.start();
	}

}

class Toilet implements Runnable{
	private int time;
	@Override
	public void run() {
		synchronized (this) {
			time = 0;
			System.out.println("화장실 들어감");
			while(time < 10) {
				try {
				
				Thread.sleep(1000);
				}catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				time++;
				System.out.println("화장실 사용 중..."+time+"초");
			}
			System.out.println("화장실 비움");
			
		}
	}
	
}