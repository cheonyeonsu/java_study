package ch02.sec12; //69p

public class PrintfExample {

	public static void main(String[] args) {
//		int value = 123;
//		System.out.printf("상품의 가격:%d원",value);
	
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area); 
		//소수점+정수자리 포함 10자리. 소숫점 2자리 출력. -면 오른쪽 공백.

		String name = "홍길동";
		String job = "도적";
		
		System.out.printf("%6d | %s | %10s", 1, name, job);
	}

}
