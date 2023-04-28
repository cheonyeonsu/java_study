package ch06.sec07.exam04;
//설계도
public class Car {
//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자 오버로드 : 생성자를 여러개 만든다.
	//오버로드시 매개변수의 타입, 갯수, 순서 중 하나가 달라야 함
	Car(){} //생성자 호출
	Car(String model){ //생성자 호출2
		//this.model = model;
		//기본형 this(); : 이 클래스(Car 클래스) 안에 있는 생성자를 호출한다. 
		this(model, "은색",250); //this니까 호출 또해야댐
	}
	Car(String model,String color){
//		this.model = model;
//		this.color = color;
		this(model,color,250);
		
	}
	Car(String model,String color, int maxSpeed){
		this.model = model; //모델 필드에 자가용 넣어준다. 
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
