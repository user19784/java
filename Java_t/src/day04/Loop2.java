package day04;

public class Loop2 {

	public static void main(String[] args) {
//		if 안에 if, switch
//		switch 안에 if, switch
//		for 안에 if
//		for 안에 for : 이중 for 문
		for(int i=0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.println("i ="+i+" j ="+j);
			}
		}
for(int i=0; i<3; i++) {
	if(i == 2) {
		System.out.println("i의 값은"+i);
	}
	if(i == 3 ) {
		System.out.println("i의 값은 3이다"+i);
	}
}
	
	}

}
