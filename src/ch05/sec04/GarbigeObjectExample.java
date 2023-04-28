package ch05.sec04;

public class GarbigeObjectExample {

	public static void main(String[] args) {
		String hobby = "여행"; // 주소를 가지고 있다.
		hobby = null; // 주소 없음
		
		String kind1 = "자동차"; 
		String kind2 = kind1; //대입이니까 똑같이 자동차. 주소도 가틈
		kind1 = null;
		System.out.println(kind2);

	}

}
