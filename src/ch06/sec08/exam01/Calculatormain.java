package ch06.sec08.exam01;

public class Calculatormain {

	//리턴타입이 없는 메소드 > void 사용. return생략가능
	public static void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public static int plus(int x, int y) {
		int result = x + y;
		return result; //리턴문 만나면 메소드 끝남 > 뒤에 뭐 써도 실행 X
	}
	
	
	
	public static void main(String[] args) {
		powerOn();
		int result = plus(10,20);
		System.out.println(result);

	}

}
