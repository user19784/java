package day06;

 class Person {

	
	private String n;
	private String g;
	private int a;
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
	
}


public class Class7 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setN("엄준식");
		p.setG("한국");
		p.setA(23);
		System.out.println("이름은: "+p.getN()+"나라는: "+p.getG()+"나이는: "+p.getA());
		
		Person p1 = new Person();
		p1.setN("아무개");
		p1.setG("캐나다");
		p1.setA(22);
		System.out.println("이름은:"+p1.getN()+" 나라는:"+p1.getG()+" 나이는:"+p1.getA());
		
	}

}



