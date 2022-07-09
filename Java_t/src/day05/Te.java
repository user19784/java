package day05;

public class Te {

	static int add4(int a, int b ) {
		
		
		if(a<0 && b<0) {
			a *=-1;
			b *= -1;
		}else if (a<0 && b>0) {
			a *=-1;
		}else if(a>0 && b<0) {
			b *=-1;
		}
		return a-b;
	}


}
