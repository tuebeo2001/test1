package datastructures;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// LinkedHashSet - in order that they were entered
		// HashSet - complete random order
		// TreeSet - abc order
		
		//1. Define the collection
		Set<String> animalSet = new HashSet<String>();
		animalSet.add("dog");
		animalSet.add("pig");
		animalSet.add("hog");
		animalSet.add("cat");
		animalSet.add("snake");

		System.out.println(animalSet.size() +" " + animalSet);
		
		animalSet.add("cat");
		animalSet.add("snake");
		animalSet.add("goose");
		System.out.println(animalSet.size() +" " + animalSet);
		
		//Create a new set that we use for comparison
		Set<String> farmSet = new HashSet<String>();
		farmSet.add("chicken");
		farmSet.add("cow");
		farmSet.add("dog");
		farmSet.add("pig");
		farmSet.add("horse");
		
		// What is the INTERSECTION (onyly in animals and farm) AND
		// Copy existing set into a new set
		Set<String> new1 = new HashSet<String>(animalSet);
		new1.retainAll(farmSet);
		System.out.println(new1);
		
		// What is the UNION (are both animals and farm) OR
		Set<String> new2 = new HashSet<String>(animalSet);
		new2.addAll(farmSet);
		System.out.println(new2);
		
		
		// What is the DIFFERENCE (in 1 and NOT other)
		Set<String> new3 = new HashSet<String>(animalSet);
		new3.removeAll(farmSet);
		System.out.println(new3);
		
	}

}
