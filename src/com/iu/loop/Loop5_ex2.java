package com.iu.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

	public static void main(String[] args) {
//		nextInt(정수) : 0부터 입력한 정수 미만 범위에서 무작위 정수를 뽑아
//		int num = random.nextInt(10);
//		System.out.println(num);
		
		
		//0 : 가위
		//1 : 주먹
		//2 : 보
		
		//사용자가 하나를 입력
		//컴퓨터가 하나를 뽑아서 비교
		//사용자가 이길 경우만 종료
		//비기거나 지면 다시 실행
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
        while(true){
        System.out.println("가위 바위 보 중 하나를 입력하세요.(1: 가위, 2: 바위, 3: 보)");
        int user = sc.nextInt();    // 1가위, 2바위, 3보

        System.out.print("컴퓨터 : ");

        int com = random.nextInt(3);
        switch (com) {
            case 1:
                System.out.println("가위");
                break;
            case 2:
                System.out.println("바위");
                break;
            case 3:
                System.out.println("보");
                break; }

        System.out.print("유저 : ");

        switch (user) {
            case 1:
                System.out.println("가위");
                break;
            case 2:
                System.out.println("바위");
                break;
            case 3:
                System.out.println("보");
                break; }

        // 1가위-3보, 2바위-1가위, 3보-2바위
        if ( user == com  ) {
            System.out.println("컴퓨터와 비겼습니다.");}
        else if ( (user==1 && com==3) || (user==2 && com==1) ||(user==3 && com==2) ){
            System.out.println("유저가 이겼습니다."); 
            break;
        }
        else System.out.println("컴퓨터가 이겼습니다.");
        }	
    }
}