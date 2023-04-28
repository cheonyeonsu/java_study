package ch04.sec05; //141p

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //입력받을 수 있게 하는 객체
		boolean run = true; //(달리고 있는지 아닌지) 현상태를 체크. true면 달리는 상태.
		int speed = 0;
		
		while(run) { 
			System.out.println("----------------");
			System.out.println("1.증속 2.감속 3.중지");
			System.out.println("----------------");
			//사용자에게 입력받음
			System.out.println("선택:"); 
            String strNum = scanner.nextLine();	
            
            if(strNum.equals("1") ) {
            	speed++;
            	System.out.println("현재속도: "+speed);
            } else if(strNum.equals("2")) {
            	speed--;
            	System.out.println("현재속도: "+speed);
            } else if(strNum.equals("3")) {
            	run = false; //중지
            }
		}
            System.out.println("프로그램 종료"); //while문 벗어나서 써주면 됨
	}
	

}
