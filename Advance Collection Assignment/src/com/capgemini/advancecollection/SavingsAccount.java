package com.capgemini.advancecollection;

public class SavingsAccount implements Comparable<SavingsAccount>{
	
	private int accountBalance;
	private int accountId;
	private String accountHolderName;
	private boolean isSalaryAccount;
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public SavingsAccount(int accountBalance, int accountId, String accountHolderName, boolean isSalaryAccount) {
		//super();
		this.accountBalance = accountBalance;
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}

	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	//withdraw method to withdraw amount
	public void withdraw(int amount) {
		if(accountBalance < amount) 
			System.out.println("cant be wihdrawn");
		else
			accountBalance -= amount;
	}
	
	//deposit method to deposit the amount
	public void deposit(int amount) {
		accountBalance += amount;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountBalance=" + accountBalance + ", accountId=" + accountId + ", accountHolderName="
				+ accountHolderName + ", isSalaryAccount=" + isSalaryAccount + "]";
	}

	@Override
	public int compareTo(SavingsAccount arg0) {
		
		return this.getAccountId() - arg0.getAccountId();
		
	}

	
}
