package ch07.sec04.exam01;

public class Computer extends Calculator {

	@Override //오른쪽 - 소스 - 오버라이딩
	public double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

		// 오버라이드 : 리턴타입, 메소드 이름, 매개변수 다 같아야. 근데 실행 코드는 다름


}
