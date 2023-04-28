package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		
		String firstNum = ssn.substring(0, 6); //문자열의 인덱스 번호. (0번인덱스,끝인덱스 직전)
		System.out.println(firstNum);
		                  
		String secondNum = ssn.substring(7); //substring() 시작 인덱스부터 문자열 끝까지 잘라옴
		System.out.println(secondNum);
	}

}
