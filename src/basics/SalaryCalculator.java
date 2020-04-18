package basics;

import java.awt.print.Printable;

public class SalaryCalculator {
	public static void main(String[] args) {
String career;
System.out.print("program is running");
career = "AI creator";
System.out.print("My career" + career);
int hours_per_week = 40;
int weeks_per_year = 50;
double rate = 42.50;

double salary = hours_per_week * weeks_per_year * rate;
System.out.print("my salary as a "+ career + "at the rate of $ "+rate+ "per hour is $ "+ salary + "per year");

	}
}
