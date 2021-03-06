package bank;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-------------------------------------");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
	}

	private static void createAccount() {
		String ano; // 계좌번호
		String owner; // 계좌주
		int balance; // 금액
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		ano = scanner.next();
		System.out.print("계좌주 : ");
		owner = scanner.next();
		System.out.print("초기입금금액 : ");
		balance = scanner.nextInt();
		Account account = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				return;
			}
		}
		System.out.println("생성할 수 없습니다.");
		return;
	}

	private static void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t"
						+ accountArray[i].getBalance());
			}
		}

	}

	private static void deposit() {
		String ano; // 계좌번호
		int balance; // 금액
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		ano = scanner.next();
		System.out.print("예금액 : ");
		balance = scanner.nextInt();

		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("일치하는 계좌가 없습니다.");
			return;
		}

		account.setBalance(account.getBalance() + balance);
		System.out.println("입금이 성공되었습니다.");
		return;

	}

	private static void withdraw() {
		String ano; // 계좌번호
		int balance; // 금액
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		ano = scanner.next();
		System.out.print("출금액 : ");
		balance = scanner.nextInt();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("일치하는 계좌가 없습니다.");
			return;
		}

		if (account.getBalance() - balance < 0) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		account.setBalance(account.getBalance() - balance);
		System.out.println("출금이 성공되었습니다.");
		return;

	}

	private static Account findAccount(String ano) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno() == ano) {
				return accountArray[i];
			}
		}
		return null;
	}
}
