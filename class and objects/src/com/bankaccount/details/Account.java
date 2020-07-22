package com.bankaccount.details;

public class Account {
	private int accountId;
	private String accountType;
	private int balance;
	public int withdrawl;
	public Account() {
		super();
		
	}
	public Account(int accountId, String accountType, int balance, int withdrawl) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.balance = balance;
		this.withdrawl = withdrawl;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(int withdrawl) {
		this.withdrawl = withdrawl;
	}
}
