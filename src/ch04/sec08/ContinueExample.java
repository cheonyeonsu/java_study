package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		
		//짝수만 구함
		for(int i=1; i<=10; i++) {
			if((i % 2) != 0) {
				continue; //홀수면 컨티뉴
			}
			
			System.out.println(i);
		}
	}

}
