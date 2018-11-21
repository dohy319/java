package javaStudy;
/*
 * 배열
 * for문을 이용해서 배열 사용하기 
 */
public class J18_ArrayWithFor {

	public static void main(String[] args) {
		int [] arr = new int[100];
		
		// 배열에 1부터 100까지 넣기
		// arr.length : arr 배열의 크기
		// System.out.println(arr.length); //test
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		// System.out.println(arr[99]); //test
		
		 
		// 배열에 저장된 값을 모두 더해주기
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
	}

}
