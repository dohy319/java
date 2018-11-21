package javaStudy;

public class J18_ArrayWithForQuiz02 {

	public static void main(String[] args) {
		
		int [] array = new int[10]; // 모른다고 가정
		for(int i=0; i<array.length; i++) {
			array[i] = i+1;
		}
//		array는 길이를 알 수 없는 int형 배열이다. 
//		array의 원소를 모두 합한 값을 sum에 저장하세요.
		
		int sum = 0; // 더한값을 저장할 변수 선언과 동시에 초기화
		
		for(int i=0; i<array.length; i++) { 
			sum = sum+array[i];
		}
		System.out.println(sum);
	}

}
