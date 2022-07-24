package day10;

public class ReviewImpl extends ReviewAdapter{
	static String str= "";
	public static void main(String[] args) {
		Review r1 = new ReviewImpl();
		r1.func1();
		r1.func2(11);
		
		final int number = 12;				//final로 만든 변수는 수정이 불가능
	//	number = 33; 안됨  불가능
		
	}
	@Override
	public void func1() {
		String str = "";						//
		System.out.println("impl에서 구연");		
	}

	}

class Review2{
	public void go() {
		ReviewImpl.str = "객체화없이 정적변수 대입/사용";                 //static 변수는 프로그램 성능을 저하할 수 있으므로 사용을 최소화
	}
}