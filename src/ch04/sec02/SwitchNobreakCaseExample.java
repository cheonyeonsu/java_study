package ch04.sec02;

public class SwitchNobreakCaseExample {

	public static void main(String[] args) {
		//8부터 4개의 숫자 구하기 > 8~11사이의 정수
		int time = (int)(Math.random()*4) + 8;
		System.out.println("현재시간 : " + time + "시");
       
		
		//컨트롤 + 스페이스 > 자동완성 단축키

	switch (time) {
	case 8:
		System.out.println("출근합니다");
		break; // < 꼭 써야함 안써주면 아래에 있는 구문 all 실행
	case 9:
		System.out.println("회의합니다");
		break;
	case 10:
		System.out.println("업무를 봅니다");
		break;
	default:
		System.out.println("외근을 나갑니다");
		break;
	}
	}

}
