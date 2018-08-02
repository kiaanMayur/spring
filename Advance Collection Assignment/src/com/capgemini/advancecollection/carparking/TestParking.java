package com.capgemini.advancecollection.carparking;

public class TestParking {

	public static void main(String[] args) {
		
		ParkedCarOwnerList list = new ParkedCarOwnerList();
		
		ParkedCarOwnerDetails car = new ParkedCarOwnerDetails("Mayur", "520d", "DL3C3121", 7289865, "NDLS");
		ParkedCarOwnerDetails cheapCar = new ParkedCarOwnerDetails("Mayur", "520d", "DL3C3121", 7289865, "NDLS");
		ParkedCarOwnerDetails normalCar = new ParkedCarOwnerDetails("Mayur", "520d", "DL3C3121", 7289865, "NDLS");
		ParkedCarOwnerDetails oldCar = new ParkedCarOwnerDetails("name", "320d", "MH03C3121", 79865, "SRE");

		int myToken = list.addNewCar(car);
		int yourToken = list.addNewCar(oldCar);
		
		list.getParkedCarLocation(myToken);
	}

}
