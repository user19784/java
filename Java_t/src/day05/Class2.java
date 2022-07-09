package day05;

public class Class2 {

	public static void main(String[] args) {
		
	}


public int add(int [] x) {
	int a = x[0];
	for(int i = 0; i<x.length; i++) {
		a += x[i];
	}
		return a;
	}
	
 public int sub(int [] x) {
   	  int s = x[0];
		for(int i=0; i<x.length; i++) {
			s -= x[i];
		}
		return s;
	}
	
public int mul(int [] x) {
	int m = x[0];
	for(int i=0; i<x.length; i++) {
		m *= x[i];
	}
		return m;
	}
	
public int div(int [] x) {
		int d = x[0];
		for(int i=0; i<x.length; i++) {
			d %= x[i];
		}
		return d;
	}


public void add(int i, int j) {
	// TODO Auto-generated method stub
	
}
}