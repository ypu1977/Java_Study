package com.iu.loop;

import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		//분 과 초 입력받음
		//ex) 1, 15
		Scanner sc = new Scanner(System.in);
	      System.out.println("분을 입력해주세요");
	      int m1 = sc.nextInt();
	      System.out.println("초를 입력해주세요");
	      int s1 = sc.nextInt();
	      int m2 = 0;
	      int s2 = 0;
	      for(int m = 0; m < 60; m++) {
	         for(int s = 0; s < 60; s++) {
	            System.out.println(m + "분 :" + s + "초" );
	            if(m1 == m && s1 == s) {
	               s2 = s;
	               s = 60;
	            }
	         }
	         if(m1 == m && s1 == s2) {
	               break;
	         }
	      }
	}
}