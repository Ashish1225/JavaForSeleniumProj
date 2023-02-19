package day6;

public class Calc {

	public static void main(String[] args) {
		
		Calc obj1 = new Calc();
		obj1.sum(12, 23);
		obj1.sub(54, 22);
		obj1.div(12, 7);
		obj1.mult(34, 2);
	}
	
	public void sum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("Sum is: "+result);
		
	}
	public void sub(int n1, int n2) {
		int result = n1 - n2;
		System.out.println("Sub is: "+result);
	}
	
	public void mult(int n1, int n2) {
		int result = n1 * n2;
		System.out.println("Mult is: "+result);
	}
	
	public void div(int n1, int n2) {
		int result = n1 / n2;
		System.out.println("Division is: "+result);
	}
}
