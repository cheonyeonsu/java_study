package ch06.sec07.exam02;

public class Car {
 //필드(멤버변수)
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	
	//생성자 (){} > 필드 초기화 시 주로 사용
	Car(String m, String c, int s){
		model = m;
		color = c;
		maxSpeed = s;
	}
}
