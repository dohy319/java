package javaStudy;

public class J12_SwitchExamQuiz01 {

	public static void main(String[] args) {
//		변수 month에는 지금이 몇월인지 나타내는 숫자가 들어있다.
//		switch문을 이용해서 season에 현재 계절을 저장하는 코드를 만들어라.
//
//		편의상 계절은 다음과 같이 나눈다. 
//
//		계절	기간
//		겨울	12월 ~ 2월
//		봄	3월 ~ 5월
//		여름	6월 ~ 8월
//		가을	9월 ~ 11월
//		※ 이번 실습에선 switch의 default 문은 사용하지 마세요.
		
		int month = 10;
		String season="";
		
		switch(month) {
			case 12:
				season = "겨울";
				break;
			case 1:
				season = "겨울";
				break;
			case 2:
				season = "겨울";
				break;
			case 3:
				season = "봄";
				break;
			case 4:
				season = "봄";
				break;
			case 5:
				season = "봄";
				break;
			case 6:
				season = "여름";
				break;
			case 7:
				season = "여름";
				break;
			case 8:
				season = "여름";
				break;
			case 9:
				season = "가을";
				break;
			case 10:
				season = "가을";
				break;
			case 11:
				season = "가을";
				break;
		}
		System.out.println(season + "\n");
		System.out.println("코드가 너무 길다. quiz02에서 줄이는 방법을 보거라");
	}

}
