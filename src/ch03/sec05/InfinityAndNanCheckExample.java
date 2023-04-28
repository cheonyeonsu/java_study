package ch03.sec05;    /*87p*/

public class InfinityAndNanCheckExample {

	public static void main(String[] args) {
		//무한대 숫자(infinity)
		//NaN(Not a number)
		int x = 5;
		double y = 0.0;
		double z = x/y;
		String a = "abc";
		
		System.out.println(z);
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}
		
	
		if(Double.isNaN(Double.parseDouble(a))) { //nan: 숫자가 아님
			System.out.println("숫자가 아님");
		}
 
	}

}
