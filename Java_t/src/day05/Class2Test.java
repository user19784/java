package day05;

public class Class2Test {

	public static void main(String[] args) {
		Class2 cl = new Class2();
		int [] array=new int [] {1,2,3,4};
		System.out.println(cl.add(array));
		
	Class2 c1 = new Class2();
	int [] num = new int [] {0};
	System.out.println(cl.sub(num));
	
	Class2 c2 = new Class2();
	int [] num1 = new int [] {4,3};
	System.out.println(c1.mul(num1));
	
	Class2 c4 = new Class2();
	int [] num3 = new int [] {2,1};
	System.out.println(c4.div(num3));
	}

}
