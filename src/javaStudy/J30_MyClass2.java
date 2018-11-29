package javaStudy;
/*
 * 메소드 오버러딩
 * 타입과 매개변수의 수가 다르게 하여 같은 이름의 메소드를 여러 개 가질 수 있게하는 기술
 */
public class J30_MyClass2 {

	public int plus(int x, int y) {
		return x+y;
	}
	
	public int plus(int x, int y, int z) {
		return x+y+z;
	}
	
	public String plus(String x, String y) {
		return x+y;
	}
	
	// 매개변수의 이름은 중요하지 않고 타입이 중요하다.
	// 타입과 갯수가 위에 같은 형식이 있기에 아래 메소드는 오류가 난다.
//	public int plus(int a, int y) {
//		return a+y;
//	}
	
}
