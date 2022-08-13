package day15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import jdk.internal.util.xml.impl.Input;

public class Stream2 {

	public static void main(String[] args) {
		MakeFile mf = new MakeFile();
		mf.make("C:\\");
		mf.putText("C:\\myText.txt");
	}

}

class MakeFile{
	public int make(String path) {
		Scanner sc = new Scanner(System.in);
		String fileName = sc.next();
		System.out.println("생성할 파일 이름을 입력하세요(확장자까지)>>");
		File makeFile = new File(path + fileName);
		
		try {
			makeFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 생성에 실패했습니다.");
			return -1;
		}
		if(makeFile.exists()) {
			System.out.println("파일 생성 완료!");
		}
		return 1;
	}


public int delete(String path) {
	

	Scanner sc = new Scanner(System.in);
	System.out.println("삭제할 파일 이름을 입력하세요(확장자까지)>>");
	String fileName = sc.next();
	File file = new File(path + fileName);
	
	if(file.delete()) {
		System.out.println("삭제 성공!");
		return 1;
		
	}else {
		System.out.println("삭제 실패ㅠㅠ");
		return -1;
	}
	
}

public void putText(String file) {
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

	public void readText(String file) {
		FileInputStream fin = null;
		try {
		fin = new FileInputStream(file);
		InputStreamReader ist = new InputStreamReader(fin, "UTF-8");
		BufferedReader br = new BufferedReader(ist);
		String msg = null;
		while((msg = br.readLine()) != null) {
			System.out.println(msg);
		}
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.println("파일 읽기 실패 ㅠㅠ");
		
	}finally {
		try {
			fin.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
}