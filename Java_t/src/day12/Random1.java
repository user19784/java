package day12;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Rand1 r1 = new Rand1();
		r1.go1();
	
		Rand1 r2 = new Rand1();
		r2.go2();
		
		Rand1 r3 = new Rand1();
		r3.go3();
	}

}

class Rand1{
		Random rand = new Random();
	public void go1() {
		int result = rand.nextInt(10);
		System.out.println(result);
	}
	
	public void go2() {
		int result = rand.nextInt(10)+1;
		System.out.println(result);
	}
	
	public void go3() {
		
		for(int i=100; i<=105; i++) {
			System.out.println((int) (Math.random() *6)+100);
		break;
		}
		
	}
}


