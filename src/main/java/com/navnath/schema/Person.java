package com.navnath.schema;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String fName;
	private String lName;
	private int age;
	private int SSN;
	
	private List<PostalAddress> address = new ArrayList<PostalAddress>();
	private List<Contact> contact = new ArrayList<Contact>();
	private List<Identification> identification = new ArrayList<Identification>();
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}
	public List<PostalAddress> getAddress() {
		return address;
	}
	public void setAddress(List<PostalAddress> address) {
		this.address = address;
	}
	public List<Contact> getContact() {
		return contact;
	}
	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	public List<Identification> getIdentification() {
		return identification;
	}
	public void setIdentification(List<Identification> identification) {
		this.identification = identification;
	}
	
	
	
	
	
}
