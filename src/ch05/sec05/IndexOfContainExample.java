package ch05.sec05;

public class IndexOfContainExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		//1. 원하는 문자를 찾아서 가져오는 기능
		int location = subject.indexOf("프로그래밍"); //해당 문자열이 시작하는 인덱스 번호를 리턴해줌. >3출력
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		//2.해당 문자열이 있는지 찾아오는 기능 **많이 쓰는 내용**
		location = subject.indexOf("java");
		if(location == -1) { //문자열이 없으면 -1을 리턴한다.
			System.out.println("해당 문자열이 없습니다.");
		} else {
			System.out.println("해당 문자열이 있습니다.");
		}
		
		boolean result = subject.contains("자바"); //문자가 subject에 있는지 없는지. 
		if (result) {
			System.out.println("해당 문자열이 있습니다.");
		} else {
			System.out.println("해당 문자열이 없습니다.");
		}
		

	}

}
