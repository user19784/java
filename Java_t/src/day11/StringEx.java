package day11;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		StringEx1 s = new StringEx1();
		s.go(0);
	
		
	}

}

class StringEx1{
		public void go(int num) {
			Scanner sc = new Scanner(System.in);
			System.out.println("금액을 입력하세요");
			num = Integer.parseInt(sc.nextLine());
			if(999>=num) {
				System.out.println(num);
			}else if(num<=9999) {
				System.out.printf("%,d", num);
			}else if(num<=99999) {
				System.out.printf("%,d", num);
			}else if(num <=999999) {
				System.out.printf("%,d", num);
			}else if(num <=9999999) {
				System.out.printf("%,d", num);
			}else if(num <=99999999) {
				System.out.printf("%,d", num);
			}else if(num <=999999999) {
				System.out.printf("%,d", num);
			}else if(num <=999999999) {
				System.out.printf("%,d", num);
			}else if(num <=2147483647) {
				System.out.printf("%,d", num);
		}
		}
}