package day04;

public class While1 {

	public static void main(String[] args) {
		//if () {} 조건문, switch(){} 조건문 , while(){} 반복문		
//		int a=5;
//		for(int i=0; i<5; i++) {
//		while(a == 5) {                ~동안, ()안에 있는 조건이 맞는 동안에는 {}의 내용을 반복실행
//		System.out.println("안녕하세요"); 대신, {}내용 모두 실행하고는 {}의 조건을 다시 검사
//	break;
//	
//		}
//	}
		int a=0;
		while(a<10) {
			a++;
			System.out.println("나무를 "+a+"번 "+"찍었습니다");
			if(a ==10) {
				System.out.println("나무를 넘어갑니다.");
			}
		}

}
}
