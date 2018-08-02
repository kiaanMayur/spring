package com.capgemini.collectionclass;

public class Laptop {
	
	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
	
	// argument c'tor
	public Laptop(String model, String company, String operatingSystem, String processor) {
		super();
		this.model = model;
		this.company = company;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}
	
}
