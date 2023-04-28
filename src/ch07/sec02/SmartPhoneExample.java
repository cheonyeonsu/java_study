package ch07.sec02;

//관계성 생성하기
public class SmartPhoneExample extends Phone {

	// 필드
	public boolean wifi;

	// 생성자
	// *상속을 받으면 자식클래스에서 부모클래스에 있는 필드에 접근 가능*
	public SmartPhoneExample(String model, String color) {
//		super(model,color); // 부모클래스에 있는 생성자 실행. 무조건 맨위 작성
		System.out.println("SmartPhoneExample(String model, String color)생성자 실행");
	}

	// 메소드
	public void setwifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다. ");
	}

	public void internet() {
		System.out.println("인터넷에 연결했습니다.");
	}

}
