package doesFileExist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DoesFileExist {

	public static void main(String[] args) throws IOException  {
		
		doesFileExist(null);

	}

	public static void doesFileExist(String path) throws IOException {
		String path1 = "src\\data\\textFile";

		File f = new File(path1);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			
			
		}

	}

}
