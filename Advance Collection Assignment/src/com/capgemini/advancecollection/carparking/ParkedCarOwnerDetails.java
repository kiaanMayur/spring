package com.capgemini.advancecollection.carparking;

public class ParkedCarOwnerDetails {
	
	private String ownerName;
	private String carmodel;
	private String carNo;
	private long mobile;
	private String ownerAddress;
	
	public ParkedCarOwnerDetails(String ownerName, String carmodel, String carNo, long mobile, String ownerAddress) {
		super();
		this.ownerName = ownerName;
		this.carmodel = carmodel;
		this.carNo = carNo;
		this.mobile = mobile;
		this.ownerAddress = ownerAddress;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	@Override
	public String toString() {
		return "ParkedCarOwnerDetails [ownerName=" + ownerName + ", carmodel=" + carmodel + ", carNo=" + carNo
				+ ", mobile=" + mobile + ", ownerAddress=" + ownerAddress + "]";
	}
	
	

}
