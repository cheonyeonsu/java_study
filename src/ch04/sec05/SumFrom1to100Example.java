package ch04.sec05; //while문

public class SumFrom1to100Example {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) {
			sum +=i; 
			System.out.println(i);
			i++;
		}
		
		System.out.println(sum);

	}

}
