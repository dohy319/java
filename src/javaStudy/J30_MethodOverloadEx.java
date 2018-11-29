package javaStudy;
/*
 * 메소드 오버로딩 활용
 */
public class J30_MethodOverloadEx {
	public static void main(String[] args) {
		J30_MyClass2 m = new J30_MyClass2();
		
		System.out.println(m.plus(4,5));
		
		System.out.println(m.plus(4,6,7));
		
		System.out.println(m.plus("Hello","JAVA"));
	}
}
