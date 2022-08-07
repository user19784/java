package day14;

import java.awt.desktop.ScreenSleepEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class Join1 {
	static ArrayList<String>
	public static Object ar;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




class InitClass{
	ArrayList<String> ar = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	private String ss;
	
	public void run() {
		while(true) {
			ss = scan.nextLine();
			ar.add(ss);
			if(ss.equals("0"))
				break;
			Join1.ar.add(ss);
			try {
			Thread.sleep(100);
		
			}catch (InterruptedException e) {
					e.printStackTrace();
			}
			}
	}
	
}

class AfterClass extends Thread{
	
}