package day10;

import java.util.HashMap;

public class MapExample1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m1 = new HashMap<>();
		
		m1.put(1, "Ashish");
		m1.put(10, "Mangal");
		m1.put(11, "Praveen");
		m1.put(7, "Sanjay");
		m1.put(5, "Bhupendra");
		m1.put(25, "Pankaj");
		m1.put(35, "Ankit");
		m1.put(35, "ramu");
		
		System.out.println(m1);
		
		System.out.println(m1.get(5));
		
		System.out.println(m1.get(55));
		
		System.out.println(m1.keySet());
		
		System.out.println(m1.values());
		
		System.out.println(m1.containsKey(25));
		
		System.out.println(m1.containsKey(88));
		
		System.out.println(m1.containsValue("Sanjay"));
		
		System.out.println(m1.size());
		
		System.out.println(m1.remove(35));
		
		System.out.println(m1.size());
		
		System.out.println(m1);
	}
}
