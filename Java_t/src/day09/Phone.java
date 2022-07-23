package day09;

public class Phone {

	public static void main(String[] args) {
		
	}

}


// 인터페잉스1 : 상속을 여러개 하기 위해서
// 인터페이스2 : 반드시 만들어 줘야하는 함수를 정해놓기 위해서
// 인터페이스3 : 다형성

interface KPhone {
	// 전화, 문자
	void call(int num); //전화
	void msg(int num, String str);  //문자
}

class _2Gphone implements KPhone{
	//2G폰을 만드는 사람은 전화와 문자기능을 빼놓을 수 없음

	@Override
	public void call(int num) {
		//반드시 만들어줘야하는 기능
	}

	@Override
	public void msg(int num, String str) {
		// 반드시 만들어줘야하는 기능2
		System.out.println(num+"문자를 보냅니다."+str);
		
	}
	
   class _3Gphone extends _2Gphone{
   public void internet() {
	System.out.println("인터넷");
   }	
   	}
   
   class _4Gphone extends _3Gphone{
	   public void speed() {
		   System.out.println("LTE");
	   }
   }
   
   class _5Gphone extends _4Gphone{
	   public void BD() {
		   System.out.println("bigdata");
	   }
   }
}