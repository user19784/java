package day07;

public class Extends2 {

	public static void main(String[] args) {
		Human h1 = new Human("",1);
		h1.Info();
	}

}

class Human{
	private String n;	//private : 내 클래스 안에서만 사용 가능
	private int a;		//protected : 상속받은 곳까지는 허용
						//default : 내 패키지 안에서만 사용 가능
						//public : 모두 사용 가능
class Member extends Human{
	Member(String n, int a) {
		super(n, a);
							}

	public void go() {
		
		n = "aa";
		a = 1;
		
	}
	
	
}

Human(String n,int a ){
	this.n=n;
	this.a=a;
	
	
}
public void Info() {
	System.out.println("이름은"+n+" 나이는"+a); 
}

public void Info(String n,int a) {
	this.n=n;
	this.a=a;
	System.out.println("이름은"+n+"나이는"+a);
}

public void go() {
	System.out.println("실행");
}
}