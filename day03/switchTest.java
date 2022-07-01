package day03;

/* 
 * switch() 안에 들어가는 값, 변수, 수식 ==> 
 *		int (byte, short, int, char 가능) 이하의 자료형 또는 String만 가능
 *
 * switch(값|수식|변){
 * 
 * 		case 값1:
 * 			실행문;
 * 			break
 * 
 * 		case 값2:
 * 			실행문;		
 * 			break;
 * 
 * 		...
 * 
 * 		defalut:
 * 			실행문;
 * }
 */

import java.util.Scanner;

public class switchTest {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		int result = 0;
		
		System.out.println("정수1 입력하세요: ");
		int a = op.nextInt();
		
		// switch문에 사용하기 위해 char로 변환
		System.out.println("연산자 입력하세요: ");
		String operation = op.next();
		char oper = operation.charAt(0);
		
		System.out.println("정수2 입력하세요: ");
		int b = op.nextInt();
				
		switch (oper) {
		case '+': {
			result =a+b;
			break;
		}
		case '-': {
			result =a-b;
			break;
		}
		case '*': {
			result =a*b;
			break;
		}
		case '/': {
			result =a/b;
			break; // 소속된 {}을 이탈한다.
		}
		default:
			System.out.println("없는 연산자입니다.");
			return; // 보조 제어문
		}
		
		System.out.println(a+operation+b+"="+result);
	}
}
