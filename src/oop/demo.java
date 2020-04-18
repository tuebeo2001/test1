package oop;
class person{
	String name;
	String email;
	String phoneString;
	static final String code = " 1234";
	
	void walk() {
		System.out.println(name + " is walking ");
	}
	
	void have() {
		System.out.println("acc " + email);
	}
	
	void call() {
		System.out.println("this " + phoneString);
	}
}

public class demo {
	public static void main(String[] args) {
	
	 person person1 = new person();
	 person1.name = "tur";
	 person1.walk();
	 person1.have();
	 person1.call();
	
	 
	}
	
	

}
