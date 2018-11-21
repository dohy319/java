package javaStudy;
/*
 * 반복문 for문 
 */
public class J15_ForExam {

	public static void main(String[] args) {
		
		// for문을 통한 1~100까지의 합 구하기
		int total = 0;
		
		for(int i=0; i<=100; i++) {
			total = total + i;
		}
		System.out.println(total);
		
		// for문을 통한 1~100사이 짝수의 합 구하기
//		int evenSum=0;
//		for(int i=0; i<=100; i++) {
//			if(i%2==0) {
//				evenSum = evenSum + i;
//			}
//		}
//		System.out.println(evenSum);
		
		// 위 예제에서 continue;응용
		int evenSum=0;
		for(int i=0; i<=100; i++) {
			if(i%2 !=0 ) {
				continue; // 아래문장을 수행하지 않고 반복문으로 돌아간다. 
			}
			evenSum = evenSum + i;
		}
		System.out.println(evenSum);
		
		
	}

}
