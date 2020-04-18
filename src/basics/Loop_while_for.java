package basics;

public class Loop_while_for {

	public static void main(String[] args) {
		String[] states = new String[4];
		states[0] = "long bien";
		states[1] = "ba dinh";
		states[2] = "cau giay";
		states[3] = "hai ba trung";
	int  i = 0;

	// Do loop: enters the loop Then tests condition
	do {
		System.out.println("loop " + states[i]);
		i = i + 1;
		
	} while (i < 4);
			

	// While loop: tests condition first then enters loop 
	int n =0;
//	while (n<=3) {
//		System.out.println("while " + states[n]);
//		n++;	
//	}
	boolean stateFound = false;
	while (!stateFound) {
		String state = states[n];
		System.out.println(state);
		if (state == "cau giay") {
			System.out.println("got it");	
			stateFound = true;
		}
		n++;
	
	}
	System.out.println("");
	
	for (int x =0; x<4; x++) {
		System.out.println("for "+states[x]);
	}
	}
	

}
