package day10;

public class StringClass1 {

	public static void main(String[] args) {

		
		
	}
}
class Quiz1{
	String info= "안녕하세요 저는 홍길동입니다. 잘 부탁드립니다. 안녕히 계세요.";
	
	public void name() {
		String result="";
		System.out.println("저는 홍길동입니다.");
	}
	
	public void hello() {
		System.out.println("안녕하세요");
	}
	public void bye () {
		System.out.println("안녕히 계세요");
	}
	
	public void myInfo (String info) {
		this.info = info;
	}
}




class MyString1{
	
	int var1;
	double var2;
	String var3;
	boolean var4;
	



public void go() {
	
	var3.equals("Hello world!");
	
	var3.contains("world");
	
	var3 = var3.replace("world", "Java");
	
	System.out.println(var3);
	
	var1 = var3.length();
	System.out.println(var1);
	
	var1 = var3.indexOf("!");
	System.out.println("!의 방번호는 : "+var1);
	
	char var5 = var3.charAt(10);
	System.out.println("10번째 방에 있는 문자는 "+ var3);
	
	var3 = var3.substring(0,4+1);
	System.out.println("0번부터 4번까지 자른 결과: "+ var3);
	
	var3 = var3 + "world!";
	
	
	
}


}