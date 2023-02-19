package day7;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading mol = new MethodOverloading();
		mol.add();
		mol.add(1.2, 34.5);
		mol.add(45.6, 67);
		mol.add(56, 98);
	}
	
	public void add() {
		System.out.println("I am in add method..");
	}
	
	public void add(int x, int y) {
		int result = x+y;
		System.out.println(result);
	}
	
	public void add(int x, double y) {
		double result = x + y;
		System.out.println(result);
	}
	
	public void add(double x, int y) {
		double result = x + y;
		System.out.println(result);
	}
	
	public void add(double x, double y) {
		double result = x+y;
		System.out.println(result);
	}

}
