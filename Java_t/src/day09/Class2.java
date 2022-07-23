package day09;

public class Class2 {

	public static void main(String[] args) {
		C starbucks = new C();
		starbucks.coffee("커피 만들기");
		starbucks.sell("", "");
		starbucks.menu();
		starbucks.Closing();
	}
}


interface starbucks{
	void coffee(String coffee);
	void sell(String coffee, String sell);
}

class A implements starbucks{

	@Override
	public void coffee(String coffee) {
			//커피 만들기
		System.out.println(coffee);
	}

	@Override
	public void sell(String coffee, String sell) {
		//커피 만들걸 팔기
		System.out.println("팔기"+sell);
	}
	
}

class B extends A{
	public void menu(){
		System.out.println("메뉴 추가");
	}
}

class C extends B{
	public void Closing() {
		System.out.println("마감시간");
	}
}