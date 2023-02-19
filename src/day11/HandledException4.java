package day11;

public class HandledException4 {

	public static void main(String[] args) {
		
		int age = 18;
		if(age<21) {
			System.out.println("Not allowed");
			throw new ArithmeticException();
		}
		else {
			System.out.println("Welcome to the party");
		}
	}
}
