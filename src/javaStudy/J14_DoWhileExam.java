package javaStudy;
/*
 * 반복문 
 * do while문
 * 
 * while문과 달리 do while 문은 while(조건문); 끝에 세미콜론이 있어야 한다. 
 */
import java.util.Scanner;

public class J14_DoWhileExam {

	public static void main(String[] args) {
		int value =0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("입력 받은 값 : ");
			value = sc.nextInt();
		}while(value!=10); 
	}

}
