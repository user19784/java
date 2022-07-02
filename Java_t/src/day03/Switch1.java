package day03;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요>> ");
		int a =  scan.nextInt();
		
		switch(a) {
		case 0:
			System.out.println("숫자는 0입니다."); break;
		case 1:
			System.out.println("숫자는 1입니다."); break;
		case 2:
			System.out.println("숫자는 2입니다."); break;
		case 3:
			System.out.println("숫자는 3입니다."); break;
			default:
				System.out.println("일치하는 숫자가 없습니다.");
		
		}
	}

}
