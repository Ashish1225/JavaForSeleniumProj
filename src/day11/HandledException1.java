package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandledException1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		try {
			System.out.println("Enter number 1:");	
			int n1 = sc.nextInt();
			
			System.out.println("Enter number 2:");
			int n2 = sc.nextInt();
			int result = n1/n2;
			System.out.println("Result is: "+result);
		}
		catch (ArithmeticException e) {
			System.out.println("Hey buddy please use zero "+e.getMessage());
		}	
		catch (InputMismatchException e) {
			System.out.println("Hey buddy its calc please provide integer number "+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Something went wrong "+e.getMessage());
		}
		sc.close();

	}

}
