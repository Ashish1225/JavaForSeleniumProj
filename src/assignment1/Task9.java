package assignment1;

public class Task9 {

	public static void main(String[] args) {
		// Task 9- Write a program which will break the current execution if it find number 85
		// Input – [12,34,66,85,900]

		
		int[] arr = {12,34,66,85,900};
		
		for(int num :arr) {
			if(num == 85) {
				break;
			}
			else {
				System.out.println(num);
			}
		}
	}
}
