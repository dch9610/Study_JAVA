package day02;

public class MyOperator2 {

	public static void main(String[] args) {
		/*
		 * 정수에만 사용되는 연산자
		 * & (and 연산자) : 두 비트가 1일때만 1
		 * | (or 연산자)  : 두 비트 중 한개라도 1이면 1, 모두 0이면 0
		 * ^ (XOR 연산자) : 두 비트가 서로 다르면 1, 같으면 0
		 */
		System.out.println("4. 비트연산자 : &, |, ^");
		
		int x=3;
		int y=5;
		System.out.println("x&y = "+(x&y));
		System.out.println("x|y = "+(x|y));
		System.out.println("x^y = "+(x^y));
		System.out.println("-----------");
		
		/*
		
		1) &, &&
		2) |, ||

		&, | 의 경우: &,| 연산자를 사용하면 앞의 연산으로 결과를
					     알 수 있어도 뒤의 문장까지 비교한다.
        &&,|| 의 경우:  앞의 연산으로 결과를 알 수 있을 경우
							뒤의 문장은 수행하지 않는다.
							예를 들어 &&의 경우, 앞의 연산결과가 false이면
							뒤의 연산을 생략.
							||의 경우 앞의 연산결과가 true이면 뒤의 연산을 생략
		*/
		System.out.println("5. 논연산자 : &, &&, |, ||");
		
		int a=5;
		int b=6;
		if((a>b) & (a>0)){
			System.out.println("A");
		} else if((b>a | (b<0))){
			System.out.println("B");
		}
		System.out.println("-----------");
		
		// [문제 1] 출력문의 결과를 예측하시오
		int i=1; // i = 1
		int j=i++; // i = 2
		System.out.println(i);
		System.out.println(j);
		
		// &  : 조건식을 다 수행 i++ => i = 3
		// && : 앞 조건식을 수행 후 조건에 맞는 경우만 뒤에 조건 수 
		if((i>++j) && (i++==j)) {
			System.out.println("Hi");
			i=i+j;
		}
		System.out.println("i="+i); // & : i=3, && i=2
		System.out.println("-----------");
		
		// [문제 2]
		int k = 0;
		int p = 1;
		
		// | : 두개의 조건식 모두 수행 (앞의 조건이 true 비교후 1 증가)
		// || : 한개의 조건식이 true이면 종
		if((k++ == 0) | (p++ ==  2)) {
			k=42;
		}
		System.out.println("k="+k+", p="+p); // | : k=42, p=2, || : k=42, p=1
		System.out.println("-----------");
		
		// [문제 3]
		boolean r = false;
		boolean e = false;
		boolean w = ( (r=true) || (e=true) );
		// | : true, true, true,  || : true, false, true 
		System.out.println(r+", "+e+", "+w); 
	}
	
	

}
