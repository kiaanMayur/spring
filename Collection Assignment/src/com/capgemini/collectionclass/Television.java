package com.capgemini.collectionclass;

public class Television {
	
	private String company;
	private String type;
	private boolean threeDEnabled;
	private int price;
	
	// arguments c'tor
	public Television(String company, String type, boolean threeDEnabled, int price) {
		super();
		this.company = company;
		this.type = type;
		this.threeDEnabled = threeDEnabled;
		this.price = price;
	}
	
}
