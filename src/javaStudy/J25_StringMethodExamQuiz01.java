package javaStudy;

public class J25_StringMethodExamQuiz01 {


	public static void main(String[] args) {
//		두 변수 str1과 str2에 저장된 문자열을 붙여 
//		변수 concatResult에 저장해라.
		
		String str1 = "가나다라마바사";
		String str2 = "아자차타파하";
		
		String concatResult = str1.concat(str2);
		
		System.out.println(concatResult);
		
//		변수 str1이 저장하는 문자열을 2번째 인덱스부터 잘라, 
//		변수 substringResult에 저장하거라.
		
		String substringResult = str1.substring(2); 
		
		System.out.println(substringResult);
		
	}

}
