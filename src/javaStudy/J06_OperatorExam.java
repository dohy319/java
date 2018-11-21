package javaStudy;
/*
 * 연산자 
 * 단항(부호,연산)
 */
public class J06_OperatorExam {

	public static void main(String[] args) {
		
		// 산술 연산자( + - * / % )
		int i = 5;
		int j = 2;
		
		System.out.println(i + j); 
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j); // 정수 타입 나누기 정수 타입 = 정수 타입
		System.out.println(i /(double) j); // 나누기는 보통 실수값이 나오는 경우가 많으므로 하나만 형변환 해줘도 원하는 실수값을 얻을 수 있다.
		System.out.println(i % j); // % 나머지를 구한다.(모듈러 연산)

		// 단항 연산자(부호,증감)
		
		// 부호 연산자
		// 변수앞의 부호가 있을때
		// +일때 변수값 그대로 대입
		// -일때 변수값 음수일땐 양수로, 양수일땐 음수로 대입
		int i1 = -2;
		int i2 = +i1;
		int i3 = -i1;
		// 출력
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		// 증감 연산자
		// 전위 
		int i4 = ++i3; // i3 = i3 + 1;
		System.out.println(i4);
		System.out.println(i3);
		
		// 후위
		int i5 = i3++; // i3 = i3 + 1;
		System.out.println(i5);
		System.out.println(i3);
		
				
	}

}
