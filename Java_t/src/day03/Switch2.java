package day03;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요>> ");
		int num = scan.nextInt();
		switch(num) {
		case 1 :
			System.out.println("1번입니다.");break;
		case 2:
			System.out.println("2번입니다.");break;
		case 3:
			System.out.println("3번입니다.");break;
		case 4:
			System.out.println("4번입니다.");break;
		default:
			System.out.println("해당 항목이 없습니다.");
		}

	}

}
