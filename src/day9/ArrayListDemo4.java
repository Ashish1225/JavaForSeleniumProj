package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		// can access the method of List + collection + iterable
		List<String> list1 = new ArrayList<>();
		
		list1.add("Java");
		list1.add("Selenium");
		list1.add("Python");
		list1.add("TestNG");
		list1.add("Cypress");
		
		System.out.println(list1);
		
		System.out.println(list1.remove(1));
		System.out.println(list1);
		System.out.println(list1.remove("TestNG"));
		System.out.println(list1);
		
	}

}
