package ch02.sec04;

public class floatDoubleExample {

	public static void main(String[] args) {
		float var1 = 0.123456789f;//대문자 F도 가넝
		double var2 = 0.123456789f;
		
		System.out.println(var1);
		System.out.println(var2);

		double var3 = 3e6; //3*10^6
		float var4 = 3e6f; //위에꺼랑 같음. 
		double var5 = 2e-3; //2*10^-3
		
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
	}

}
