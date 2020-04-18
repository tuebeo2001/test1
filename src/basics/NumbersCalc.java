package basics;

public class NumbersCalc {
public static void main(String[] args) {
	printName();
	addnumber(10, 5);
	System.out.println(multiplynumber(3,4)); 
//	It is the number
}
public static void printName() {
	System.out.println("My name is Tue");
}
public static void addnumber(int number1, int number2 ) {
	int sum = number1 + number2;
	System.out.println(sum = number1+number2);
	
}
public static int multiplynumber(int so1, int so2 ) {
	int tich = so1 * so2;
//	addnumber(tich, tich);
	return tich;
}
}
