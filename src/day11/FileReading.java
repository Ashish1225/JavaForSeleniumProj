package day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) {
		
		File file = new File("./properties/Config.properties");
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getName());
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			Properties prop = new Properties();
			prop.load(fis);
			System.out.println(prop.get("url"));
		} catch (FileNotFoundException e) {
			System.out.println("File is missing: "+e.getMessage());
		} catch (IOException e) {
			System.out.println("File operation is not supported :"+e.getMessage());
		}
	}
}
