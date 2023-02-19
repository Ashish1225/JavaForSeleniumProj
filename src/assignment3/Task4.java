package assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Task4: Write a program which will print sum of all numbers which is stored in list.
public class Task4 {

	public static void main(String[] args) {
		
		int sum = 0;
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
			sum = sum+num.next();
		}
		System.out.println("Sum of all values listed in list "+ sum);
	}
}
