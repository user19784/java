package day02;

public class Oper4 {

	public static void main(String[] args) {
     // 비교 연산자
		/*
		== 같다, 
		!= : 다르다
		< 왼쪽이 오른쪽보다 작다
		> 오른쪽이 왼쪽보다 작다
		<= 이하
		>= 이상

         비교 연산자는 왼쪼고가 오른쪽을 비교하고 결과를 true 혹은 false 로 알려줍니다 (boolean type)
		 */
		int num = 10;
		System.out.println(num == 1+2+3+4);
		System.out.println(num != 10);
		System.out.println(num < 1+2+3);
		System.out.println(num > 2147483647);
		System.out.println(num <= 2147483647);
		System.out.println(num >= 2147483647);
	}

}
