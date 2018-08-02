package com.capgemini.advancecollection;

import java.util.*;

//class which maintain the objects of SavingsAccounts
public class BankAccountList {
	
	public static void main(String[] args) {
		
		//initialising the treeset with generic SavingsAccount
		Set<SavingsAccount> savings = new TreeSet<>();
		
		//Adding the values in the treeset
		savings.add(new SavingsAccount(10_000, 123, "Mayur", true));
		savings.add(new SavingsAccount(12_560, 116, "Udit", true));
		savings.add(new SavingsAccount(3_000, 102, "Gaurav", false));
		savings.add(new SavingsAccount(1_000, 132, "Alok", true));
		savings.add(new SavingsAccount(5_000, 100, "Rahul", false));
		savings.add(new SavingsAccount(41_000, 231, "Satyen", true));
		savings.add(new SavingsAccount(41_000, 231, "Satyen", true)); //this will not be added int the treeset
		
		//displaying the values of the treeset
		for(SavingsAccount sa : savings) {
			System.out.println(sa);
		}
		
	}

}
