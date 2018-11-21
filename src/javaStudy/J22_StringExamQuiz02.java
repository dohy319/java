package javaStudy;

public class J22_StringExamQuiz02 {

	public static void main(String[] args) {
//		Quiz01에서 두 문자열을 배교할 때 == 연산자를 이용했다. 
//		== 연산자는 문자열 변수를 비교할 때 변수의 레퍼런스를 비교한다. 
//		변수의 레퍼런스를 비교하지 말고, 
//		변수가 저장하는 문자열이 같은지 확인해보자.
//
//		두 문자열이 같은 값인지는 equals 메소드를 사용합니다. 
		
		String str1 = new String("Hello Wrold");
		String str2 = new String("Hello Wrold");
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2에 같은 값을 가지고 있다.");
		}else { 
			System.out.println("str1과 str2에 다른 값을 가지고 있다.");
		}
			
		
	}

}
