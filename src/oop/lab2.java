package oop;

import java.util.Random;

public class lab2 {
	public static void main(String[] args) {
		

	Student hs1 = new Student("Tue", "150066");
}
}

class Student {
	private String name;
	private String ssn;
	private static int ID = 1000;
	private String email;
	private String user_ID; 
	private int phone_number;
	private String city;
	private String state;
	
	public Student(String name, String ssn) {
	this.name = name;
	this.ssn = ssn;
	getemail();
	ID++;
	getID();
	
	}
	
	private void getemail() {
		email = name.toLowerCase() + "@gmail.com";
		System.out.println(email);
	}
	
	public void getID() {
		int random = (int) (Math.random() * 10000);
		user_ID = ID + "" + random + ssn.substring(2);
		System.out.println("student ID: "+user_ID);
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}






}













