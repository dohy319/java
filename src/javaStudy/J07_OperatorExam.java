package javaStudy;
/*
 * 비교 연산자 , 대입 연산자 
 */
public class J07_OperatorExam {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		
		System.out.println(i == j); // 같다.
		System.out.println(i != j); // 같지 않다.
		System.out.println(i < j); // 크다
		System.out.println(i <= j); // 같거나 크다.
		System.out.println(i > j); // 작다. 
		System.out.println(i >= j); // 같거나 작다.
		
		// 복합 대입 연산자
		i += 10; // i = i+10;
		
		System.out.println(i);
		System.out.println(i -=5);
	}
}
