package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Read {
	public static void main(String[] args) {
		//1. Define the path
		String filelocation = "C:\\Users\\Tue\\Desktop\\filetoread.txt";
		String text = null; 
		
		//2. Create java file
		File file = new File(filelocation);
		
		//3. Open the file
		
		try {
			FileReader filetoread = new FileReader(file);
			BufferedReader br = new BufferedReader(filetoread);
			
			//4. Read the file
			text = br.readLine();
			
			//5. Close the resources
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: cannot found the file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not read the file");
			e.printStackTrace();
		}
		
	System.out.println(text);
}	
}