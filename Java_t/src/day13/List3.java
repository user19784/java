package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {

		Lst3 l = new Lst3();
		l.go();
	}

}

class Lst3{
	public void go() {
		ArrayList<String> arr2 = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.printf("추가할 항목 입력(0을 입력하면 종료)");
		String str = scan.next();
		if(str.equals("0")) {
			break;
			
		}else {
			arr2.add(str);
		}
		}
		for(int i=0; i<arr2.size(); i++) {
			System.out.println(arr2.get(i)+"");
		}
	}
}