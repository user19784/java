package day14;

public class Sync2 {

	public static void main(String[] args) {
		DressRoom dr = new DressRoom();
		Thread hu1 = new Thread(dr, "사람");
		Thread hu2 = new Thread(dr, "사람2");
		hu1.start();
		hu2.start();
	}

}


class DressRoom implements Runnable{
	private int time;

	@Override
	public void run() {
		for(int i=10; i>=0; i--) {
		synchronized (this) {
			time = 0;
			System.out.println("드레스룸 들어감");
			while(time < 10) {
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
					// TODO: handle exception
				}
				time++;
				System.out.println("드레스룸 사용중..."+time+"초");
			}
		}
			System.out.println("드레스룸 비움");
			System.out.println("다음 사람 입장");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+"명 대기중");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
		}
	}
	
}