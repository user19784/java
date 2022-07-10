package day06;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Array4Ex g = new Array4Ex();
		g.go();
		
	}

}
class Array4Ex{
public void go() {
	Scanner scan = new Scanner(System.in);
	System.out.printf("어느 나라의 수도가 궁금하세요??>> ");
	String c = scan.next();
	
	String a[] = {"대한민국","일본","중국","인도",};
	String [] g = {"서울","도쿄","베이징","뉴델리"};
	
	
	for(int i=0; i<a.length; i++) {
	if(c.equals(a[i])) {
		
		System.out.println(a[i]+"의 수도는"+g[i]+"입니다!"); break;
	}
	
	
	}	
}	
}
