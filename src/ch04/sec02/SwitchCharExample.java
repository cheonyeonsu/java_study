package ch04.sec02;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'a'; //스트링으로 바꾸는것도 가능. 문자열 타입 맞춰주기(쌍따옴표)
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원 입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원 입니다.");
			break;
		default:
			System.out.println("손님입니다.");
			break;
		}
	}

}
