package day3;

public class ConditionalDemo3 {

	public static void main(String[] args) {
		
		int marks = 80;
		if(marks>=90) {
			System.out.println("A++ grade");
		}
		else if(marks<90 && marks >=80) {
			System.out.println("A grade");
		}
		else if(marks < 80 && marks >=60) {
			System.out.println("B grade");
		}
		else if(marks<60 && marks >=35) {
			System.out.println("C grade");
		}
		else if(marks<35) {
			System.out.println("Fail");
		}
	}
}
