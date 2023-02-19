package day8;

public abstract class LoanCalc implements Calc{

	public static void main(String[] args) {
		
		// Can not create object of abstract class
		//LoanCalc lc = new LoanCalc();	
	}

	public void sub() {
		System.out.println("User can subtraction");
	}
	
	// abstract class
	public abstract void mult();

	public void div() {
		System.out.println("User can Division");	
	}
	
	public void show() {
		System.out.println("Loac Calc show method");
	}

}
