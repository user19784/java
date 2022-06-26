package day02;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
      
		//if : 조건문
		//현 상황에 맞춰서 내 프로그램의 동작을 결정하고 싶을 때
//		예시 : 버스 성인/청소년/어린이 ->if 사용
		/*
		 if(조건){
		 //조건이 맞을때 실행할 코드
		  }
		  //만약 조건이 맞지 않으면 if() 옆의 {}코드가 실행 안됨
		 */
       Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		System.out.println("나이를 입력하세요 : "+ age);
       if(age >= 20) {
    	   System.out.println("성인입니다");
       }
       if(age < 20) {
    	   System.out.println("미성년자 입니다.");
       }
	}

}
