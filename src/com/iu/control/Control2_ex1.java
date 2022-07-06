package com.iu.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {	
		//월급을 입력
		//1. 정규직 2. 계약직
		//정규직 - 국민연금 1%, 건강보험 1.4%, 고용보험 0.5%, 산재보험 0.7%
		//계약직 - 3.3%
		Scanner sc = new Scanner(System.in);
		
		int sal = sc.nextInt();
		int select = sc.nextInt();
		
		if(select==1) {
			int tax1 = (int)(sal*0.01);
			int tax2 = (int)(sal*0.014);
			int tax3 = (int)(sal*0.005);
			int tax4 = (int)(sal*0.007);
			sal = sal - tax1 - tax2 - tax3 - tax4;
			
		}else {
			int tax5 = (int)(sal*0.033);
			sal = tax5;
		}
		/*int pay = 0;
		int num = 0;
		double g = 0;
		double j= 0;
		
		System.out.println("월급을 입력하세요");
		pay = sc.nextInt();
		System.out.println("정규직은 1, 계약직은 2를 입력");
		num = sc.nextInt();
		
		if (num==1) {
			j = pay-(pay*0.036);
			System.out.println("정규직 " + j + " 원");
		} else if(num==2) {
			g = pay-(pay*0.033);
			System.out.println("계약직 " + g + " 원");
		}*/
	}
}
