package day03;

/*
 * 중첩 for문
 */

public class ForTset3 {
	public static void main(String[] args) {
		for(int i=2; i<4; i++) {
			for(int j=1; j<3; j++) {
				System.out.println("i="+i+", j=" + j);
				
			}
			
		}
		System.out.println("------------------");

		
		/*
		 * [문제 1] 아래모양이 되도록 출력하시오.
		 *  ★★★★★
		 *  ★★★★★
		 *  ★★★★★
		 */
		System.out.println("문제 1 결과 : ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("★");
				
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		// [문제2] 구구단 전체를 출력
		System.out.println("문제 2 결과 : ");
		for(int i =1; i <10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j +" x " + i + " = " + i*j + "\t");
				
				
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		
		
		
	}
}
