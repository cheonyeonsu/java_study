package ch06.sec08.exam01;//계산기의 기능

public class Calculator {
   //필드는 있어도 그만 없어도 그만
   //생성자 : 디폴트 생성자가 붙는다. 형태 : Calculator(){}
	//리턴타입이 없는 메소드 > void 사용. return생략가능
		
	//***객체 = 속성(필드)+기능(메소드)***
	void powerOn() {
			System.out.println("전원을 켭니다.");
		}
		void powerOff() {
			System.out.println("전원을 끕니다.");
		}
		
		int plus(int x, int y) {
			int result = x + y;
			return result; //리턴문 만나면 메소드 끝남 > 뒤에 뭐 써도 실행 X
		}
		
		
		double divide(int x, int y) {
			double result = (double)x / y; //둘중에 하나는 double이어야함
			return result;
		}
}
