package day03;

/*	loop문
 *  [1]for문	
 *  	for (변수 선언문; 조건식; 증감식){
 *  		실행문
 *  	} // 조건식이 true일 동안 실행문을 반복해서 실행한다.
 * 
 */


public class ForTest1 {
	public static void main(String[] args) {
		// 지역 변수 i 반복문에만 살아있음
		for(int i=1; i<8; i++) {
			System.out.println(i+" Hello World!!");
		}
		
		int j = 10; // 지역변수 선
		for(; j>3; j--) {
			System.out.println(j+" Hi World!!");
		}

	}
}
