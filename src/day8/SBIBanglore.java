package day8;

public class SBIBanglore implements SBI{

	public static void main(String[] args) {
		
		RBI rbi = new SBIBanglore();
		rbi.deposit();
		rbi.withdraw();
		
		
		System.out.println("**********************");
		
		SBI sbi = new SBIBanglore();
		sbi.deposit();
		sbi.withdraw();
		sbi.loan();
		
		System.out.println("********************");
		
		SBIBanglore sbib = new SBIBanglore();
		sbib.deposit();
		sbib.withdraw();
		sbib.loan();
		sbib.goldLoan();
		
	}
	
	public void loan() {
		System.out.println("SBI Banglore provides loan");
	}
	
	public void deposit() {
		System.out.println("SBI also have facility of deposit");
	}
	
	public void withdraw() {
		System.out.println("SBI also have facility of withdraw");
	}
	
	public void goldLoan() {
		System.out.println("SBI also have facility of gold Loan");
	}

}
