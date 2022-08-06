package day13;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
//		List : 순서대로 추가
//		Set : 순서없이 추가
//		Map : 순번의 이름을 직접 정해서 추가
	}

}

class Lst1{
	public void go() {
	ArrayList<String> arr1 = new ArrayList<>();
	ArrayList<String> arr2 = new ArrayList<>();
	ArrayList<Integer> arr3 = new ArrayList<>();
	ArrayList<Integer> arr4 = new ArrayList<>();
	
	//추가
	arr1.add("라면");
	arr2.add("떡볶이");
	
	
	arr3.add(3000);
	arr3.add(2000);
	
	//사용
	System.out.println( arr1.get(0));
	
	
	//수정
	arr1.set(2, "라볶이");
	
	//삭제 
	arr1.remove(2);
	
	//전체 출력 방법
	for(int i=0; i<arr1.size(); i++) {
		System.out.println(arr1.get(i)+":"+arr2.get(i));
	}
	}
}