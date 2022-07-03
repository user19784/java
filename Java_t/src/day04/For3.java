package day04;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
		Scanner scan = new Scanner(System.in);	
		System.out.printf("나이를 입력하세요!! >>");
		int age = scan.nextInt();
		
		if(age>=50) {
			System.out.printf("50대 이상 입니다.");
		}
		else if(age>=40) {
			System.out.println("40대 이상 입니다.");
		}else if(age>=30) {
			System.out.println("30대 이상 입니다.");
		}else if(age>=20) {
			System.out.println("20대 이상 입니다.");
		}else {
			System.out.println("미성년자 입니다.");
		}
		scan.close();
	}
	}
}
