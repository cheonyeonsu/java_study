package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		//인스턴스: new로 생성한 자동차(객체)
		car myCar = new car();
		
		//필드에 접근 > 인스턴스명.필드명
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//필드 값 변경 => 인스턴스명.필드명 = 값
		myCar.speed = 60;
		System.out.println("myCar1 제작회사: " + myCar.company);
		System.out.println("수정된 myCar 속도: " + myCar.speed);
		System.out.println(myCar);
		
		car myCar2 = new car();
		myCar2.speed = 70;
		myCar2.company = "기아";
		System.out.println("수정된 myCar2 속도: " + myCar2.speed);
		System.out.println("myCar2 제작회사: " + myCar2.company);
		System.out.println(myCar2); //주소값
		
		System.out.println("================================");
		
		car myCar3 = new car();
		myCar3.speed = 90;
		myCar3.company = "르노삼성";
		System.out.println("myCar3 제작회사: " + myCar3.company);
		System.out.println("수정된 myCar3 속도: " + myCar3.speed);
		System.out.println(myCar3);
	}

}
