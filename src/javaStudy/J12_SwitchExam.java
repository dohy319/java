package javaStudy;
/*
 * 조건문 switch 
 *
 * switch문에는 case, break, default 가 사용된다.
 * 
 */
public class J12_SwitchExam {

	public static void main(String[] args) {
		
		int num = 2;
		
		// break문이 없을 때 
		switch(num) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		default :
			System.out.println("그 외 다른 숫자");
		}
		
		System.out.println("---------------------------");
		
		// break문이 있을 때
		switch(num) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default :
			System.out.println("그 외 다른 숫자");
		}

		System.out.println("---------------------------");
		
		// JDK7 이후부터 문자열도 가능 그전에는 정수타입만 가능했다.
		String str = "A";
		
		switch(str) {
		case "A":
			System.out.println("A");
			break;
		case "B":
			System.out.println("B");
			break;
		default :
			System.out.println("그 외 다른 문자");
		}

	}

}
