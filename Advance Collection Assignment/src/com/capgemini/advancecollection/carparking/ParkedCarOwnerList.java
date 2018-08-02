package com.capgemini.advancecollection.carparking;

import java.util.*;
import java.util.function.*;

public class ParkedCarOwnerList {
	
	int floor = 0;
	int section = 0;
	int token = 0;
	int ownerToken = 0;
	
	List<ParkedCarOwnerDetails> owner = new LinkedList<>();
	
	public int addNewCar(ParkedCarOwnerDetails newCar) {
		
		if(floor < 3) {
			if(section < 4) {
				if(token < 20) {
					owner.add(newCar);
					System.out.println("car Added.");
					token++;
					ownerToken++;
					return token;
				}
				else {
					owner.add(newCar);
					System.out.println("car Added.");
					section++;
					token = 0;
					ownerToken++;
					return token;
				}
			}
			else {
				owner.add(newCar);
				System.out.println("car Added.");
				token++;
				section = 0;
				floor++;
				ownerToken++;
				return token;
			}
		}
		else
			return -1;
	}
	
	
	public void removeCar(ParkedCarOwnerDetails car) {
		owner.remove(car);
		
		if(token == 1) {
			token = 0;
			if(section == 1) {
				section = 0;
				floor--;
				ownerToken--;
			}
			else
				{
				section--;
				ownerToken--;
				}
		}
			
		else
		{
			token--;
			ownerToken--;
		}
			
	
		System.out.println("Car removed.");
	}
	
	public void getParkedCarLocation(int token) {
		
		if(token == ownerToken) {
			Consumer<ParkedCarOwnerDetails> disp = System.out :: println;
			owner.stream().forEach(disp);
		}
	}

}
