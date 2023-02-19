package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
	
	// Task5: Write a program which will pick the values from Array and Store them List.

	public static void main(String[] args) {
		List<Integer> l1= new ArrayList<>();
		int [] arr = new int[5];	
		arr[0] = 12;
		arr[1] = 23;
		arr[2] = 56;
		arr[3] = 98;
		arr[4] = 98;
		
		System.out.println(arr.length);
		
		for( int i =0;i<arr.length;i++) {
			l1.add(arr[i]);			
		}	
		System.out.println(l1);	
		
	}
}
