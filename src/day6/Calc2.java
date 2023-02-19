package day6;

public class Calc2 {

	public static void main(String[] args) {
		
		Calc2 obj1 = new Calc2();
		int summation  = obj1.sum(12, 23);
		System.out.println("Sum is :"+summation);
		int subtractin = obj1.sub(54, 22);
		System.out.println("Sub is :"+subtractin);
		int division = obj1.div(12, 7);
		System.out.println("Division is :"+division);
		int multiply = obj1.mult(34, 2);
		System.out.println("Multiply is :"+multiply);
	}
	
	public int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
		
		
	}
	public int sub(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public int mult(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public int div(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
}
