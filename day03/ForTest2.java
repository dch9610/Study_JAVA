package day03;
/*
 *	for문을 이용해 7단을 출력하세요
 *	7 x 1 = 7
 *  7 x 2 = 7
 *  ...
 */
public class ForTest2 {
	public static void main(String[] args) {
		// [문제 1] 구구단 7단을 완성하시오
		System.out.println("문제 1 결과 : ");
		int num = 7;
		for (int i=1; i<10;i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
		System.out.println("----------------------");
		
		// [문제 2] 1 ~ 10까지의 합을 구해 출력하시오
		int sum2 = 0;
		for (int i=1; i<=10; i++) {
			sum2 += i; 
		}
		System.out.println("문제 2 결과 : " + sum2);
		System.out.println("----------------------");
		
		// [문제 3] 1 ~ 10까지의 곱을 구해 출력하시오
		int sum3 = 1;
		for (int i=1; i<=10; i++) {
			sum3 *= i; 
		}
		System.out.println("문제 3 결과 : " + sum3);
		System.out.println("----------------------");
		
		// [문제 4] 1 ~ 100까지의 짝수들의 합을 출력하시오
		int sum4 = 0;
		for (int i=1; i<=100; i++) {
			if(i%2==0) {
				sum4 += i; 
			}
			
		}
		System.out.println("문제 4 결과 : " + sum4);
		System.out.println("----------------------");
		
		// [문제 5] 1 ~ 100까지의 수 중 17로 나누어 떨어지는 수를 출력하세요
		System.out.println("문제 5 결과 : ");
		for (int i=1; i<=100; i++) {
			if(i%17==0) {
				
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("----------------------");
		
		// [문제 6] 대문자 알파벳[A ~ Z]를 출력하시오
		System.out.println("문제 6 결과 : ");
		for(int i=65; i<91; i++) {
			char eng = (char)i;
			System.out.print(eng + " ");
		}
		System.out.println();
		System.out.println("----------------------");
		
		
		System.out.println("문제 6 결과 : ");
		for(char i='A'; i<='Z'; i++) {
			
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("----------------------");
	}
}
