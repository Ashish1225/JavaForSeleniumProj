package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample6 {

	public static void main(String[] args) {
		
		// TreeSet follow Order, it will not allow duplicate values
		// TreeSet sort the values in increasing order
		
		Set<Integer> s1 = new TreeSet<>();
		s1.add(12);
		s1.add(13);
		s1.add(42);
		s1.add(53);
		s1.add(33);
		s1.add(1);
		s1.add(646);
		//s1.add(null);
		s1.add(12);
		s1.add(0);
		
		System.out.println(s1);
		
		Set<String> s2 = new TreeSet<>();
		s2.add("Chahal");
		s2.add("Raghav");
		s2.add("Ameesh");
		s2.add("Shivam");
		s2.add("Kritika");
		s2.add("Bhuvam");
		s2.add("ameesh");
		
		System.out.println(s2);
		
		// converting TreeSet into List - yes 
		
		List<String> l1 = new ArrayList<>(s2);
		System.out.println(l1);
		l1.add(0, "Raman");
		System.out.println(l1);
		System.out.println(l1.get(4));		
	}
}
