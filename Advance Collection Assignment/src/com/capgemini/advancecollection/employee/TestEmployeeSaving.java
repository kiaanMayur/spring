package com.capgemini.advancecollection.employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//class to store EmployeeInformation and MMASavingsAccound in a same entity(HashMap)
public class TestEmployeeSaving {
	
	public static void main(String[] args) {
		
		//initialising the EmployeeInformation objects
		EmployeeInformation mayur = new EmployeeInformation(111, "Mayur", "Analyst", 17_000);
		EmployeeInformation gaurav = new EmployeeInformation(123, "Gaurav", "Analyst", 17_001);
		EmployeeInformation udit = new EmployeeInformation(222, "Udit", "Associate", 16_001);
		EmployeeInformation alok = new EmployeeInformation(333, "Alok", "A4", 13_001);
		EmployeeInformation rahul = new EmployeeInformation(444, "Rahul", "A3", 13_002);
		EmployeeInformation satyen = new EmployeeInformation(101, "Satyen", "POC expert", 80_000);
		
		//initialising the MMASavingAccount object
		MMASavingAccount mayurSaving = new MMASavingAccount(001, mayur.getEmpName(), 10_000, true);
		MMASavingAccount gauravSaving = new MMASavingAccount(021, gaurav.getEmpName(), 10_000, true);
		MMASavingAccount alokSaving = new MMASavingAccount(002, alok.getEmpName(), 10_000, true);
		MMASavingAccount uditSaving = new MMASavingAccount(032, udit.getEmpName(), 10_000, true);
		MMASavingAccount rahulSaving = new MMASavingAccount(045, rahul.getEmpName(), 10_000, true);
		MMASavingAccount satyenSaving = new MMASavingAccount(005, satyen.getEmpName(), 1_10_000, false);
		
		//creation of a HashMap with generics as EmployeeInformation = key & MMASavingAccount = value
		Map<EmployeeInformation, MMASavingAccount> details = new HashMap<>();
		
		//adding the values in the hashmap
		details.put(mayur, mayurSaving);
		details.put(gaurav, gauravSaving);
		details.put(alok, alokSaving);
		details.put(udit, uditSaving);
		details.put(rahul, rahulSaving);
		details.put(satyen, satyenSaving);
		
		//invokation of entrySet() method
		Set<Entry<EmployeeInformation, MMASavingAccount>> disp =  details.entrySet();
		
		//Consumer<disp> display = System.out :: println;
		
		//displaying the hashmap objects
		for(Entry e: disp ) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
