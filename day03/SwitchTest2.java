package day03;

import java.util.Scanner;

/*
 * 월(Month)을 입력해서 해당 월의 일수(days)를 출력하는 프로그램을 작성
 * 1, 3, 5, 7, 8, 10, 12월 : 31
 * 2 : 28일
 * 4, 6, 9, 11 : 30
 */

public class SwitchTest2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요: ");
		int month = sc.nextInt();
		int days = 0;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
				days=31;	
				break;
			}
			case 2:{
				days=28;
				break;
			}
			case 4: case 6: case 9: case 11:{
				days=30;
				break;
			}
			default:{
				System.out.println("없는 월입니다.");
				return;
			}
		
		}
		
		System.out.println(month+"월은 "+days+"일까지 있습니다.");

		
	}
	
}
