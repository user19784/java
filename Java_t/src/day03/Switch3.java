package day03;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("점수를 입력하세요>> ");
		int score = scan.nextInt();
		switch(score/10) {
		case 9:
			System.out.println("A등급 입니다."); break;
		case 8:
			System.out.println("B등급 입니다."); break;
		case 7:
			System.out.println("C등급 입니다."); break;
		case 6:
			System.out.println("D등급 입니다."); break;
		default:
			System.out.println("E등급 입니다.");
		}

	}

}
