package javaStudy;
/*
 * 상수 
 */
public class J03_ConstantExam {

	public static void main(String[] args) {
		
		// 변수는 값이 변할 수 있다.
		int i;
		i = 10;
		i = 5;
		
		// 상수에 넣는 값은 처음 한번만 허락
		final int A;
		A = 15;
		
		// 상수이기 때문에 두번째 값을 넣으면 오류
//		A=5; 
		
		// 상수를 이용한 원 면적 구하기
		double circleArea;
		final double PI = 3.14159; // 선언과 동시에 초기화
		circleArea = 3 * 3 * PI;
		
		// 주유비 구하기
		// 상수는 단어와 단어사이 _ 를 통해 가독성 좋게 하는것이 관례
		final int OIL_PRICE = 1450; // 기름 가격 
		int totalPrice = 50 * OIL_PRICE; // 기름을 50단위 넣었을때
		
		// 기름값이 바뀌었을 때 선언한 곳만 가격을 바꾸어주면 된다.
	}
}
