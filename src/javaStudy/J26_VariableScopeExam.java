package javaStudy;

import javax.xml.bind.JAXBElement.GlobalScope;

/*
 * 변수의 scope와 static 
 */
public class J26_VariableScopeExam {
	int globalScope = 10;
	
	static int staticVal=7; // 정적 변수 선언
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		System.out.println(globalScope);
//		System.out.println(localScope); 사용 불가
//		System.out.println(value); 사용 불가
		System.out.println(value2);
	}
	
	public static void main(String args[]) {
//		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		
		// 모든 클래스는 인스턴스화 하지 않은 채로 사용할 수 없다.
		// 메인메소드에는 static 이라는 키워드가 있다.
		// 키워드 static을 사용하면 인스턴스화 하지 않아도 사용할 수 있다.
		
		System.out.println(staticVal); // 정적변수 사용
	
		// 인스턴스화를 통해 변수 사용하기
		J26_VariableScopeExam v1 = new J26_VariableScopeExam();
		System.out.println(v1.globalScope);
		
		J26_VariableScopeExam v2 = new J26_VariableScopeExam();
		System.out.println(v2.globalScope);
		
		v1.globalScope = 10;
		v2.globalScope = 20;
		
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		
		// 정적변수에 값 부여하기
		v1.staticVal = 50;
		v2.staticVal = 100;
		
		System.out.println(v1.staticVal);
		System.out.println(v2.staticVal);
		
		// 50, 100 이 출력할 것으로 예상하겠으나
		// 실제로는 100, 100 이 출력된다.
		// 클래스변수
		// static한 변수, 값을 저장할 수 있는 공간이 하나밖에 없어서 값을 공유한다.
		// 인스턴스가 생성되지않아도 사용할 수 있기때문에
		System.out.println(J26_VariableScopeExam.staticVal);
		// 클래스명.클래스변수명 이렇게 접근해서 사용하는것이 바람직하다.
		
		
	}
}
