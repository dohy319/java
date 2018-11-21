package javaStudy;
/*
 * 논리 연산자 
 */
public class J09_OperatorExam {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
//		System.out.println(b1 && b2);
//		System.out.println(b1 && b3);
//		System.out.println(b1 || b2);
//		System.out.println(b1 || b3);
//		System.out.println(b2 || b3);
		
		int score = 77;
		if(score <=100 && score >=70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		System.out.println(b1 ^ b3); // ^ : XOR
		System.out.println(b1 ^ b2);
		System.out.println(!b1);
		
	}
}
