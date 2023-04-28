package ch05.sec07;

public class MultidimenyionalArrayByValueListExample {

	public static void main(String[] args) {
       //2차원 배열
		int [][] scores = {
				{80,90,96},
				{76,88}
				};
		
		//배열의 길이
		System.out.println("1차원 배열 길이(반의 갯수):"+scores.length);
		System.out.println("2차원 배열 길이(첫번째 반의 학생 수):"+scores[0].length + "명");
		System.out.println("2차원 배열 길이(두번째 반의 학생 수):"+scores[1].length + "명");
		
		//첫번째 반에서 세번째 학생의 점수 읽기
		System.out.println(scores[0][2]);
		
		//두번째 반에서 두번째 학생의 점수 읽기
        System.out.println(scores[1][1]);
        
        //첫번째 반의 평균점수 구하기
        int class1Sum = 0;
        for(int i=0; i<scores[0].length; i++) {
        	class1Sum += scores[0][i]; //1반의 첫번째, 두번째, 세번째 학생의 점수
        }
        System.out.println("첫번째 반 합계: " + class1Sum); //합계
        System.out.println("첫번째 반 합계: " + (double)class1Sum / scores[0].length); 
        //평균.정수형으로 ㄴ오니까 더블 넣어줌
        
        
        
        //두번째 반의 평균점수 구하기
        int class2Sum = 0;
        for(int i=0; i<scores[1].length; i++) {
        	class2Sum += scores[1][i];
        }
        System.out.println("두번째 반 합계: " + class2Sum);
        System.out.println("두번째 반 합계: " + (double)class2Sum / scores[1].length); 
        
        //전체 학생의 평균점수 구하기[2중 for문]
        int totalStudent = 0;
        int totalSum = 0;
        
        for(int i=0; i<scores.length; i++) { //length : 행의 갯수
        	
        	totalStudent += scores[i].length; //첫번째반의 학생 수 + 두번째 반's학생수
        	
        	for(int k=0; k<scores[i].length; k++) { //length : 열의 갯수
        		System.out.println("scores[" + i + "]" + "[" + k + "] :" +  scores[i][k]);
        		totalSum += scores[i][k];
        	}
        }
        
        System.out.println("전체 학생의 평균 점수: " + (double)totalSum / totalStudent);
        
	}

}
