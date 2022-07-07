package com.iu.control;

import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점 평균 계산
		//평균 90점 이상이면 A
		//평균 80점 이상이면 B
		//평균 70점 이상이면 C
		//평균 60점 이상이면 D
		//그 외는 F
		Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		int avg = 0;
		
		System.out.println("국어 점수 입력");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력");
		math = sc.nextInt();
		
		sum = kor + eng + math; 
		avg = sum/3;
		
		System.out.println("총점은 : "+ sum + "점");
		System.out.println("평균은 : "+ avg + "점");
		
	    if(avg >= 90){
	    	System.out.println("학점 A");
	    } else if (avg>=80) {
	    	System.out.println("학점 B");
	    } else if (avg>=70) {
	    	System.out.println("학점 C");
	    } else if (avg>=60) {
		    System.out.println("학점 D");
	    } else {
		    System.out.println("학점 F");
	    }
	}
}