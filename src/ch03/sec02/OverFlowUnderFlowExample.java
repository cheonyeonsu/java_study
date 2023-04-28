package ch03.sec02;

public class OverFlowUnderFlowExample {

	public static void main(String[] args) {
		//byte : -128 ~ 127
		//overflow : 값의 최대 허용범위 벗어나는 것. 
		byte var1 = 125;
		
		for(int i=0; i<5; i++) {
			var1++; //1씩 증가
			System.out.println("var1: "+var1);
		}
        //underflow : 값의 최소 허용범위 벗어나는 것. 
		byte var2 = -125;
		for(int i=0; i<5; i++ ) {
			var2--;
			System.out.println("var2: "+var2);
		}
	}

}
