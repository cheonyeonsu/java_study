package ch06.sec08.exam03;

public class Car {
	// 필드
	int gas; // 휘발유의 양

	// **메소드** 여러번 실행 된다.
	void setGas(int gas) { // gas를 채워넣어주는 메소드
		this.gas += gas;
	}

	boolean isLeftGas() { // 휘발류 있/없?
		if (gas <= 0) {
			System.out.println("가스가 없습니다.");
			return false;
		}

		System.out.println("가스가 있습니다.");
		return true; // 메소드 종료

	}

	void run() { // 자동차가 달린다(휘발유 소모).
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다. gas잔량:" + gas);
				gas -= 1; // 1씩 가스 소모
			} else{ // 가스가 없음
				System.out.println("멈춥니다. gas잔량:" + gas);
				return; // 메소드 종료
			}

		}
	}
}


