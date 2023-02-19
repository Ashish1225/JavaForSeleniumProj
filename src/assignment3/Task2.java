package assignment3;

import java.util.ArrayList;
import java.util.List;

// Task2: Write a program which can store List of Integer values and print all the values using forEach loop.
public class Task2 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(12);
		nums.add(12);
		nums.add(34);
		nums.add(45);
		nums.add(77);
		
		System.out.println(nums);
		
		for(Integer num:nums) {
			System.out.println(num);
		}
	}
}
