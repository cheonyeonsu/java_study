package ch04.sec04; //2중for문. 안에서 출력이 되는 원리 알기. 

public class MultiplecationExample {

	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {
			System.out.println("***" + m + "단 ***");
			for (int n=1; n<=9; n++) { //for문 안의 for문
				System.out.println(m + "x" + n + "=" + (m*n));
				//m은 고정, n은 안에서 숫자 바뀌면서(1~9) 돌아감.
			}
		}

	}

}
