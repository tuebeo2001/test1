package basics;

import java.awt.print.Printable;

public class Weather {
public static void main(String[] args) {
	
	int temparature = 55;
	String sunCondition = "Sunny";

	if (temparature > 80) {
	System.out.print("it's pleasant, wear short and t-shirt");
}

	else if ((temparature > 60) && (sunCondition == "Sunny")) {
	System.out.print("it's a little cool, perhaps wear a long-sleeve shirt and jeans");
	
}

	else if ((temparature > 50) || ( sunCondition == "Overcast")) {
	System.out.print("This is a cool day, make sure to wear warmer clothes");
	
}

	else {
	System.out.print("Looks like a cold day, bring a sweater");
}
	System.out.print("Program is ending");
}
}
