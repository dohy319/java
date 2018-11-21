package javaStudy;

public class J13_WhileExamQuiz02 {
	public static void main(String[] arts) {
//		while문을 이용해 1부터 10까지 i가 짝수일 때만 i를 출력(if문 사용) 
		
		int i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
			}
			
			i++;
		}
		
	}
}
