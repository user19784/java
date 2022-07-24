package day10;

import java.util.Scanner;

public class Try3 {

	public static void main(String[] args) {
		Try3Ex a = new Try3Ex();
		a.A();

	}

}

// 함수 3개를 만들고 main 사용




//예외처리 작업


class Try3Ex{

	public void A() {                           // 1. 스캐너의 nextInt()
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요 >>");
		int num = scan.nextInt();
		System.out.println("두번째 숫자를 입력해주세요>> ");
		int num1 = Integer.parseInt(scan.next());
		
		try {
		System.out.println(num/num1);
		}catch (Exception e) {
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
	
}