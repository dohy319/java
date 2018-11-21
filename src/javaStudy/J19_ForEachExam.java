package javaStudy;
/*
 *  for each 문 
 */
public class J19_ForEachExam {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		// 기존의 for문을 이용한 반복문 사용법
		for(int i=0; i<arr.length; i++) {
			int value = arr[i];
//			System.out.println(value);
		}
		
		// for each문을 이용한 반복문 사용법
		for(int value:arr) {
			System.out.println(value);
		}
		
		
		
		
	
	}

}
