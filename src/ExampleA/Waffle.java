package ExampleA;

public class Waffle {
   double power = 100; // 체력(%)
   double money = 0; // 잔고(won)
   String[] jam; //잼
	int sweet; //단맛 정도(1~5)
	int salt;  //짠맛 정도(1~5)


	//생성자
	Waffle(String[] jam, int sweet, int salt) {
		this.jam = jam;
		this.salt = salt;
		this.sweet = sweet;

	}
	
	//단맛 추가
	void sweetAdd(int sweet) {
		//1. 단맛 변경 코드
		this.sweet += sweet;
		//2. 단맛 출력 코드
		System.out.println("달기가" + this.sweet  +  "단계 입니다.");
	}
	
	//짠맛 추가
	void saltAdd(int salt) {
		this.salt += salt;
		System.out.println("짜기가" + this.salt +  "단계 입니다.");
	}
	
	
	//와플 굽기 
		void run(int count) {
			//와플하나 굽는데 2%만큼의 체력 소모
			//와플하나 굽는데 2500원 만큼의 돈 획득
			power = power - (2 * count); 
			money = money + (2500 * count); 
			
			System.out.println("와플이 " + count + "개 완성되었습니다!");
			System.out.println("남은 체력:" + power + "%");
			System.out.println("잔고:" + money + "원");
		}
   
}
