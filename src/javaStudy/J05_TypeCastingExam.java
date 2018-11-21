package javaStudy;
/*
 * 형 변환
 */
public class J05_TypeCastingExam {

	public static void main(String[] args) {
		// 묵시적 형변환(암묵적 형변환),작은상자에 들어있던 것을 큰상자에 넣는다.
		int x = 10000;
		long y = x;
		
		// 강제 형변환(명시적 형변환),큰상자에 있던 것을 작은상자에 넣을 때
		long x2 = 25251;
		int y2 = (int)x2;

		// 넘치면 타입의 표현범위 최소값 부터 최대값까지 반복
		long x3 = 128;
		
		byte y3=(byte)x3;
		System.out.println(y3);
	}
}
