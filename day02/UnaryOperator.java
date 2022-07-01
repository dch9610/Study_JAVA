package day02;

public class UnaryOperator {
	public static void main(String[] args) {
		System.out.println("1. 단항 연산자 (부호 연산자: +, -)");
		
		int a = -8;
		System.out.println("+a="+ +a);
		System.out.println("-a="+ -a);
		System.out.println("-----------");
		
		int b = 5;
		long  c = 9;
		b++; // b = b+1
		c--; // c = c-1
		System.out.println("b="+b); // 6
		System.out.println("c="+c); // 8
		// ++, --가 단독으로 사용할 때는 차이가 없다.
		// 하지만 다른 수식과 함께 사용되면 ++, -- 차이가 있다.
		++b;
		--c;
		System.out.println("b="+b); // 7
		System.out.println("c="+c); // 7
		System.out.println("-----------");
		
		// ++, --가 앞에 오면 연산 후 값을 사
		float d = 5.3f;
		double e = 7.3d;
		System.out.println("d++ ="+ d++); // 5.3
		System.out.println("d ="+d); // 6.3
		
		System.out.println("e-- ="+e--); // 7.3
		System.out.println("e ="+e); // 6.3
		System.out.println("-----------");
		
		int x = 10;
		int y = x++;
		System.out.println("x="+x); // 11
		System.out.println("y="+y); // 10
		
		x = 10;
		int z = ++x;
		System.out.println("x="+x); // 11
		System.out.println("z="+z); // 11
		
		
		/*
		 * 정수값을 비트로 바꾸고 연산을 수행하는데, 비트별 not연산자는
		 * 1을 0으로, 0을 1로 바꾸는 연산자.
		 * 첫비트가 0이면 양수, 1이면 음수
		 * 3  : 00000000 00000000 00000000 00000011
		 * ~3 : 11111111 11111111 11111111 11111100
		 * 1이 계속 반복되는지점까지 지우고 마지막 부분을 10진수로 변경 (100 => 4)
		 * 첫비트가 1이기때문에 -4
		 */
		System.out.println("3. 비트별 not 연산");
		int m = 3; // int 32비트 
		int n = 7;
		System.out.println("m="+m); // 3 
		System.out.println("~m="+~m); // -4 
		System.out.println("n="+n); // 7 
		System.out.println("~n="+~n); // -8
		System.out.println("-----------");
		
		
		// 문제1
		int k = 0xfffffff1; 
		System.out.println("~k:"+(~k)); // 1110
		
		// 42
		int i = 0b101010;
		int j = -42; 
		System.out.println("0b i:"+i);
		System.out.println("~j :"+ (~j));
		System.out.println("-----------");
		
		
		// boolean형에만 사용가능, int형에는 사용할 수 없다.
		// true => false로, false => true로 바꾼다.
		System.out.println("4. 논리 부정 연산자 : !");
		boolean bo = true;
		System.out.println("bo : "+bo);
		System.out.println("!bo : "+!bo);
		System.out.println("!(3<2) : "+!(3<2));
		
		int fo=5;
		// == (등가연산자) : 기본자료형에서는 값이 같은지 비교한다.
		// != : 값이 다르면 true를 반환, 같으면 false를 반환
		System.out.println("fo==5.0 : "+ (fo==5.0));
		System.out.println("fo==5.0 : "+ (fo!=5.0));
		
		
		
	}
}
