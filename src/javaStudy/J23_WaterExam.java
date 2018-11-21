package javaStudy;

public class J23_WaterExam {
 
	public static void main(String[] args) {
		
		// Water클래스를 인스턴스화 하기
		J23_Water w1 = new J23_Water();
		J23_Water w2 = new J23_Water();
		
		// Water라는 인스턴스가 메모리에 2개 만들어 진다. 
		// 객체별로 name과 number라는 속성을 가진다.
		
		// 속성 이용하기
		// 참조 변수 다음에 나오는 점(dot)은 참조변수가 참조하는 객체가
		// 가지고 있는것을 사용할 때 사용
		
		// w1.name은 w1이 참조하는 객체의 name을 의미
		w1.name = "삼다수"; // w1이 참조하는 객체의 name을 소방차로 설정 
		w1.number = 1234; // w1.number = 1234란 w1이 참조하는 객체의 number를 1234 로 설정 
		
		w2.name = "에비앙"; // w2가 가리키는 객체의name을 구급차로 설정
		w2.number = 1097;  // w2가 가리키는 객체의 number를 1004로 설정

		
		System.out.println(w1.name); // 콘솔에 w1이 참조하는 객체의 name을 출력
		System.out.println(w1.number); // 콘솔에 w2이 참조하는 객체의 number을 출력
				
		String name = w2.name; 
		// w2가 참조하는 객체의 name 을 String 타입 변수 name 도 참조
	}

}
