package day02;

import java.util.Date;

public class ReferenceType {
	public static void main(String args[]) {
		/*
		 * [1] 클래스형 : String, Date, ...
		 * [2] 인터페이스형
		 * [3] 배열 : String[], int[], ...
		 * 참조형은 반드시 new 연산자로 객체를 생성해서 사용해야 한다.
		 * 단 예외가 있다. String의 경우 자주 사용되는 유형이므로
		 * 가본자료형처럼 문자열 값(literal)을 직접 할당할 수 있다.
		 */
		
		/*
		 * 기본자료형 : 주로 연산에 사용된다.
		 * 참조형 : [데이터(변수) + 기능(메소드)]
		 */
		System.out.println("------참조형(reference type)------");
		String s1 = new String("Jave");
		String s2 = "Hello"; // 기본 자료형처럼 직접 할당가능, String의 경우 new 사용안해도 가
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("s2_upper="+s2.toUpperCase());
		System.out.println("s2_lower="+s2.toLowerCase());
		System.out.println("-----------");
		
		
		int a = 20;
		int b = 30;
		System.out.println(a+b+"<=합"); // 50<=합 (문자열)
		System.out.println("합=>"+a+b); // 합=>2030 (문자열)
		System.out.println("합=>"+(int)(a+b)); // 합=>50
		System.out.println("-----------");
		
		
		Date today = new Date();
		System.out.println("today="+today);
		System.out.println("-----------");
		
		
	}
}
