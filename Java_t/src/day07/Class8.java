package day07;

public class Class8 {

	public static void main(String[] args) {
		ClassEx ce = new ClassEx();
		ce.go();
	}

}

class ClassEx{
	private String str1;
	
	
	
	// 생성자 : 객체화를 하는 순간 무조건 사용되는 함수
	
	ClassEx(){
		setStr1("set을 먼저 써야지");
	}
	//get : 사용
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public void go() {
		setStr1("안녕하세요");
		System.out.println(getStr1());
		
	}
}
