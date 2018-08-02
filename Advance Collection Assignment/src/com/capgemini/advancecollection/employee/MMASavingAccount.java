package com.capgemini.advancecollection.employee;

public class MMASavingAccount {
	
	private int accountId;
	private String accHolderName;
	private int accBalance;
	private boolean isSavingAcc;
	
	
	public MMASavingAccount(int accountId, String accHolderName, int accBalance, boolean isSavingAcc) {
		super();
		this.accountId = accountId;
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
		this.isSavingAcc = isSavingAcc;
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public int getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	public boolean isSavingAcc() {
		return isSavingAcc;
	}
	public void setSavingAcc(boolean isSavingAcc) {
		this.isSavingAcc = isSavingAcc;
	}
	
	@Override
	public String toString() {
		return "MMASavingAccount [accountId=" + accountId + ", accHolderName=" + accHolderName + ", accBalance="
				+ accBalance + ", isSavingAcc=" + isSavingAcc + "]";
	}
	
	
}
