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
			System.out.println("--------------<�л����������ý���>--------------");
			System.out.println("                1. �л����� ����");
			System.out.println("                2. �������� ����");
			System.out.println("                3. ���α׷� ����");
			num = sc.nextInt();
			if(num==1){
				studentInfo();
			}else if(num==2){
				gradeInfo();
			}else if(num==3){
				System.exit(0);
			}else{
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	private void studentInfo(){
		
	}
	private void gradeInfo(){
		
	}
}
