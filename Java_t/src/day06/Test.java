package day06;

import java.util.Scanner;

 class testday4 {

		private int num1, num2;
		private char op;


		public testday4(int a, char b, int c) {
			num1 = a;
			op = b;
			num2 = c;
		}

		// 데이터 변수 입력은 메소드
		public void setA(int data) {
			num1 = data;
		}
		public void setB(char data) {
			op = data;
		}
		public void setC(int data) {
			num2 = data;
		}

		public int getA() {
			return num1;
		}
		public char getB() {
			return op;
		}
		public int getC() {
			return num2;
		}


		// 연산 메소드
		public int add() {	// 더하기
			System.out.print(num1+" + "+num2+" = ");
			return num1+num2; 
		}
		public int sub() {	// 빼기
			System.out.print(num1+" - "+num2+" = ");
			return num1-num2; 
		}
		public int mul() {	// 곱
			System.out.print(num1+" * "+num2+" = ");
			return num1*num2; 
		}
		public float div() {	// 나눔
			System.out.print(num1+" / "+num2+" = ");
			return (float)num1/num2;
		}



		public static void main(String[] args) {
			char str;
			testday4 ce = new testday4(2, "+", 3); // 생성자 객체 생성
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("사칙연산계산기");
			System.out.println("ex) 1 + 2 enter >> ");
			System.out.print("계산 입력 : ");
			
			do {
			ce.setA(sc.nextInt());
			ce.setB(sc.next().charAt(0));
			ce.setC(sc.nextInt());	
					
			if (ce.getB() == '+'){
				System.out.println(ce.add());
			}
			else if(ce.getB() == '-'){
				System.out.println(ce.sub());
			}
			else if(ce.getB() == '*'){
				System.out.println(ce.mul());
			}
			else if(ce.getB() == '%'){
				System.out.println(ce.div());
			}
			
			System.out.println();
	        System.out.print("Continue?(y/n) : ");
	        str = sc.next().charAt(0);
	        if(str == 'n' || str == 'N') {
	           System.out.println("End");
	           break;
	        }
			}while(str == 'y' || str == 'Y');
			
		}
}
