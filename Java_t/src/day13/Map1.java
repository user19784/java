package day13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Map1 {

	public static void main(String[] args) {
		MyDictionary m = new MyDictionary();
		m.go();
	}

}

//Map : 사전
// ArrayList : {1,2,3,4}
//Map : {"키워드": "값1", "키워드2": 값2};

class HMap1{
	public void go() {
		HashMap<String, Double> hm1 = new HashMap<>();
		
		// 추가 put
		hm1.put("일", 1.0);
		hm1.put("이", 2.0);
		hm1.put("삼", 3.0);
		hm1.put("사", 4.0);
		
		System.out.println(hm1.get("일"));
		System.out.println(hm1.get("이"));
		System.out.println(hm1.get("삼"));
		System.out.println(hm1.get("사"));
	}
}

class MyDictionary{
	private String search;
	public void go() {
		HashMap<String, String> hm1 = new HashMap<>();
		
		hm1.put("대한민국", "서울");
		hm1.put("인도", "뉴델리");
		hm1.put("일본", "도쿄");
		hm1.put("중국", "베이징");
		hm1.put("러시아", "모스크바");
		hm1.put("우크라이나", "키이우");
	
	Scanner sc = new Scanner(System.in);
	System.out.printf("수도가 궁금한 나라를 입력하세요 ");
		search = sc.nextLine();
	if(hm1.containsKey(search)) {
		
		System.out.println("검색한 나라의 수도는: "+hm1.get(search));
	}else if(!hm1.containsKey(search)) {
		System.out.println("검색 결과가 없습니다");
	}

	}
}
