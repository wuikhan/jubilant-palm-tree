package firstDay;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day23_FileReader {

	public static void main(String[] args) {
		// create an object of the file class
		File file = new File("C:\\Users\\Waqas Khan\\Desktop\\day23_file\\file.txt");
		// create an object of the File Reader class
		try {
			FileReader fr = new FileReader(file);
		//System.out.println(fr.read());
			int a = 0;
			while((a = fr.read()) != -1 ) {
				System.out.print((char)a);
				a++;
			}
		fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
