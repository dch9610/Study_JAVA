package day02;

public class MyOpearator {
	public static void main(String[] args) {
		// +, -, *, /(나눈 몫을 구하는 연산자), %(나머지 값을 구하는 연산자)
		System.out.println("1. 산술연산자-----");
		
		int a = 10;
		System.out.println("a-6 = "+ (a-6));
		System.out.println("a+6 = "+ (a+6));
		System.out.println("a*6 = "+ (a*6));
		System.out.println("a/6 = "+ (a/6));
		System.out.println("a%6 = "+ (a%6));
		
		double b = 10;
		System.out.println("b/6 = "+ (b/6));
		System.out.println("b%6 = "+ (b%6));
		System.out.println("-----------");
		
		/*
		 * 1) >> : 오른쪽으로 비트수만큼 이동 (앞에 남은 빈칸은 부호비트로 채운다.)
		 * 2) << : 왼쪽으로 비트수만큼 이동 (뒤에 남은 빈칸은 0으로 채운다.)
		 * 3) >>> : 오른쪽으로 비트수만큼 이동 (앞에 남은 빈칸은 무조건 0으로 채운다.)
		 */
		System.out.println("2. Shift 연산자 (<<, >>, >>>, ..)");
		// 42 : 00000000 00000000 00000000 00101110
		System.out.println("42<<3 : "+(42<<3)); // 00000 00000000 00000000 00101110 000
		System.out.println("42>>3 : "+(42>>3)); // 000 00000000 00000000 00000000 00101
		System.out.println("42>>>3 : "+(42>>>3)); 
		
		// -43 : 11111111 11111111 11111111 11010101
		System.out.println("-43<<2 : "+(-43<<2)); // 111111 11111111 11111111 11010101 00
		System.out.println("-43<<2 : "+(-43>>2)); // 11 11111111 11111111 11111111 110101
		System.out.println("-43<<2 : "+(-43>>>2)); // 00 111111 11111111 11111111 11010101
		System.out.println("-----------");
		
		
		// 참조변수 instanceof 클래스명 : 참조변수가 클래스의 객체인
		System.out.println("3. 비 연산자 (==, !=, >, >=, instanceof)");
		int m = 60;
		int n = 160;
		System.out.println("m>=n : "+(m>=n));
		System.out.println("m>n : "+(m>n));
		System.out.println("m!=n : "+(m!=n));
		System.out.println("-----------");
		
		if(m>=n) {
			System.out.println("@@@@");
		}else {
			System.out.println("!!!!");
		}
		
		
		
	}
}
