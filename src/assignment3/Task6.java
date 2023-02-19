package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task6 {

	// Task6: Write a program which will display true if list contains Mobile else prints false
	//List  - Web Automation, API Automation, Mobile Automation.

	public static void main(String[] args) {
		
		boolean flag = false;
		
		List<String> courses = new ArrayList<>();
		courses.add("Web Automation");
		courses.add("API Automation");
		courses.add("Mobile Automation");
		
		System.out.println(courses);
		
		for(int i=0;i<courses.size();i++) {
			if(courses.get(i).contains("Mobile")) {
				flag = true;
			}
			else {
				flag = false;
			}
		}
		if(flag==true) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
