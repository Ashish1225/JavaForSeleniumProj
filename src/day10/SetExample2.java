package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetExample2 {

	public static void main(String[] args) {
		
		List<String> studNames = new ArrayList<>();
		studNames.add("Mangal");
		studNames.add("Praveen");
		studNames.add("Bhupendra");
		studNames.add("Sanjay");
		studNames.add("Praveen");
		studNames.add("Mangal");
		
		//M1- removing duplicate values from list and storing into a set using constructor
		HashSet<String> s1 = new HashSet<>(studNames);
		System.out.println(s1);
		
		//M2- removing duplicate values from list and storing into a set using addAll method
		
		HashSet<String> s2 = new HashSet<>();
		s2.addAll(studNames);
		s2.add("Saurabh");
		s2.add("Pankaj");
		System.out.println(s2);
		
		

	}

}
