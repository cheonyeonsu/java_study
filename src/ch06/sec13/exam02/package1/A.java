package ch06.sec13.exam02.package1;

public class A {
 //필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열"); //생성자 없으면 난리남
	
	//생성자
	public A(boolean b){
    	
    }
    A(int b){ // 디폴트 : 같은 패키지 안에서만 사용 가능. 
    	
    }
    //private : 같은 클래스에 있을 때 만 사용 가능
   private A(String s){
    	
    }
}

