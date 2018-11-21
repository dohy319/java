package javaStudy;
/*
 * enum 열거형 타입
 * 자바는 열거타입을 이용하여 변수를 선언할 때 변수타입으로 사용할 수 있다.
 */

public class J27_EnumExam {
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	public static void main(String[] args) {
		
		String gender1;
		gender1 = J27_EnumExam.MALE;
		gender1 = J27_EnumExam.FEMALE;
		
		gender1 = "boy";
		
		System.out.println(gender1);
		
//		상수를 사용했때의 문제점
//		String으로 선언된 gender1 에는 MALE,FEMALE 둘 중 한가지 값을 갖기 원하는데,
//		gender1의 type이 String 이기 때문에 gender1 = 소년; 이렇게 수행 되어도 전혀 문제가 되지 않는다.
//
//		실행할때 원했던 값인 MALE,FEMALE 이 아닌 다른 값이 들어오게 되므로 문제를 발생시킬 수 있다.


		// 위 문제를 열겨형 타입으로 해결 가능하다.
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
		// Gender타입의 변수에는 MALE이나 FEMALE만 대입이 가능하다.
		// 다른 값은 저장할 수 없다.
//		gender2 = "boy"; // 에러
		
	}
}

// 열거형 사용법(특정값만 사용할 때 )
enum Gender{
	MALE, FEMALE;
}