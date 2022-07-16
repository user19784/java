package day07;

public class Constructor1 {

	public static void main(String[] args) {
		Cst c = new Cst("모닝",1234);
	c.go();
	
	Cst d = new Cst("BMW", 1234);
	d.go();
	}

}

class Cst{
	
	private String Car_name;
	private int car_num;
	
	//생성자
	Cst(String Car_name, int car_num){
		setCar_name(null);
		setCar_num(0);
		
	}
	
	public void go() { //main
		carInfo();
	}

	public void carInfo() {
		System.out.println("차종은:"+Car_name+" 차번호는:"+car_num);
	}
	
	// 출력할때 사용
	public String getCar_name() {
		return Car_name;
	}
	//대입할때 사용
	public void setCar_name(String car_name) {
		Car_name = car_name;
	}

	public int getCar_num() {
		return car_num;
	}

	public void setCar_num(int car_num) {
		this.car_num = car_num;
	}
	
}