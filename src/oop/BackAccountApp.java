package oop;

public class BackAccountApp {
public static void main(String[] args) {
	BankAccount acc1 = new BankAccount("12334", 10002);
//	BankAccount acc2 = new BankAccount("12456", 45667);
	
	acc1.setName("tue10");
	System.out.println(acc1.getName());
	acc1.makeDeposit(10000);
	acc1.paybill(1234);
	acc1.accrue();
	
	System.out.println(acc1.toString());
	
}
}
