package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {

	public static void main(String[] args) {
		Menu1 m = new Menu1();
		m.go();
		
	}

}

class Menu1 {
	private int choice = -1;
	
	public void go() {
	ArrayList<String> arr = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	String str1 = "", Str2 = "";
	

	
	while (true) {
		System.out.println("[1.추가 2.수정 3.제거 4.보기 0.종료]");
		choice = scan.nextInt();
		if(choice == 1) {
			System.out.println("추가할 항목 입력>>");
			 str1 = scan.next();
			 arr.add(str1);
			 
		}else if(choice == 2) {
			System.out.println("수정할 위치 입력>>");
			int index = scan.nextInt(arr.size());
			System.out.println("수정할 내용을 입력하세요");
			Str2 = scan.next();
			arr.set(index, Str2);
		
		}else if(choice == 3) {
			System.out.println("삭제할 위치 입력>>");
			int index = scan.nextInt(arr.size());
			String str3 = arr.remove(index);
			
		}else if(choice == 4) {
			for(int i=0; i<arr.size(); i++) {
				System.out.println(arr.get(i));
			}
			
		}else if(choice == 0) {
			break;
			
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
	}
	for(int i=0; i<arr.size(); i++) {
		System.out.println(arr.get(i));
	}
	System.out.println("프로그램 종료");
	}
}