package day03;

import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("국어 점수를 입력하세요>> ");
		int g =scan.nextInt();
		
		System.out.printf("영어 점수를 입력하세요>> ");
		int e =scan.nextInt();
		
		System.out.printf("수학 점수를 입력하세요>> ");
		int m = scan.nextInt();
		
		int total = g+e+m;
		
		if(g>=40 && e>=40 && m>=40 && total>=150) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		scan.close();
		}
		
	}

}
