package com.iu.loop;

import java.util.Scanner;

public class Loop55 {

	public static void main(String[] args) {
		//분 과 초 입력받음
		//ex) 1, 15
		Scanner sc = new Scanner(System.in);
	      System.out.println("분을 입력해주세요");
	      int m1 = sc.nextInt();
	      System.out.println("초를 입력해주세요");
	      int s1 = sc.nextInt();      
	      
	      boolean flag = false;
	      
	      for(int m = 0; m < 60; m++) {
	    	  
	         for(int s = 0; s < 60; s++) {
	            System.out.println(m + "분 :" + s + "초" );
	            if(m1 == m && s1 == s) {
	               flag = !flag;
	               m=60;
	               break;
	            }
	         }
	         if(flag) {
	               break;
	         }
	      }
	}
}