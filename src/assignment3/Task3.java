package assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Task3: Write a program which can store List of Integer values and print all the values using iterator.
public class Task3 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(12);
		nums.add(12);
		nums.add(34);
		nums.add(45);
		nums.add(77);
		nums.add(70);
		
		System.out.println(nums);
		
		Iterator<Integer> num = nums.iterator();
		
		while(num.hasNext()) {
			System.out.println(num.next());
		}
	}
}
