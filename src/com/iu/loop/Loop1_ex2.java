package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		//1. 1번 대문자, 2번 소문자
		//   1번이면 A - Z 출력
		//   2번이면 a - z 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("1번이면 대문자, 2번이면 소문자");
		int num = sc.nextInt();
		if(num==1) {
		for(int i = 65; i<=90; i++)
		System.out.println((char)i);
		}
	    else if (num==2) {
			 for (int i=97; i<=122; i++)
			  System.out.println((char)i);
		}
		
//		int i = 97;
//		int j = 123;
//		
//		if(num ==1) {
//			i = 65;
//			j = 91;
//		}
//		for (int c=i; c<j; c++) {
//			System.out.println();
//		}
		
		//2. 1-10까지의 합 구하기
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;		
		}
		System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");
		
		//3. ID, PW입력해서 로그인 판단
		//   최대 5번까지 시도 가능
		//   
		int yId = 1234; // id
	    int yPw = 5678; // 비번
	    int i = 0;
	    boolean check=false;
	    for(int j=0; j<5;j++) {
	       System.out.println("아이디를 입력하세요");
	       int a = sc.nextInt();
	       System.out.println("비밀번호를 입력하세요");
	       int b = sc.nextInt();
	         
	       if (a == yId && b == yPw) {
	          System.out.println("로그인 성공");
	          check=!check;
	          j = 5;
	       }
	       else {
	          i++;
	          System.out.println(i + "번 로그인에 실패하였습니다");
	       }
	    }
	    /*if(i==5) {	    
	       System.out.println("로그인 5번 전부 실패");
	    } else {
	    	System.out.println("게임시작");
	    }*/
	    
	    if(check) {	    	       
	       System.out.println("게임시작");
	    } else {
	       System.out.println("로그인 5번 전부 실패");
	    }
		
	}

}
