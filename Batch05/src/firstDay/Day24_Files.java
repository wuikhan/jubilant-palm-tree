package firstDay;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Day24_Files {

	public static void main(String[] args) throws IOException {
	
		File file = new File("C:\\Users\\Waqas Khan\\Desktop\\day23_file\\sample123.txt");
		FileWriter fw = new FileWriter(file);
		fw.write("Hello");
		fw.close();
		
		File newfile = new File("C:\\Users\\Waqas Khan\\Desktop\\day23_file\\sample123-new.txt");
		
		if(file.renameTo(newfile)) {
			System.out.println("file rename successfull");
		} else {
			System.out.println("File does not exist");
		}
	}

}
