package javaStudy;
/*
 * 조건문 if 
 */
public class J11_IfExam {
	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		
//		if( x < y) { // x < y 일때 중괄호 안의 내용 실행
//			System.out.println("x는 y보다 작다.");
//			System.out.println("test");
//		}
//		
//		if( x == y ) // 중괄호로 감싸지 않으면 아래 한 문장만 조건문에 의해 실행 
//			System.out.println("x는 y와 같다.");
//		System.out.println("test");
		
		if(x==y) {   // 만약 (조건)에 해당된다면
			System.out.println("x는 y와 같다.");
		}else if(x<y) { // 아니면 (조건)에 해당된다면
			System.out.println("x는 y보다 작다.");
		}else { // 아니면 {} 실행
			System.out.println("x는 y와 다르다.");
		}
	}
}
