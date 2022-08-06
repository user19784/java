package day13;

import java.util.HashMap;
import java.util.Scanner;

public class Map3 {

	public static void main(String[] args) {
		Nations n = new Nations();
		n.go();

	}

}

class Nations{
	private String search;
	public void go() {
		HashMap<String, String> hm1 = new HashMap<>();
		
		hm1.put("대한민국", "서울");
		hm1.put("인도", "뉴델리");
		hm1.put("일본", "도쿄");
		hm1.put("중국", "베이징");
		hm1.put("러시아", "모스크바");
		hm1.put("우크라이나", "키이우");
		hm1.put("미국", "워싱턴");
		System.out.println("검색 가능한 나라: "+hm1.keySet());
		
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