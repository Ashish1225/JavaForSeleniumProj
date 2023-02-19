package assignment1;

public class Task3 {

	public static void main(String[] args) {
		// Task 3-  Write a program to print the average of below 5 numbers.
		//10,90.78,111,8989,7876

		
		double sum =0;
		
		double[] numbers = {10,90.78,111,8989,7876};
		
		for(int i = 0;i<numbers.length;i++) {
			
			sum = sum+numbers[i];
		}
		System.out.println("average of 5 numbers is: " + sum/numbers.length);
	}

}
