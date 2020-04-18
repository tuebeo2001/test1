package basics;

public class practice2_lab1 {

	public static void main(String[] args) {
		int [] numbers = {1,4,-5,-4, 30};
//	System.out.println(sum(4));
//	System.out.println(fact(5));
//	System.out.println("min is: " + findMin(numbers));
//	System.out.println("max is: " + findMax(numbers));
	System.out.println("Avg is: " + findAvg(numbers));
	}
	
public static int findAvg(int [] arr) {
	int tong = 0;
	for (int i = 0; i < arr.length; i++) {
		tong = tong + arr[i];
	}
	return tong / arr.length;
}
	
public static int findMin(int[] arr) {
	int min = arr[0];
	for (int i =0 ; i < arr.length; i++) {
		if (arr[i] < min) {
			min = arr[i];
		}
	}
	return min;
}

	
public static int findMax(int[] arr) {
	int max = arr[0];
	for (int i =0 ; i < arr.length; i++) {
		if (arr[i] > max) {
			max = arr[i];
		}
	}
	return max;
}	


public static int sum(int n) {
	int tong =0;
	for (int i=1; i<=n; i++ ) {
		System.out.println(tong + " + " +i);
		tong = tong +i;
	}	
	return tong;
}

public static int fact(int n) {
	if (n == 0) {
		return 1;
	}
	System.out.print(n);
	System.out.print(" ");
	return fact(n-1) *n;
}

}
