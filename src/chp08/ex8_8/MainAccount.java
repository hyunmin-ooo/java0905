package chp08.ex8_8;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.printf("계좌번호입력(5자리):");
        String accNumber = scanner1.nextLine();
        System.out.printf("성명입력:");
        String name = scanner1.nextLine();
        System.out. printf("비밀번호:");
        String pwd = scanner1.nextLine();
        System.out.printf("입금할 금액:");
        int balance = scanner2.nextInt();

        Account account = new Account(balance,accNumber, name, pwd);
        System.out.println(account);

        System.out.printf("입금:");
        int deposit = scanner2.nextInt();
        account.deposit(deposit);

        System.out.printf("출금:");
        int withdraw = scanner2.nextInt();
        account.withdraw(withdraw);

        System.out.printf("%s님의 통장 잔액은 %d원입니다.\n", account.getName(),account.getBalance());

        scanner1.close();
        scanner2.close();
        }
    }

