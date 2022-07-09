package day05;

public class Car {
	String color;
	String car_name;
	String onwer_name;

	
	
	public void x(String color) {
		
		this.color = color;
	}
	public void c(String color, String Car_name) {
		this.color = color;
		this.car_name= Car_name;
	}
	public void b(String color, String Car_name, String onwer_name) {
		
		this.color = color;
		this.car_name= Car_name;
		this.onwer_name= onwer_name;
	}
	public String n () {
		
		
		return"차의 주인은 "+onwer_name+"차의 이름과 색깔은 "+car_name+color;
	}
}
