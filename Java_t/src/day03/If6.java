package day03;

import java.util.Scanner;

public class If6 {

	public static void main(String[] args) {
		 Scanner Month=new Scanner(System.in);

		  int mon;
		  int year = 2013;
		  int day =0;
		  

		  System.out.println("년도를 입력하세요.");
		  year = Month.nextInt();
		  System.out.println("월을 입력하세요.");
		  mon=Month.nextInt();
		  
		  if (year<0) 
		   System.out.println("?");
		  
		  
		  else {
		   switch(mon){
		   case 4: case 6:case 9:case 11:
		    day = 30;
		    break;
		   case 1: case 3:case 5:case 7:case 8:case 10: case 12:
		    day=31;
		    break;
		    
		   case 2:
		    if (((year%4==0)&&!(year%100==0))||(year%400==0))
		    {
		     day=29;
		    }
		    else
		     day=28;
		    break;
		  
		   default:
		    System.out.println("월의 입력이 잘못되었습니다.");
		    
		   }
		   if(day==0)
		    System.out.println("구할 수 없는 값입니다.");
		   else
		    System.out.print(year+"년의 "+mon+ "월의 일수는 " +day+ "일입니다.");
		  }
	}

}
