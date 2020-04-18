package oop;

public class BankAccount implements IInterest {
	// Properties of bank account 
	private static int iD = 1000;
	private String accountNumber;
	private static final String routingNumber = "12347579";
	private String name;
	private String SSN;
	private double balance;

	// Constructor 
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}

	private void setAccountNumber() {
		int random = (int) ((Math.random()) * 100);
		accountNumber = iD + "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number " + accountNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showbalance() {
		System.out.println("balance " + balance);
	}
	
	public void paybill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill " + amount);
		showbalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making Deposit " + amount);
		showbalance();
	}
	
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showbalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Acount Number: " + accountNumber + "]\n";
	}
	
	
	
}

