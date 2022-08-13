package day15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Stream3 {

	public static void main(String[] args) {
		MyProgram mp = new MyProgram();
		mp.go("C:\\Users\\Administrator\\Desktop\\scan.txt");
	}

}

class MyProgram{
	public void go(String file) {
	
	FileOutputStream fout= null;
	try {
	    fout = new FileOutputStream(file,true);
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 내용>>");
		String msg = sc.nextLine();
		byte[] byteArray = msg.getBytes();
		
		fout.write(byteArray);
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		try {
			fout.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
}