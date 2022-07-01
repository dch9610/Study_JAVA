package day03;

import java.util.Scanner;

/*문제2] ***수도요금 계산***************
-메뉴 (1 ~ 3), 사용량 (liter)
   1. 가정용 (liter당 50원)
   2. 상업용 (liter당 45원)
   3. 공업용 (liter당 30원)
   =>메뉴 선택후 사용량을 입력받는다.
 -출력될 내용
  1) 사용자 코드, 사용량, 총수도요금
   cf)사용요금=사용량 * 리터당 가격
      총수도요금=수도사용요금+세금(요금의
          5%)
*/
public class SwitchTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------0-Menu--------");
		System.out.println("1. 가정용 (liter당 50원) ");
		System.out.println("2. 가정용 (liter당 40원) ");
		System.out.println("3. 가정용 (liter당 30원) ");
		System.out.println("----------------------");
		
		// 1. 메뉴 선택
		System.out.print("메뉴를 선택하세요: ");
		int menu = sc.nextInt();
		System.out.println("----------------------");
		
		// 2. 사용량 입력
		System.out.print("사용량을 입력하세요: ");
		int liter = sc.nextInt();
		System.out.println("----------------------");
		
		// 3. 사용요금, 총 수도요금 변수 선언
		float amount = 0;
		float sumAmount = 0;
		
		
		switch(menu) {
			case 1:{
				amount = liter * 50;
				sumAmount = amount * 1.05f; 
				break;
			}
			case 2:{
				amount = liter * 40;
				sumAmount = amount * 1.05f; 
				break;
			}
			case 3:{
				amount = liter * 30;
				sumAmount = amount * 1.05f; 
				break;
			}
			default:{
				System.out.println("없는 메뉴 입니다.");
				return;
			}
		}
		
		System.out.println("사용자 코드: "+menu + "\n사용량: "+liter + "\n총 수도요금: "+sumAmount);
	}
}
