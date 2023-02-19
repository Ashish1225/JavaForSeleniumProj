package day7;

public class LoanCalc extends Calc{
	
	public LoanCalc() {
		System.out.println("Child class constructor..");
	}

	public static void main(String[] args) {
		
		LoanCalc lc = new LoanCalc();
		lc.calcCarLoan();
		lc.calcHomeLoan();
		lc.div();
		lc.sub();
		lc.sum();
		
		System.out.println("**********************************");
		// create object of child class and reference of parent class.
		Calc l2 = new LoanCalc();
		l2.sub();
		l2.sum();
		l2.div();
		
		System.out.println("**********************************");
		
		Calc l3 = new Calc();
		l3.div();
		l3.sub();
		l3.sum();
		
		System.out.println("**********************************");
		
		//LoanCalc = l4 = new Calc();  this is not possible.
			
	}
	
	public void calcHomeLoan() {
		System.out.println(" I am inside HomeLoan");
	}
	
	public void calcCarLoan() {
		System.out.println(" I am inside Car Loan");
	}

}
