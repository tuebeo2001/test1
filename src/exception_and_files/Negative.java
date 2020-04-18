package exception_and_files;


public class Negative extends Exception {
	double payment;
	
	public Negative(double payment) {
		this.payment = payment;
	}
	public String toString() {
		return "ERROR: Cannot take negative payment" + payment;
	}
		
}
