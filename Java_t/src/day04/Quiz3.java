package day04;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("구구단을 입력해주세요>> ");
			int i =scan.nextInt();
			int mul=0;
			
			for(int j = 1; j<=9; j++) {
			mul = i*j;
			System.out.println("내가 입력한 단>> "+i+"X"+j+"="+mul);
			}
		}

	}
