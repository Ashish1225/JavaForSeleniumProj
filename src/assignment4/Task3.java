package assignment4;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
	// 3-	Write a program that will remove duplicate values from List

	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("TestNG");
		languages.add("Maven");
		languages.add("Java");
		
		List<String> newlist = new ArrayList<>();
		
		for(int i =0;i<languages.size();i++) {
			if(!newlist.contains(languages.get(i))) {
				newlist.add(languages.get(i));
			}
		}
		System.out.println(newlist);
	}
}
