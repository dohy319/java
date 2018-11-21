package javaStudy;

public class J09_OperatorExamQuiz02 {
	public static void main(String[] args) {
		
//		어떤 사람이 20대인지 검사하려 합니다.
//		사람의 나이를 담은 int 형 변수, age가 주어집니다. 
//		age가 20대를 나타낸다면 isTwenties에 true를, 
//		그렇지 않으면 false를 저장하는 코드를 작성하세요.
//		※ 20대는 20세 이상, 29세 이하입니다. 
		
		int age=27;
		
		boolean isTwenties;
		
		if(age >=20 && age <=29) {
			isTwenties = true;
		}else isTwenties = false;
		
		System.out.println(isTwenties);
	}
}
