package day05;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car();
		Car c5 = new Car();
		
		c1.b("검정", "아빠차", "BMW");
		c2.b("빨강","엄마차","모닝");
		c3.b("파랑","나","아우디");
		c4.b("흰색","동생","아반떼");
		c5.b("회색","홍길동","모닝");
	
	System.out.println(c1.n());
	System.out.println(c2.n());
	System.out.println(c3.n());
	System.out.println(c4.n());
	System.out.println(c5.n());
	}
	

}
