package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class write {

	public static void main(String[] args) {
		//1. Define the path that we want to write
		String filename = "C:\\Users\\Tue\\Desktop\\fileToWirte.txt";
		String textString = "i'am writing data to this file";
		
		//2. Create java file
		File file = new File(filename);
		//3. Open the file
		
		try {
			FileWriter fw = new FileWriter(file);
			
			//4. Write to the file
			fw.write(textString);
			
			//5. Close the resources
			fw.close();
			
		} catch (IOException e) {
		System.out.println("ERROR: could not read the file " + filename);	
			e.printStackTrace();
		} finally {
			System.out.println("mission completed");
		}
	
	}

}
