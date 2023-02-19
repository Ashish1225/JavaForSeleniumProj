package day3;

public class ConditionalDemo2 {

	public static void main(String[] args) {
		int age = 22;
		int marks = 80;

		if (age > 21) {
			if (marks >= 80) {
				System.out.println("You are eligible for the interview");
			} else {
				System.out.println("Sorry you are not eligible for the interview");
			}
		} else {
			System.out.println("Please apply after sometime - focus on study as of now.");
		}
	}
}
