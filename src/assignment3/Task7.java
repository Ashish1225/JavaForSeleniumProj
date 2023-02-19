package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {

	public static void main(String[] args) {
		
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(33);
		nums.add(44);
		nums.add(55);
		nums.add(66);
		nums.add(77);
		nums.add(88);
		
		System.out.println(nums);
		
		// Removing value from 2nd index using index
		nums.remove(2);
		
		// Removing value from 2nd index using Value
		
		nums.remove(Integer.valueOf(66));
		
		System.out.println(nums);
		
		// Adding 90 at 3rd index 
		nums.add(3, 90);
		
		System.out.println("Length of the list: "+nums.size());
		
		// printing all the values
		System.out.println(nums);
		
		// convert list into an array
		int arr[] = new int[nums.size()];
		
		for(int i =0;i<nums.size();i++) {
			
			arr[i] = nums.get(i);
			System.out.println(arr[i]);	
		}
	}
}
