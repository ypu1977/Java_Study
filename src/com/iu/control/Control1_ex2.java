package com.iu.control;

import java.util.Scanner;

public class Control1_ex2 {
	public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      //단일 if문 1개로 홀슈 짝수 판별
	      Scanner sc = new Scanner(System.in);
	      String b = "홀수";
	      int num = sc.nextInt();
	      if (num%2==0) {
	         b = "짝수";
	      }
	      System.out.println(b);	      
	}
}	      
	      /*if(num%2 == 0) {
	    	  result="짝수 입니다";
	      }
	      
	      result = num%2==0?"짝수입니다":"홀수입니다";
	      
	      System.out.println(result);*/