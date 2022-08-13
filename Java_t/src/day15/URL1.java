package day15;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URL1 {

	public static void main(String[] args) {
		Crawling c1 = new Crawling();
		c1.webReader("웹사이트 주소 넣으면됨");
	}

}

class Crawling{
	URL url;
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	private String str = null;
	
	public void webReader(String address) {
		try {
		url = new URL(address);
		is = url.openStream();
		isr = new InputStreamReader(is, "UTF-8");
		br = new BufferedReader(isr);
		
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}