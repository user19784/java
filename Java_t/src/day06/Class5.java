package day06;

public class Class5 {

	public static void main(String[] args) {
	}

}

class Class5Ex{
	public int num1;   //어디서든 사용가능
	protected int num2;  //
	int num3;	//같은 패키지 내에서 사용
	private int num4;	// 내 클래스 안에서만 사용가능

void test() {
	num1=0;
	num2=0;
	num3=0;
	num4=0;
}

}
