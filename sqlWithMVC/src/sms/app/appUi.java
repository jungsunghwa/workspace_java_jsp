package sms.app;

import java.util.Scanner;

public class appUi {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		appUi aU = new appUi();
		aU.mainmenu();
	}
	
	private void mainmenu(){
		int num;
		while(true){
			System.out.println("--------------<학생정보관리시스템>--------------");
			System.out.println("                1. 학생정보 관리");
			System.out.println("                2. 성적정보 관리");
			System.out.println("                3. 프로그램 종료");
			num = sc.nextInt();
			if(num==1){
				studentInfo();
			}else if(num==2){
				gradeInfo();
			}else if(num==3){
				System.exit(0);
			}else{
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
		}
	}
	private void studentInfo(){
		
	}
	private void gradeInfo(){
		
	}
}
