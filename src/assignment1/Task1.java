package assignment1;

public class Task1 {

	public static void main(String[] args) {
		// Task 1 – Write a program to swap two number. For example a=10 and b=20 output should be a=20 and b=10
		
		int a = 10 ; 
		int b = 20;
		int c;
		System.out.println("before swap a is = "+ a+" and b is = " +b);
		c = a;
		a = b;
		b = c;
		System.out.println("after swap a is = "+ a+" and b is = " +b);
	}
}
