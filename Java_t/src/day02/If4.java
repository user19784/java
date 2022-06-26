package day02;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.printf("점수를 입력하세요>>");
		
int score = scan.nextInt(); 
        
        if(score < 0 || score > 100)
        {
            System.out.println("잘못된 점수 입니다.");
        }
        else {
            
        switch (score/10) {
        
            case 10 : System.out.println("만점입니다. A+"); break;
        
            case 9 : System.out.println("A"); break;
        
            case 8 : System.out.println("B"); break;
        
            case 7 : System.out.println("C"); break;
        
            default: System.out.println("F");
            }


    }
}
}