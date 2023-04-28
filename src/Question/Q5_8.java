package Question;

public class Q5_8 {
	
	public static void main(String[] args) {
		int max = 0;
		int[] arrays = {1,5,3,8,2};
		
		//이 배열에서 최댓값 출력하기.(for문 사용)
		for(int array : arrays) {
			if (max < array) { //max : 0, array : 1
				max = array;
				
			} 
		}
		
		System.out.println(max);
	}
}
