package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]); //주소가 같다
		System.out.println(strArray[0] == strArray[2]); //주소가 다르다
		System.out.println(strArray[0].equals(strArray[2])); //값은 같다.
	}

}
