package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		
		List<String> mentors = Arrays.asList("Mukesh","Hitesh","Naveen Reddy","Saurabh sir","Durga sir");
		
		System.out.println(mentors);
		
		System.out.println(mentors.get(2));
		
		System.out.println(mentors.contains("Hitesh"));
		
		System.out.println(mentors.isEmpty());
		
		List<String> actors = new ArrayList<>();
		actors.add("Shah rukh khan");
		actors.add("Pankaj Tripathi");
		actors.add("Manoj Bajpayee");
		actors.add("Nawaz");
		actors.add("Vijay Raj");
		
		System.out.println(actors);
		System.out.println(actors.remove(0));
		System.out.println(actors);
		System.out.println(actors.contains("Vijay Raj"));
		
		List<String> moreactors = Arrays.asList("Vineet","Paritosh","Sanjay Mishra","Piyush mishra","Ali falzal");
		
		// how to add new actors in old list
		
		actors.addAll(moreactors);
		System.out.println(actors);
		

	}

}
