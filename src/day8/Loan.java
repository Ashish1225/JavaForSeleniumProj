package day8;

public class Loan extends LoanCalc{

	public static void main(String[] args) {
		Loan l1 = new Loan();
		l1.add();
		l1.sub();
		l1.mult();
		l1.div();
		l1.show();
		l1.display();
		
		System.out.println("*************");
		
		LoanCalc lc = new Loan();
		lc.add();
		lc.sub();
		lc.mult();
		lc.div();
		lc.show();
		
		System.out.println("******************");
		
		Calc cl = new Loan();
		cl.add();
		cl.sub();
		cl.mult();
		cl.div();
	}

	@Override
	public void mult() {
		System.out.println("User can multiply");
		
	}

	@Override
	public void add() {
		System.out.println("User can addition");
		
	}
	
	public void display() {
		System.out.println("Loan class display method");
	
	}
}
