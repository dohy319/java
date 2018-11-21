package javaStudy;

public class J09_OperatorExamQuiz01 {
	public static void main(String[] args) {
		/*
		 * 어떤 사람이 할인 대상인지 검사하려고 합니다. 
		 * 나이가 19 이하거나 60 이상이라면 할인 대상입니다.
		 * int형 변수 age가 19 이하거나 60 이상이라면 isDiscount에 true를, 
		 * 아니라면 isDiscount에 false를 저장하게 빈칸을 채워보세요. 
		 */
		
		int age=40;
		String isDiscount;
		
		if(age <=19 || age >=60) {
			isDiscount = "true";
		}else isDiscount = "false";
		
		
		System.out.println(isDiscount);
	
	}
}
