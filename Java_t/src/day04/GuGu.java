package day04;

import java.util.Scanner;

public class GuGu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("단을 입력해주세요>>");
		int su = scan.nextInt();
		int mul=0;
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
		mul = i*j;
		System.out.println(i+"X"+j+" = "+mul);
		if(j ==9) System.out.printf("\n");
			}
	}
	}
}
