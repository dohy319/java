package javaStudy;

public class J18_ArrayWithForQuiz01 {

	public static void main(String[] args) {
//		arr는 길이가 100인 배열입니다. 
//		for문을 이용해서 arr에 1부터 100까지의 자연수를 순서대로 넣어라.
		
		int [] arr = new int[100];
		
		for(int i=0; i<arr.length; i++) { 
			arr[i] = i+1;
		}
		
	}

}
