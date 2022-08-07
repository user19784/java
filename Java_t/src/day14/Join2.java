package day14;

public class Join2 {

	public static void main(String[] args) {
		BGMPlay b = new BGMPlay();
		b.start();
		BGMPlay2 b2 = new BGMPlay2();
		try {
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b2.start();
	}

}

class BGMPlay extends Thread{			
    @Override
    public void run() {
    	for(int i=0; i<10; i++) {
 

            System.out.println("배경 음악 재생 중......");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        
    }    
}


class BGMPlay2 extends BGMPlay{
    @Override
    public void run() {
    	for(int i=0; i<5; i++)

            System.out.println("2번째 배경 음악 재생 중......");
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
    }  
}


 