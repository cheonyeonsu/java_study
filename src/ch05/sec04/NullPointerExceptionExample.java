package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;
		intArray[0] = 10;
		
		String str = null; //null > 비어있음 > 가르키는 게 없음
		System.out.println(str.length());

	}

}
