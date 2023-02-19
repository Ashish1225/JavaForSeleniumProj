package day10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample3 {

	public static void main(String[] args) {
		
		Map<String, Object> s1 = new HashMap<>();
		s1.put("name", "Ashish");
		s1.put("status", true);
		s1.put("marks", 56.98);
		
		Map<String, Object> s2 = new HashMap<>();
		s2.put("name", "Sanjay");
		s2.put("status", false);
		s2.put("marks", 60.98);
		
		Map<String, Object> s3 = new HashMap<>();
		s3.put("name", "Bhupendra");
		s3.put("status", true);
		s3.put("marks", 70);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// Create map which can accept key as integer and value as map
		
		Map<Integer, Map<String, Object>> myMap = new HashMap<>();
		myMap.put(1, s1);
		myMap.put(2, s2);
		myMap.put(3, s3);
		
		System.out.println(myMap);
		
		
		
		System.out.println(myMap.get(2).get("name"));
		System.out.println(myMap.get(2).get("status"));
	}
}
