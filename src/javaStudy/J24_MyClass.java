package javaStudy;
/* 
 * 메소드 선언
 * 접근제어자 리턴타입 메소드명 (매개변수들) {  구현 }
 */
public class J24_MyClass {
	
	// 리턴값이 없고 매개변수가 없는 메소드
	public void method1() {
		// 구현부
		System.out.println("m1 이 실행됨...");
	}
	
	// 리턴값이 없고 매개변수를 정수형으로 받는 메소드
	public void method2(int x) {
		System.out.println(x+"을/를 이용한 m2 실행");
	}
	
	// 리턴값이 정수형이고 매개변수가 없는 메소드
	public int method3() {
		System.out.println("m3 실행");
		return 10; // 리턴값이 있으면 항상 return 키워드가 있어야 한다.
	}
	
	// 리턴값이 없고 매개변수가 두개(정수)인 메소드 
	// 매개변수로 모든 데이터 타입 사용가능
	public void method4(int x, int y) {
		System.out.println(x + y + "m4 실행");
	}
	
	// 리턴값이 정수형이고 매개변수도 정수형으로 받는 메소드
	public int method5(int x) {
		System.out.println(x+"이용한 m5 실행");
		return x*2;
	}
}
