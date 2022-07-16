package day07;

public class Review {

	public static void main(String[] args) {
		
		Reviewclass rc = new Reviewclass();	//객체화
		Reviewclass re = new Reviewclass();
		
		
		rc.go(); //Reviewclass go라는 함수 실행
		re.numChange();
	}

}
class Reviewclass{
	private int num[] = {1,2,3,4};
	public void go() {

		System.err.println("객체화 성공!!");
		numChange();
	}
	
	public void numChange() {
		int sum = num[0];
		num[0] = 11;
		num[1] = 22;
		num[2] = 33;
		num[3] = 44;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		
		}
		System.out.println(sum);
		
	}
	
	
		
	
}
