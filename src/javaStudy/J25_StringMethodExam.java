package javaStudy;
/*
 * String 클래스의 메소드들 
 */
public class J25_StringMethodExam {

	public static void main(String[] args) {
		//String str = new String("Hello")
		String str = "Hello";
		
		// 문자열의 길이를 리턴해준다.
		System.out.println(str.length()); // 출력 : 5
		
		// 문자열뒤에 문자열을 붙일때
		System.out.println(str.concat(" Java!!!"));
		// 객체를 바꾸지않는다. 다른곳에서 참조 할 수도 있기 때문에
		// 이를 불변 메소드라고 한다.
		
		// 바꾸려면 참조를 시켜줘야한다.
		str = str.concat("world"); 
		System.out.println(str); // 출력 : Helloworld
		
		// 문자열 자르기
		System.out.println(str.substring(3)); //3번까지 짜름
		System.out.println(str);
		System.out.println(str.substring(3, 6));//3번까지 짜르고 6번이후 짜른다.
								// 4번째부터 6번째글자 출력
	
	}

}
