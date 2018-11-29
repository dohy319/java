package javaStudy;
/*
 * 기본 생성자와 this
 */
public class J31_Car {
	// 타입 필드명
	String name;
	int number;
	
	public J31_Car(String name) {
		this.name = name;
	}
	
	public J31_Car() {
		
		
//		this.name = "이름없음";
//		this.number = 0;
		
		// 자신의 생성자 호출
		// 알맞는 생성자를 호출해준다.
		this("이름없음",0);
		
	}
	
	public J31_Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
