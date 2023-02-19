package day10;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetExample5 {

	public static void main(String[] args) {
		
		// LinkedHashSet follow Order, it will not allow duplicate values
		
		Set<Integer> s1 = new LinkedHashSet<>();
		s1.add(12);
		s1.add(13);
		s1.add(42);
		s1.add(53);
		s1.add(33);
		s1.add(1);
		s1.add(646);
		s1.add(null);
		s1.add(null);
		s1.add(12);
		
		System.out.println(s1);
		
		// Converting LinkedHashSet into List - yes
		
		List<Integer> l1 = new ArrayList<>(s1);
		System.out.println(l1);
		l1.add(87);
		System.out.println(l1);
		System.out.println(l1.get(4));
	}

}
