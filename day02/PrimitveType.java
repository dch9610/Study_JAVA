package day02;

public class PrimitveType {
	public static void main(String args[]) {
 		// Ctrl + d : 현재 커서 행을 삭제
		// Alt + 위 : 행 이동
		
		System.out.println("------- 기본자료형 -------");
		
		int a = 10;
		int b = 0110; // 정수(8진수) : 8진수는 앞에 0을 접두어로 붙인다 (0~7)
		int c = 0123;
		System.out.println("a="+a);
		System.out.println("b="+b); // 64 + 8 = 72
		System.out.println("c="+c); // 1*8^2 + 2*8^1 + 3*8^0 = 83
		System.out.println("-----------");
		
		int d = 0x12; // 정수(16진수) : 앞에 0x를 접두어로 붙인다.
		int e = 0x2ac; // 0 ~ 15 : 0 ~ 9, A, B, C, D, E, F
		System.out.println("d="+d); // 18
		System.out.println("e="+e); // 684
		System.out.println("-----------");
		
		char c1 = 'a';
		char c2 = 'a';
		int c3 = c1 + c2; // int 미만의 자료형 (byte, short, char) : int로 자동형변환이 일어남
		char c4 = (char) (c1 + c2);
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3); // 아스키코드 값 97 + 97 = 194
		System.out.println("c4="+c4); // 194를 문자로 Â
		System.out.println("-----------");
		
		double d1 = .456+2;
		double d2 = .456E+2;
		System.out.println("d1="+d1); // 2 + 0.456
		System.out.println("d2="+d2); // 0.456 * 10^2
		System.out.println("-----------");
	}
}
