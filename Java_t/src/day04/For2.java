package day04;

public class For2 {

	public static void main(String[] args) {
//		for(int i=0; i<5; i++) {
//		System.out.println("안녕하세요");
//		System.out.println("반갑습니다");
//	}
//		
		//반복문 활용한 계산
		//{}: 범위.  {}안에서 만들어진 변수는 {}가 끝나면 삭제됨
		//{}: 밖에서 만들어진 변수는 {}가 끝나고 유지가 됨 (공간, 값)
//		int sum = 0;
		//1~9까지 합산==45
//		for(int i=0; i<9; i++) {
//			sum +=i;
//		}
//		System.out.println(sum);
//		
		//total 1~50까지의 합 : 1275
		
		int sum=0;
		sum= sum++;
		for(int i=0; i<=50; i++) {
			sum+=i;
			System.out.println("합: "+sum);
		}
	}
}
