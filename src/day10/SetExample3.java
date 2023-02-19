package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetExample3 {

	public static void main(String[] args) {
		
		// How to access all values from Set in index manner
	
		HashSet<String> s2 = new HashSet<>();
	
		s2.add("Saurabh");
		s2.add("Pankaj");
		s2.add("Ritika");
		s2.add("Kritika");
		s2.add("Rudhra");
		System.out.println(s2);
		
		//List<String> l1 = new ArrayList<>(s2);
		
		List<String> l1 = new ArrayList<>();
		l1.addAll(s2);
		
		for(int i = 0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
		

	}

}
