package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int yId = 1234;
		int yPw = 5678;
				
		//ID 입력, PW 입력
		//로그인 판단 로그인이 성공하면 종료
		//실패하면 다시 입력
		boolean check = true;
		
		while(check) {
			System.out.println("ID 입력");
			int id = sc.nextInt();
			System.out.println("PW 입력");
			int pw = sc.nextInt();
			
			if(id==yId&&pw==yPw) {
				System.out.println("로그인 성공");
				check=!check;
				break;
			} else
				System.out.println("로그인 실패");
		}
		break;
		defult :
			check=!check;
					//switich 끝
		
	//while

	    	//--------------------------------------
			//로그인을 안했으면 프로그램이 종료
			//로그인에 성공했으면 게임 시작
			//RPG
			//시작레벨은 1
			//만렙     15
			//gold    : 1000
			//모든 몬스터의 경험치는 동일
			//1 -> 2  : 3
			//2 -> 3  : 6
			//3 -> 4  : 9
			//4 -> 5  : 12
			//...
			//14 -> 15 : 
			
			//5렙달성시 축하금으로 1000Gold 지급
			//10렙달성시 축하금으로 2000Gold 지급
			//15렙달성시 축하금으로 3000Gold 지급
			
			boolean check = true;
			int exp = 0;
			
			while(select) {
			System.out.println("");	

	}
}