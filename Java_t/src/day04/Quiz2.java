package day04;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=4; i>=0; i--) {
		System.out.println("대한민국 수도를 입력해주세요 >>");
		String s = scan.nextLine();
		String n ="서울"; 
		
		if(s.equals(n)) {
			System.out.println("정답입니다");
			
		}else if(!(n==s)) {
			System.out.println("다시 시도해 주세요! "+i+"번 남았습니다.");
			
		}
		if(i==0) System.out.println("횟수를 초과하셨습니다. 게임을 종료합니다.");	
		}
		
		scan.close();
		
	
	}

}
