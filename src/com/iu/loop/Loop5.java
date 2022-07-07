package com.iu.loop;

import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		//분 과 초 입력받음
		//ex) 1, 15
		Scanner sc = new Scanner(System.in);
		int m = 0;
		int s = 0;
		
		m = sc.nextInt();
		System.out.println("분을 입력하세요");
		s = sc.nextInt();
		System.out.println("초를 입력하세요");
		
		for(m=0; m<60; m++) {
			for(s=0; s<60; s++) {
				System.out.println(m + "분 :"+ s +" 초");
			}
		}

	}

}
