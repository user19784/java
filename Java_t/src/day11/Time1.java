package day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Time1 {

	public static void main(String[] args) {
//		NowTime nt = new NowTime();
//		nt.go();
		
		NowTime nt1 = new NowTime();
		nt1.go2();
	}

}

class NowTime{
	public void go() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf1.format(date));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("MM");
		System.out.println(sdf2.format(date)+"년");
		System.out.println(Integer.parseInt(sdf3.format(date))+"월");
		System.out.println(sdf2.format(date)+"년"+Integer.parseInt(sdf3.format(date))+"월");
	}
	
	public void go2() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
		System.out.println(sdf1.format(date)+"년");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
		System.out.println(Integer.parseInt(sdf2.format(date))+"월");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd");
		System.out.println((sdf3.format(date))+"일");

		
		
	}
}