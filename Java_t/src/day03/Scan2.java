package day03;

import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("아이디를 입력하세요>> ");
		String id = scan.next();
		System.out.printf("비밀번호를 입려하세요>> ");
		int pass = scan.nextInt(); 
		
		if(id.equals("hello") && pass == 1234 ) {
			System.out.println("아이디와 패스워드가 일치합니다");	
		}else {
			System.out.println("아이디와 패스워드가 불일치합니다.");
		}
	}

}
