package exception_and_files;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		double payment = 0;
		boolean positivePymt = true;
		Scanner in = new Scanner(System.in);
		
		do {
		System.out.print("your payment, please ");
		payment = in.nextDouble();
		try {
			if (payment < 0) {
				throw new Negative(payment);
			}
			else {
				positivePymt = true;
			}
		}catch (Negative e) {
			System.out.println(e.toString());
			System.out.println("Please try again...");
			
		}
	}while(!positivePymt);
		System.out.println("Done, thank you for your payment of $" + payment);
}
}