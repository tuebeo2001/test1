package datastructures;

import java.util.ArrayList;

public class Lists {
	public static void main(String[] args) {
		//1. Create a collection
		ArrayList<String> cities = new ArrayList<String>();
		//2. Add some elements
		cities.add("hanoi");
		cities.add("haiphong");
		cities.add("saigon");
		cities.add("saigon");
	
	System.out.println(cities);
	for(String city : cities) {
		System.out.println(city + ", ");

	}
	//3. get the size
	int soluong = cities.size();
	System.out.println("size " + soluong);
	
	//4. Retrieve specific element
	System.out.println(cities.get(2));
	
	//5. Remove element
	cities.remove(3);
	soluong = cities.size();
	System.out.println("size " + soluong);
	}
	
}
