package javaStudy;

public class J22_StringExamQuiz01 {

	public static void main(String[] args) {
//		str1과 str2은 모두 Hello World라는 값을 저장하는 변수이다.
//		둘은 사람이 보기엔 완전히 똑같지만, java는 둘을 다르다고 판단합니다.

//		equal operator == 로 두 변수를 비교합니다. 
//		코드를 실행해 java가 str1과 str2을 다르다고 판단하는 것을 확인하자.
		
		String str1 = new String("Hello World");
		String str2 = new String("Hello World");
		
		if(str1==str2) System.out.println("str1과 str2는 같은 래퍼런스이다.");
		else System.out.println("str1과 str2는 다른 래퍼런스이다."); 
		
	}

}
