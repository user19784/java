package day07;

public class Extends1 {

	public static void main(String[] args) {
		Ex1 e = new Ex1("사용");
		e.go();
		Ex1Ex ex = new Ex1Ex("사용");
		ex.go2();
	}

}
// 사람이 복사를 하니깐 복사한 만큼난 수정을 해줘야한다
// 그러면 컴퓨터가 복사하게 하자
class Ex1{
	private String str;
	//함수 이름이 같아도 인자() 부분이 다르면 다른 함수로 인식 : 메서드 오버로딩
    Ex1(){
		
	}
    
    Ex1(String str){
		this.str = str;
	}
	public void go() {
		System.out.println(str+"1번");
	}
	

}
class Ex1Ex{
	private String str;
	//함수 이름이 같아도 인자() 부분이 다르면 다른 함수로 인식 : 메서드 오버로딩
    Ex1Ex(){
		
	}
    
    Ex1Ex(String str){
		this.str = str;
	}
	public void go2() {
		System.out.println("==========");
		System.out.println(str+"1번");
		System.out.println("==========");
	}
	

}
 

class Ex4 extends Ex1{
	//Ex1의 코드가 복사 붙여넣기 됨 : 상속
	//수정 : 동일한 함수를 다시 만들어주면됨 (오버라이딩)
	//super : 부모의 (코드의 원래 주인)
// 기본의 클래스를 복붙하고 싶으면 extends 사용
// 수정이 필요하면 그 함수만 다시 만듦

}