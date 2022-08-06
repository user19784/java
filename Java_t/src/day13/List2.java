package day13;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		Lst2 l = new Lst2();
		l.go();
		
	}

}

class Lst2{
	public void go() {
		ArrayList<String> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr1.add("아메리카노");
		arr1.add("카페라때");
		arr1.add("카페모카");
		arr1.add("카라멜마끼아또");
		arr1.add(0, "에스프레소");
		arr1.set(4, "오렌지주스");
		arr1.remove(4);
		arr1.remove("카페모카");
		
		arr2.add(4000);
		arr2.add(3500);
		arr2.add(6000);
		arr2.add(5000);
		
		System.err.println(arr1.get(0));
		
		System.out.println(arr1.indexOf("에소프레소"));
		
		System.out.println(arr1.size());
		
		for(int i=0; i<arr1.size(); i++) {
			System.out.println(arr1.get(i)+ ":" + arr2.get(i));
		}
		
		
		
	}
}