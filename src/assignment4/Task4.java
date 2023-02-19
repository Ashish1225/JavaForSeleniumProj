package assignment4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
	
	// 4-	Create a list of values and print the second element, second last element.

	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(45);
		num.add(90);
		num.add(45);
		num.add(23);
		num.add(90);
		num.add(44);
		
		
		for(int i =0;i<num.size();i++) {
			if(i==1 || i == num.size()-2) {
				System.out.println(num.get(i));
			}
		}
	}
}
