package day02;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		System.out.printf("비밀번호를 입력하세요>>");
//		int acc = scan.nextInt();
//		
//		int pass = 1234;
//		if(pass == acc) {
//			System.out.println("이라샤이마셍!!");
//		}else {
//			System.out.println("누구세용?");
//		}
		
	Scanner scan = new Scanner(System.in);	
	System.out.printf("나이를 입력하세요>>");
	int age = scan.nextInt();
	
	if(age >= 20) {
		System.out.println("성인입니다.");
	}else {
		System.out.println("미성년자 입니다.");
	}

}
}
