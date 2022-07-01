package day03;

import java.util.Scanner;

public class IfTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("평균 점수를 입력하세요: ");
		float score = sc.nextFloat();
		System.out.println("평균점수:"+score);
		char hak = ' ';
		
		if(100>=score && score>=90) {
			hak = 'A';
		}else if(score>=80){
			hak = 'B';
		}else if(score>=70){
			hak = 'C';
		}else if(score>=60){
			hak = 'D';
		}else if(60>score){
			hak = 'F';
		}else {
			System.out.println("점수범위 초과");
		}
		
		System.out.println("학점:"+hak);
	}
}
