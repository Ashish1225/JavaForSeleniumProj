package day9;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		
		// this is another way to write list of any type.
		List<Integer> nums = Arrays.asList(3,5,6,7,8,8,4);
		System.out.println(nums.size());
		System.out.println(nums.get(0));
		
		// Remove method does not work with Arrays.asList()
		//System.out.println(nums.remove(2));  
		
		List<String> mentors = Arrays.asList("Mukesh","Naveen Reddy","Hitesh","Durga Sir");
		
		// accessing using for loop
		
		for(int i=0;i<mentors.size();i++) {
			System.out.println(mentors.get(i));
		}
		
		
		// Using for each loop
		/*
		for(String name: mentors) {
			System.out.println(name);
		}
		*/
		
		// Using iterator
		/*
		Iterator<String> name = mentors.iterator();
		while(name.hasNext()) {
			System.out.println(name.next());
		}
		*/
	}
}
