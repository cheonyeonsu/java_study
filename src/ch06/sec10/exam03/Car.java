package ch06.sec10.exam03;

public class Car {
    //인스턴스 필드
    int speed;
    // 정적 필드(static)
    static int gas;

    Car.gas = 500;
    Car myCar01 = new Car();
    myCar01.speed = 50;
    
    //스피드 50, 가스 500
    
    Car myCar02 = new Car();
    myCar02.speed = 150;
    // > 스피드 150, 가스 500
    //static값 고정.
    
    Car myCar03 = new Car();
    Car myCar05 = new Car();
    Car myCar06 = new Car();
    Car myCar07 = new Car();
    Car myCar08 = new Car();
    Car myCar09 = new Car();
    //인스턴스 메소드
    //인스턴스 메소드에서는 인스턴스필드, 정적필드 다 가져올 수 있다. 
    void run() {
    	System.out.println(speed + "으로 달립니다.");
//    	System.out.println("가스 양:"+ gas);
    }
    
    //인스턴스 메소드에서는 인스턴스메소드, 정적메소드 다 사용 가능. 
    // 뭘 써도 제약 X 
    void run2() {
    	System.out.println(speed + "으로 달립니다.");
//    	System.out.println("가스 양:"+ gas);
    	run(); //인스턴스 메소드
//    	simulate(); 정적 메소드
    }
    
    //정적(static) 메소드
    static void simulate() {
    	//정적 메소드에서는 인스턴스 필드를 사용할 수 없다. (밑에 speed 에러남)
//    	System.out.println(speed + "으로 달립니다.");
    	// run(); >> 정적 메소드에서 인스턴스 메소드 사용할 수 없기때문에 에러 남. 
    	//System.out.println("가스 양:"+ gas);
    //	simulate2();
    	
    	//정적 메소드에서 인스턴스 멤버를 사용하기 위해서는 객체를 생성해서 사용해야 한다. 
    	Car myCar = new Car();
    	myCar.speed = 60;
    	myCar.run();
    }
    
    static void simulate2() {}
    
	//리턴타입이 없는 정적 메소드
	public static void main(String[] args) {
		Car myCar = new Car();
    	myCar.speed = 100;
    	myCar.run();
    	
    	System.out.println(Car.gas);
    	Car.simulate2();
    	
	}
	

}
