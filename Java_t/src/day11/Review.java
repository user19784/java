package day11;

public class Review {

	public static void main(String[] args) {
		ReviewTest rt = new ReviewTest();
		rt.go();
	}

}

class ReviewTest{
	String str = "문자열";
	public void go() {
		System.out.println("복습페이지");
		str.equals("문자열"); //같은지 비교
		System.out.println(str.charAt(0));		//0번째 있는 문자 가져오기
		System.out.println(str.contains("문자열"));
		String ss = str.replace("문자열", "글자 출력");
		System.out.println(ss);
		
		System.out.println(ss.substring(0, 2));  // 잘라내기
		System.out.println(ss.indexOf("글자"));
		
		String str1 = "1";					//문자열 ->정수
		int num =Integer.parseInt(str1);	
		System.out.println(num+1);
		
		str1 = Integer.toString(num);		//정수 -> 문자열
		System.out.println(str1+1);
		
		
		str1 = "" +num;						// 이거 써도됨
		System.out.println(str1+1);
	}
}