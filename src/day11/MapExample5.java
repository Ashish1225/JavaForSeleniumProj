package day11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample5 {

	public static void main(String[] args) {
		
		// LinkedHashMap follow insertion order with 1 null as a key
		
		Map<Integer, String> m1 = new LinkedHashMap<>();
		m1.put(23, "Ashu");
		m1.put(3, "Sanjay");
		m1.put(1, "Praveen");
		m1.put(11, "Bhopu");
		m1.put(54, "Mangal");
		m1.put(null, "Mangal");
		m1.put(87, null);
		
		System.out.println(m1);
		System.out.println(m1.get(1));
		
		Map<Integer, String> m2 = new TreeMap<>();
		m2.put(23, "Ashu");
		m2.put(3, "Sanjay");
		m2.put(1, "Praveen");
		m2.put(11, "Bhopu");
		m2.put(54, "Mangal");
		//m2.put(null, "Mangal");
		m2.put(87, null);
		
		System.out.println(m2);
		
	}

}
