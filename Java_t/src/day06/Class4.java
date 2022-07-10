package day06;

public class Class4 {
	
	public int a(int [] x) {
	int	sum = x[0];
	for(int i =0; i<x.length; i++) {
		sum += x[i];
	}
	return sum;
	}
	public int b(int []x) {
		int m = x[0];
		for(int i=0; i<x.length;) {
			m -= x[i];
	}
		return m;
		
		

}

	public int c(int [] x) {
		int s = x[0];
		for(int i=0; i<x.length; i++) {
			s *=x[i];
		}
		return s;
	}
	
	public int d(int [] x) {
		int n = x[0];
		for(int i=0; i<x.length; i++) {
			n /= x[i];
		}
		return n;
	}
}
