package day13;

public class Array1 {
		public static void main(String[] args) {
			Arr1 a1 = new Arr1();
			a1.go();
		}
}

class Arr1{
	public void go() {
		//배열 : 같은 주제를 가진 변수들을 뭉쳐놓은 변수
		//ex) 카페메뉴들, 음식메뉴들, ...
		
		//배열 선언(공간을 만드는 법)
		//자료형 변수명[]
		String menu[]= {"라면","김밥","떡볶이","순대"};			//4칸짜리 menu를 만들어서 값을 담음
		
		int price [] = new int [] {3000,1000,2000,3000,};
				
//				price[0] = 3000;
//				price[1] = 1000;
//				price[2] = 2000;
//				price[3] = 3000;
		
		for(int i=0; i<price.length; i++) {
		//배열의 단점: 수정이 쉽지 않음
		//ex)값을 중간에 삽입, 배열 크기를 늘리기
		
		String save = menu[2];
		menu[2] = menu[3];
		menu[3] = save;
		
		int price_bk = price[2];
		price[2] = price[3];
		price[3] = price_bk;
		
		System.out.println(menu[i] + price[i]);
		}
	}
}
