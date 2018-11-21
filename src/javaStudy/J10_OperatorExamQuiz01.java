package javaStudy;

public class J10_OperatorExamQuiz01 {

	public static void main(String[] args) {
//		변수 hour에는 현재 시각이 들었습니다.
//		hour가 12보다 작으면 오전, 
//		그렇지 않으면 오후라는 값을 ampm 에 저장하도록  
		
		int hour = 15;
		
		String ampm = hour < 12 ? "오전" : "오후" ;
		
		System.out.println(ampm);
		
		
		
	}
}
