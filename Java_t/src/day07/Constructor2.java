package day07;

public class Constructor2 {

	public static void main(String[] args) {
		Person pe = new Person("사람", "대한민국", 20);
		pe.go();
		
	}

}

class Person{
	private String n;
	private String g;
	private int a;
	
	public void go() {
		System.out.println("이름은: "+getN()+"나라는: "+getG()+"나이는: "+getA());
	}
	
	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	Person(String n, String g, int a){
		setN(n);
		setG(g);
		setA(a);
		
		
	}
		
	
	
	
}

	