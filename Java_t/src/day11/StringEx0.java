package day11;

import java.util.Scanner;

public class StringEx0 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.printf("가격을 입력해주세요>> ");
		int num =Integer.parseInt(sc.nextLine());
		if(999>=num) {
		System.out.println(num);
		}else if(num<=2147483647) {
			System.out.printf("%,d", num);
	}
	}
}
