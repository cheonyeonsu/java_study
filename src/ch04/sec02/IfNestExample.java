package ch04.sec02;

public class IfNestExample {

	public static void main(String[] args) {
//		double score = (int)(Math.random()*20) + 81; //0.0~1.0사이의 숫자 만들어 줌
//		System.out.println("점수: "+score);
		
		//random 공식 : int num = (int) Math.random()* n ) + start;
		// n : 정수의 갯수, start : 시작 숫자
		
//		//로또 번호(1~45의 정수를 만든다) > 1~45까지 만든다
//		int score = (int)(Math.random()*45) + 1; 
//		System.out.println(score);

		//81부터 20개의 정수를 만든다.  > 81~100까지 만든다!
		int score = (int)(Math.random()*20) + 81; 
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {	
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("점수: "+score);
	}

}
