package day14;

import java.util.Scanner;

public class Thread2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
      
		while(true) {
			String a = scan.nextLine();
		System.out.println("아무거나 입력 ㄱㄱ >> ");
	for(int i=0; i<9999; i++) {
		System.out.println(a);
		Thread.sleep(500);
		System.out.println("Hello world");
		Thread.sleep(500);
	} 
	}
	}
	}

