package javaStudy;

public class J31_CarExam {

	public static void main(String[] args) {
		
		J31_Car c1 = new J31_Car("소방차");
		J31_Car c2 = new J31_Car();
		J31_Car c3 = new J31_Car("구급차",1000);
		
		
		System.out.println(c3.name);
		System.out.println(c3.number);
	}
}
