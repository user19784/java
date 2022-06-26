 package day02;

public class Oper3 {

	public static void main(String[] args) {
     
		//자료형 변환
//		double pi = 3.14;
//		System.out.println(pi);
//		System.out.println((int)pi);
//		System.out.println((double)9/4);
		
		
	  int a [] = {77,82,100}; //배열 선언
	  
	  int sum = 0; //점수 합계
	  
	  for(int i=0; i<a.length; i++) {  //배열 선언한 값을 차례대로 하나씩 더하기
		  sum += a[i]; // 배열에서 하나 sum 값에 넣고 더하고 함
	  }
	  double b = (double)sum / a.length;
	  
	  System.out.println("점수 합계 : "+ sum);
	  System.out.println("점수 평균 : "+ b);
		
		
		
		
		
	}

}
