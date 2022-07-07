package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		//1
		Scanner sc = new Scanner(System.in);	
		System.out.println("1-5 사이의 숫자 입력");
		int num = sc.nextInt();	//1-5;
		System.out.println("알파벳을 입력");
		char ch = sc.next().charAt(0); 
		// num:1 ch:a 출력 b
		// num:2 ch:a 출력 c
		// num:1 ch:z 출력 a
		// num:2 ch:z 출력 b
		
		ch = (char)(ch+num);
		
		System.out.println("ch : "+ch);
		
		/*if(num==1) {
			ch += 1;
		} else if(num==2) {
			ch += 2;
		} else if(num==3) {
			ch += 3;
		} else if(num==4) {
			ch += 4;
		} else if(num==5) {
			ch += 5;
		}
		
		if(ch>=122) {
			ch -= 26;
		}
		System.out.println(ch);*/
		
		//추가
		
	}
}