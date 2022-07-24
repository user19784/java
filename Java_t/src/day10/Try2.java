package day10;

import java.util.Scanner;

public class Try2 {

}

class MyClass2 extends MyClass1{
	public void go() {
		
		System.out.println("go 실행");
		scan();
		
		try {
			System.out.println(mum1/num2);
		}eatch(Exception e){
		}
		
	}
	
	
	@Override
	public void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("num2에 넣을 숫자를 입력하세요>> ");
		int num = sc.nextInt();		//숫자가 아닌 문자열을 넣으면 프로그램이 강제 종료 되어버림
		num2 = num;
		
		sc.close();
	}
}
