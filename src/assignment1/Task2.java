package assignment1;

public class Task2 {

	public static void main(String[] args) {
		// Task 2-  Write a program to print the sum of below 5 numbers.
		//10,90.78,111,8989,7876
		
		double sum =0;
		
		double[] numbers = {10,90.78,111,8989,7876};
		
		for(int i = 0;i<numbers.length;i++) {
			
			sum = sum+numbers[i];
		}
		System.out.println(sum);
	}

}
