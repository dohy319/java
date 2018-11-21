package javaStudy;
/*
 * 반복문  
 * while문
 */
public class J13_WhileExam {

	public static void main(String[] args) {
//		int i = 0; // 초기값
//		
//		while(i<10) { // (조건)
//			
//			System.out.println(i);
//			
//			i++; // 증감; 없으면 무한루프, 조건을 빠져나올수 있도록 증감연산자 사용 
//		}
		
		// while문을 이용해 1부터 100까지 더하기
		int total = 0;
		int i =0;
		
		while(i<=100) {
			
			total = total + i;
			
			i++;
		}
		System.out.println(total);
	
		// 무한반복
		while(true) {
			System.out.println("hi");
			
		}
	}
}
