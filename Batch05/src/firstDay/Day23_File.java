package firstDay;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Day23_File {

	public static void main(String[] args) throws IOException,ArithmeticException,NullPointerException   {
		// create a File Object
		File file = new File("C:\\Users\\Waqas Khan\\Desktop\\day23_file\\sample123.txt");
		// create a file writer object and pass the file obj name as an argument
		FileWriter fw = new FileWriter(file);
		//write inside the file
		
		fw.write("Hello");
		fw.close();
		
		if(file.exists()) {
			file.delete();
			System.out.println("File deleted successfully");
		} else {
			System.out.println("There is no file");
		}
		
		File folder = new File("C:\\Users\\Waqas Khan\\Desktop\\day23_file");
		File[] files = folder.listFiles();
		for(File f : files) {
			if(f.getName().endsWith(".txt")) {
				f.delete();
				System.out.println("folder is empty");
			}
		}
		
	}
}
