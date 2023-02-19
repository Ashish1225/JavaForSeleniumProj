package assignment4;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		// 1-	Create a list of String and print the values in reverse order
		// Input – Java, Selenium, TestNG, Git, Github
		
		List<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Selenium");
		languages.add("TestNG");
		languages.add("Git");
		languages.add("Github");
		
		System.out.println("Before reverse :"+languages);
		
		for(int i=languages.size()-1;i>=0;i--) {
			System.out.println(languages.get(i));
		}			
	}
}
