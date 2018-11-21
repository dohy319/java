package javaStudy;
/*
 * 연산자 우선순위 
 */
public class J08_OperatorExam {

	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		int c = 9;
		
		// a-b 가 괄호() 안에 있으므로 *산술연산자 보다 우선순위가 높다.
		System.out.println( (a - b) *  c );
		
		// 부호 연산자 > 논리 연산자
		System.out.println( a > 3 && b > 3 ); 
		// && : AND(논리곱) : 둘다 참이면 참, 나머지 거짓
		
		System.out.println( a > 3 || b > 3); 
		// || : OR(논리합) : 둘다 다르면 거짓, 나머지 참
		
		
		// 전위 연산자 우선순위 
		// 전위 연산자 > 산술 연산자
		System.out.println( ++a - 1 ); // 결과 값 : 3
		
		// 후위 연산자 우선순위
		// 후위 연산자 < 산술 연산자
		System.out.println( --b -1 ); // 결과값 : 2
		System.out.println(b); // 후위연산된 a값 : 2
	}

}
