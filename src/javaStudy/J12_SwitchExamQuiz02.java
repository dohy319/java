package javaStudy;

public class J12_SwitchExamQuiz02 {

	public static void main(String[] args) {
		
		// 개꿀팁,어찌보면 당연한
		
		int month = 10; 
		String season="";
		
		switch(month) {
			case 12:
			case 1:
			case 2:
				System.out.println("겨울");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("봄");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을");
				break;
				
		}
		System.out.println(season);

	}

}
