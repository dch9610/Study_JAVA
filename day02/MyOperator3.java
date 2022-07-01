package day02;

public class MyOperator3 {
	public static void main(String[] args) {
		/*
		 * 변수 선언문 = (조건식) ? 값1 : 값2;
		 * => 조건식이 true이면 값 1을 변수에 대입
		 * 			 false이면 값2를 변수에 대입한다.
		 * 주의) 변수와 값1, 값2는 같은 자료형이어야 한다.
		 */
		System.out.println("6. 조건연산자(삼항연산자)");
		int a = 50;
		int b = 60;
		int result = (a>b)?a:b;
		System.out.println("result = "+result);
		
		// ""을 사용하여 string으로 변환 
		String str = (a>b)?a+"":b+"";
		System.out.println("str = "+str);
		System.out.println("-----------");
		
		
		/*
		 * =, +=, -=, *=, >>=, <<=, &=. ^=,...
		 */
		System.out.println("7. 할연산자(연산후 대입연산)");	
		int i = 1;
		i+=3;
		System.out.println("i="+i);
		
		int j=15;
		j-=7;
		System.out.println("j="+j);
		
		int k =24;
		k /= 2; 
		System.out.println("k="+k);
		
		int x = 10;
		x ^= 3; // 비트 연산 (XOR)
		System.out.println("x="+x);
		
		int y = 10;
		y <<= 2; // shift 연 (>>)
		System.out.println("y="+y);
		System.out.println("-----------");
		

		
		
		
		
	}
}
