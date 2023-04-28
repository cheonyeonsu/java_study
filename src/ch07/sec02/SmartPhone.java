package ch07.sec02;  

public class SmartPhone {
	public static void main(String[] args) {
		SmartPhoneExample myphone = new SmartPhoneExample("갤럭시", "검정");
		
		myphone.setwifi(true);
		System.out.println("와이파이 상태: " + myphone.wifi);
		
		myphone.bell(); //부모 특징 가져오기
		myphone.sendVoice("여보세요.");
		myphone.receiveVoice("안녕하세요! 저는 천연수 입니다.");
		myphone.hangUp();
		
//		System.out.println("모델:"+myphone.model);
//		System.out.println("색상:"+myphone.color);
		
		
		
	}
}
