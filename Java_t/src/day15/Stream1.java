package day15;

import java.io.File;

public class Stream1 {

	public static void main(String[] args) {

		FileFound ff1 = new FileFound();
		ff1.go("C:\\");
	}

}

class FileFound{
	public void go(String path) {
		System.out.println(path+"안에 있는 파일 검색");
		File file = new File(path);
		String[] files = file.list();
		for(int i=0; i<files.length; i++) {
			System.out.println("파일 :"+ files[i]);
		}
	}
}