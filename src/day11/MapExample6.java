package day11;

import java.util.HashMap;
import java.util.Map;

public class MapExample6 {

	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(23, "Ashu");
		m1.put(3, "Sanjay");
		m1.put(1, "Praveen");
		m1.put(11, "Bhopu");
		m1.put(54, "Mangal");
		
		System.out.println(m1);
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		
		System.out.println(m1.containsKey(1));
		
		
	}

}
