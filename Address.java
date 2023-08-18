package com.example.demo.model;

public class Address {
	private String name;
	private int doorno;
	private String streetname;
	private int pincode;
	private String area;
	private String district;
	private String state;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String name, int doorno, String streetname, int pincode, String area, String district, String state,
			String country) {
		super();
		this.name = name;
		this.doorno = doorno;
		this.streetname = streetname;
		this.pincode = pincode;
		this.area = area;
		this.district = district;
		this.state = state;
		this.country = country;
	}
	
	
	
	}
	


