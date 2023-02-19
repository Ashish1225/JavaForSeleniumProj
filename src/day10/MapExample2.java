package day10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapExample2 {

	public static void main(String[] args) {
		
		HashMap<Integer, List<String>> m1 = new HashMap<>();
		
		List<String> l1 = Arrays.asList("Java","Selenium","Maven");
		List<String> l2 = Arrays.asList("Cypress","Playwright","JavaScript");
		
		m1.put(1, l1);
		m1.put(10, l2);
		
		System.out.println(m1);
		
		System.out.println(m1.get(10).get(0));
	}
}
