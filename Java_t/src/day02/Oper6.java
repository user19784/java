
package day02;

public class Oper6 {

	public static void main(String[] args) {
    // 누적 연산
		int num1 =3;
		int num2 =5;
//		num1 = 4;
//		num1 = num1;
//		num1 = num1 + 2;
//		num1 = 4;
		num1 += 5; //num1 = num1 +5
		num2 -= 2; //num1 = num1 -2
		num1 *= 1; //num1 = num1 *1
		num2 /= 2; //num1 = num1 /2
		
		

		System.out.println(num1);
		System.out.println("num2 : "+num2);
		
		//누적연산을 하는데 1만 더하거나 뺄경우 더 생략이 가능
		int num3 = 5;
		num3 += 1;
		num3++; //num3 +1;
		num3 -= 1;
		num3--; //num3 -1;
		System.out.println(num3);
		// C, C++,C++++
		
		/*
		 int num =0;
		 num++;
		 ++num;
		 num--;
		 --num
		 */
		
		// num3 == 5
		System.out.println(++num3);
		//앞에 있으면 실행중에 바로 더함
		//뒤에 있으면 문장 끝나고 더함
		
	
	
	}

}
