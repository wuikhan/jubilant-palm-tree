package firstDay;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day24_FileOutputStream {

	public static void main(String[] args) throws IOException {
	
		FileOutputStream fis = new FileOutputStream("C:\\Users\\Waqas Khan\\Desktop\\day23_file\\fos.txt");
		String text = "Today is monday";
		byte[] b = text.getBytes();
		
		fis.write(b);
		fis.close();
	}

}
