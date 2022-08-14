package day16;

public class _07_extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyClass2 extends MyClass1{
	
	public void go() {
		System.out.println("go함수로 변경하였습니다. 오버라이딩");
	}

	public void go(int num) {
		System.out.println("go함수를 정수 1개 전달받는 메서드로 만들겠습니다. 오버로딩");
	}
}