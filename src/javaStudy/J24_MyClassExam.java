package javaStudy;
/*
 * 메소드의 사용 
 */
public class J24_MyClassExam {

	public static void main(String[] args) {
		
		// 클래스가 가진 메소드를 사용하기 위해서는 객체로 만들어야 사용할 수 있다.
		
		// 객체 생성
		J24_MyClass mc = new J24_MyClass();
		
		// 메소드를 사용하려면 생성된 클래스를 참조하는 
		// 래퍼런스변수.메소드명() 으로 사용할 수 있다.
		mc.method1();
		mc.method2(2);
		
		int value = mc.method3();
		System.out.println("m3이 리턴한 값 : " + value);
		
		mc.method4(3,4);
		
		int value2 = mc.method5(55);
		System.out.println("m5가 리턴한 값 : " + value2);
		
		int a = 1;
		++a;
		
		System.out.println(a);
		
	}

}
