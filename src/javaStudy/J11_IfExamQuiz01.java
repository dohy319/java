package javaStudy;

public class J11_IfExamQuiz01 {
	public static void main(String[] args) {
//		변수 value가 3의 배수이면 ret에 3을 저장합니다. 
//		else if 문을 추가해 value가 4의 배수이면 
//		ret에 4를 저장하는 코드를 추가해보세요. 
		
		int value = 12;  // 수정해가며 확인
		int ret=0;
		
		if(value % 3 ==0) {
			ret = 3;
		}else if(value % 4 ==0) {
			ret = 4;
		}
		
		System.out.println(ret);
	}

}
