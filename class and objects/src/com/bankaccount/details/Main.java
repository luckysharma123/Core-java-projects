package com.bankaccount.details;

import java.util.Scanner;

public class Main {
	int balance=10000;
	int withdrawl=500;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Account a=new Account();
		System.out.println("enter account id");
		int accountId=Integer.parseInt(s.nextLine());
		a.setAccountId(accountId);
		
		System.out.println("enter account type");
		String accountType=s.nextLine();
		a.setAccountType(accountType);
		
		System.out.println("enter balance");
		int balance=Integer.parseInt(s.nextLine());
		a.setBalance(balance);
		
		System.out.println("enter withdrwal");
		int withdrawl=Integer.parseInt(s.nextLine());
		a.setWithdrawl(withdrawl);
}
	public int Withdrawl() {
		
		if(balance>=withdrawl) {
			System.out.println("transcation succesful");
			}
		else {
			System.out.println("transcation not succesful"); 
		

		}
		return withdrawl;
	
	
}
}	