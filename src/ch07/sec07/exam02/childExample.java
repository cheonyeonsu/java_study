package ch07.sec07.exam02;

public class childExample {

	public static void main(String[] args) {
//		//자동타입변환1
//		Child child = new Child();
//		Parent parent = child;
//		
		//자동 타입변환 2
		Parent parent = new child();
		
		//2. 자동타입변환 시 자식클래스에 오버라이딩된 메소드가 있으면 
		// 오버라이딩된 메소드가 호출된다. 
		parent.method1(); // 원래 부모클래스에 있던 애 >실행
		parent.method2(); // 부모-자식 오버라이드.
		parent.parentField1 = 10;
		
		//1.자동타입변환 시 부모클래스에 선언된 필드와 메소드만 접근 가능함.
//		parent.method3();
//		parent.childField1 = 10; //자식한테 있는 필드 - 에러남. 
		
		
		System.out.println("=============================");
		//강제 타입 변환
		child child = (child) parent;
		child.method3();
		child.childField1 = 10;
		child.method2();
		child.parentField1 = 10;
	}

}
