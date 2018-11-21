package javaStudy;
/*
 * 배열
 * 1차원 배열 
 * 
 */
public class J16_Array1DExam {
	public static void main(String[] args) {
		
		// 1차원 배열 생성
		// 인덱스는 0부터 시작
		int [] arr = new int[100];
		
		arr[0] = 5;
		arr[15] = 24;
		
		// 선언과 동시에 초기화 1
		int [] arr2 = new int[]{1,2,3,4};
		
		// 선언과 동시에 초기화 2 
		int [] arr3 = {1,2,3,4};
		System.out.println(arr3[3]);
		
		int value = arr3[0];
		
		System.out.println(value);
		
		// 배열의 변수는 하나인데 여러개의 값이 들어간다.
		// 배열은 기본 데이터 타입이 아니라 참조형 타입이다.
		
	}
}
