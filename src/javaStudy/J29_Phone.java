package javaStudy;
/*
 * this
 * 자기 객체 참조 키워드 
 */
public class J29_Phone {

	String name;
	int number;

	// 매개변수의 이름을 사용할 때는 한눈에 알아볼수 있도록 짓는 것이 좋다.(직관적으로)
//	public J29_Phone(String n) {
	public J29_Phone(String name) {
		
		// 아래와 같이 표현하면 가깝게 선언된 변수를 우선 사용하기 때문에 
		// 매개변수의 name값을 매개변수 name에 대입하라는 의미가 된다.
		// 즉, 필드가 바뀌지 않는다.
		name = name;
		
		// 필드를 사용하려면 자기 객체 참조 키워드 this를 사용해야 한다.
		//this.name = name;
	}
}
