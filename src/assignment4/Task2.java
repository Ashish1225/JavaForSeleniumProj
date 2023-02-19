package assignment4;

import java.util.ArrayList;
import java.util.List;

// 2-	Write a program which will accept List of String and produce another List of string of which will have only values which starts with git

public class Task2 {

	public static void main(String[] args) {

		List<String> languages = new ArrayList<>();
		languages.add("Git");
		languages.add("Github");
		languages.add("GitLab");
		languages.add("GitBash");
		languages.add("Selenium");
		languages.add("Java");
		languages.add("Maven");
		
		List<String> newlist = new ArrayList<>();
		
		for(int i = 0;i<languages.size();i++) {
			if(languages.get(i).startsWith("Git")) {
				newlist.add(languages.get(i));
			}
		}
		System.out.println(newlist);
	}

}
