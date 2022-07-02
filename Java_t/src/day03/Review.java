package day03;

public class Review {

	public static void main(String[] args) {
		//출력 
		System.out.printf("큰따옴표 열고 쓰고싶은 말\n");
		System.out.println("실행은 Ctr1누른채로 F11");
		//변수
	// boolean(참,거짓) byte(정수) short(정수) char int(정수) 
		//float(소수) long(소수) double(소수) 
		int a = 0;
		double d = 0.0;
		boolean b = true;
	    // 자료형 변수명;
		//변수는 저장공간
		//변수 사용 : 변수 아나에 저장된 데이터 사용
		
		// if(조건문){} :	상황에 따라서 동작을 다르게 
		if(a>0) {
			System.out.println("정수는 양수입니다");
			//정수에 있는 데이터는 0보다 크지 않기 때문에 이부분은 무시
			
		}else if(a == 0) {
			System.out.println("정수는 0과 같습니다");
		//정수에 들어있는 데이터가 0일 때만 실행
			
		}else {
			//if 와 else if 가 모두 해당하지 않을경우 싱행
			System.out.println("정수는 음수입니다.");
			//첫번째 else if에서 싱행됬기 때문에 여기까지 오지 않음
		}
}
}