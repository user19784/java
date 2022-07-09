package day05;

public class Human {
	
	String n;
	String s;
	int a;
	int c;
	
	public void t(String n, String s, int a, int c) {
		this.n=n;
		this.s=s;
		this.a=a;
		this.c=c;
	}
	
	public String print() {
		return"이 사람의 이름은: "+n+"\n성별은: "+s+"\n이 사람의 나이는: "+a+"\n이 사람의 키는: "+c;
	
	}
}
