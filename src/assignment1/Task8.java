package assignment1;

public class Task8 {

	public static void main(String[] args) {
		// Task 8- Write a program to print below students marks who have scored above 80
		//Example- 78,12,89,55,35
		
		int[] arr = {78,12,89,55,35};
		
		for(int marks:arr) {
			if(marks>70) {
				System.out.println(marks);
			}
		}
	}
}
