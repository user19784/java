package day04;

public class Loop1 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i == 6) 
				break;
		
		System.out.println(i);
		}System.out.print("\n");
		//break : 반복문 즉시종료
		//continue : 반복문 1회성 종료(원래는 중괄호 마치고 조건을 검사하지만, 바로 저건 검사로 넘어감)
	for(int i = 1; i<11; i++) {
		if(i%2==1) continue;
		System.out.println(i);
	}
	
	
	
	}

}
