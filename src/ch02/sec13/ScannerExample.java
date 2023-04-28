package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//	   System.out.print("x값 입력:"); // 입력>>변환
//	   String strX = scanner.nextLine();//문자형으로 입력받음
//	   int x = Integer.parseInt(strX); //문자형 > 숫자형 변환
//		
//		//Scanner : 자바에서 제공해주는 객체.
//		// 패키지 밑에 import java.util.Scanner; 라고 쓰면 되긴 함 근데 구찬ㅋ
//        
//	   System.out.print("y값 입력:"); // 입력>>변환
//	   String strY = scanner.nextLine();//문자형으로 입력받음
//	   int y = Integer.parseInt(strY); //문자형 > 숫자형 변환
//	   
//	   int result = x + y;
//	   System.out.println("x + y:"+result);
	   
	   //무한반복
	   while(true) {
		   System.out.println("입력 문자열: ");
		   String data = scanner.nextLine();
		   
		   //자바에서 문자열(string타입)을 비교할 때는 equals 함수 사용해 비교
		   if(data.equals("q")) { //data=="q"
			   break; //반복하다가 q를 만나면 반복문을 빠져나온다. break만나면 실행X
		   }
		   
		   System.out.println("출력 문자열: "+ data);
	   }
	   
	   System.out.println("종료"); 
	}
	

}
