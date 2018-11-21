package javaStudy;
/*
 * String 클래스(자바에서 가장 많이 사용) 
 * 제일 많이 쓰다보니 new 연산자를 이용하지 않아도 인스턴스를 만들 수 있다.
 */
public class J22_StringExam {

	public static void main(String[] args) {


		String str1 = "hello";
		//hello 라는 인스턴스가 상수영역에 하나 만들어짐
		String str2 = "hello"; 
		// 이미 상수영역에 hello 가 있으므로 새로만들지 않고 같은 hello 인스턴스를 참조하고 있다.
		
		// new 생성자를 통해 인스턴스를 선언하면 힙영역에 새로 만들어진다.
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if(str1==str2)
			System.out.println("str1과 str2는 같은 곳을 참조한다. 같은 래퍼런스이다.");

		if(str1==str3)
			System.out.println("str1과 str3은 같은 레퍼런스이다.");
		// 실행안됨 str1과 str3은 다른 래퍼런스이다.

		if(str3 == str4)
			System.out.println("str3과 str4는 같은 래퍼런스이다.");
		// 실행안됨 str3과 str4은 다른 래퍼런스이다.
		
		// String 클래스에서는 한번 생성된 클래스는 변하지 않는다.
		System.out.println(str1);
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1); // 출력 : hello
		
		// cf> substring 메소드는 문자열을 자를 때 사용한다. 
		//    괄호안에 정수가 들어간만큼 짜르고 남긴다.
	
		
		
		
		
		
	}

}
