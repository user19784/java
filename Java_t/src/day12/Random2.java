package day12;

import java.util.Random;
import java.util.Scanner;

public class Random2 {

	public static void main(String[] args) {
	A a1 = new A();
	a1.go();
	}
}

class A{
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	public void go() {
		System.out.println("첫번째 숫자를 입력해 주세요");
		int c = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		int d = sc.nextInt();
		if(c < d) {
			System.out.println((int) (Math.random()* (c-d)+d));
		}
		else if(d<c) {
			System.out.println((int) (Math.random()* (d-c)+c));
	    }
	}
	
}