package day03;

// 값 입
import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		// Scanner : 클래스 (참조형) => new 연산자를 이용해서 객체를 생성해서 사용해야한다.
		// System.out : 출력
		// System.in  : 입력
		System.out.println("정수를 입력하세요: ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input % 2 ==0) {
			System.out.println(input+"은 짝수입니다.");
		}else {
			System.out.println(input+"은 홀수입니다.");
		}
		System.out.println("The End~~~");
		
	}
}
