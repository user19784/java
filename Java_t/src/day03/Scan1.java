package day03;

import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//출력 Systeam.out.printfln();
		//입력 Scanner scan = new Scanner(System.in(< 키보드로 입력받기) );
		
		//입력
		System.out.printf("글자를 입력해주세용 >>");
		String s = scan.nextLine(); //string의 scanner는 글자만 출력하는 next(Enter미포함)와
		                                      //공백도 출력하는 nextLine(Enter포함)가 있다.
		System.out.printf("숫자를 입력해주세용 >>");
		int t = scan.nextInt();
		
		//int a = Integer.parseInt(scan.next());
		//System.out.println("아무거나 입력하세요");
		
		// 입력받은 것 출력
		System.out.println("입력한 글자>> "+s);
		System.out.println("입력한 숫자>> "+t);
		//System.out.println("아무거나 입력받기"+a);
		scan.close(); //Scanner 종료
		
	}

}
