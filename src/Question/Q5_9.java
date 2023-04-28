package Question;

public class Q5_9 {

	public static void main(String[] args) {
		int[][] array = {
			      {95, 86},
			      {83, 92, 96},
			      {78, 83, 93, 87, 88}
			};

		int sum = 0;
		double avg = 0.0;
		int count = 0;

		//2차원 배열은 무조건 2중 for문
		for(int i = 0; i<array.length;i++) {
			for(int j=0; j<array[i].length;j++) {
				System.out.println(array[i][j]);
				sum += array[i][j];
				count++; //원소의 갯수만큼 count가 증가
			}
		}
		
		System.out.println("합" + sum);
		System.out.println("평균" + (double)sum/count);
	    
	}

}
