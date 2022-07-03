package day04;

import java.util.Scanner;

public class Quiz1 {  

	public static void main(String[] args) {

		final String id = "world";
		final String USER_PASSWORD = "hello";
		Scanner Scanner = new Scanner(System.in);
	    
		boolean accessOK = true; 
	    		for (int i = 1; i <= 5; i++) {
	    			
	    	System.out.printf("아이디를 입력해주세요 >>");
	    	String id1 = Scanner.nextLine();
	    	
			System.out.printf("password >> ");
			String password = Scanner.nextLine();

			if (password.equals(USER_PASSWORD) && id1.equals(id)) {
				System.out.print("로그인 성공하셨습니다.");
				accessOK = true; 
				break;
			} else {
				System.out.printf("비번이 틀렸습니다 혹은 아이디가 틀렸습니다. (%d)\n", i);
			}
		}
		
	    Scanner.close(); 
		
		if (!accessOK) {
			System.out.println("접속거부");
		} 
	}
}


