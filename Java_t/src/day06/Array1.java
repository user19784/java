package day06;

public class Array1 {

	public static void main(String[] args) {
		Array1Ex arrayEx = new Array1Ex();
		arrayEx.go();
	}

}
class Array1Ex{
	public void go() {
		int n1=1000, n2=1500, n3=2000, n4=3000;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
		int num [] = {1000, 2000, 3000, 4000};
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		String ss[] = {"a","b","c","d"};
		int nn [] = {1,2,3,4};
		double dd[] = {0.0,0.1,0.2,0.3};
		boolean bb[] = {true,false,true,false};
	}
}