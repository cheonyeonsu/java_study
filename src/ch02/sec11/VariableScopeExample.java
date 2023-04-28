package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		
		if(v1 > 10) {
			int v2 = v1 - 10;
		}
		
        int v3 = v1 + v2 + 5;
        // 선언 위치 중요. v2는 {}안에서만 사용 가능.
        // {} > 스코프. 선언한 스코프 안에서만 기능
	}

}
