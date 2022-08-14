package day16;

public class _04_while {

	public static void main(String[] args) {
		/*반복문
		 * while(){}
		 * for(){}
		 * 
		 * while은 if와 비슷하나 반복을 한다는 특징이 있음
		 */
		int age = 30;
		if(age>=20) {
			System.out.println("성인");
		}
		while(age >=20) {
			System.out.println("성인 반복");
		}
		int i =0;
		while(age >= 20 && i < 5) {
			System.out.println("성인반복2");
		}
	}

}
