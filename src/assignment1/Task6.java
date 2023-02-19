package assignment1;

public class Task6 {

	public static void main(String[] args) {
		// Task 6- Write a program to print all prime numbers from 1-10- 2,3,5,7
		int num = 1000;
		int temp = 0;
		for(int i = 1; i<=num;i++) {	
			if(i == 1) {
				temp = temp+ 1;
			}
			for(int j = 2;j<i;j++) {
				if(i%j==0) {
					temp = temp + 1;
				}
			}
			if(temp == 0) {
				System.out.println(i);
			}
			else {
				temp = 0;
			}		
		}	
	}
}
