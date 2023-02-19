package assignment3;

import java.util.ArrayList;
import java.util.List;

// Task1: Write a program which can store List of Integer values and print all the values using for loop.
public class Task1 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(12);
		nums.add(12);
		nums.add(34);
		nums.add(45);
		nums.add(77);
		
		System.out.println(nums);
		
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
	}
}
