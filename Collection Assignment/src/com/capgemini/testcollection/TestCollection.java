package com.capgemini.testcollection;

import java.util.*;

import com.capgemini.collectionclass.*;

public class TestCollection {
	
	public static void main(String args[]) {
	
		Laptop hp = new Laptop("HP", "ab219tx", "Windows 10", "intel i5");
		Laptop dell = new Laptop("Dell", "5000s", "Linux", "intel i3");
		Laptop lenovo = new Laptop("Lenovo", "yoga", "Ubuntu", "intel i7");
	
		Car bmw = new Car("BMW", "520d", 2015, 27_80_000);
		Car audi = new Car("Audi", "R8 spyder", 2017, 77_80_000);
		Car porche = new Car("Porsche", "911 Spyder", 2012, 87_40_000);
	
		Television sony = new Television("Sony", "LCD", true, 56_000);
		Television lg = new Television("LG", "LED", false, 35_000);
		Television samsung = new Television("Samsung", "Plasma", true, 1_56_000);
	
		CellPhone nokia = new CellPhone("Nokia", "3310", "Black n White", "Symbian", 3000);
		CellPhone moto = new CellPhone("Lenova", "moto g4 plus", "dual sim 4G", "stock android", 15_000);
		CellPhone iPhone = new CellPhone("Aplle", "iPhoneX", "Face_ID", "iOS", 90_000);
	
		School kv = new School("Kendriya Vidyalaya", "Jodhpur", "Jodhpur", 56);
		School dps = new School("Delhi Public School", "New Delhi", "Delhi", 5);
		School prisidium = new School("Prisidium", "Gurugram", "Gurugram", 3);
	
//		List<Laptop> laptopList = new ArrayList<Laptop>();
//		laptopList.add(hp);
//		laptopList.add(dell);
//		laptopList.add(lenovo);
		
		// storing names of the students of different schools in a HashSet
		Set<String> namesOfClassStudents = new LinkedHashSet<>();
		namesOfClassStudents.add(kv.getName());
		namesOfClassStudents.add(dps.getName());
		namesOfClassStudents.add(prisidium.getName());
		
		//To display the names of the students stored in hashSet
		for(String school : namesOfClassStudents) {
			System.out.println(school);
		}
		
		
	
	
	}
}
