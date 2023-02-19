package day6;

public class Employee2 {

	public static void main(String[] args) {
		Employee2 ashu = new Employee2();
		ashu.dev();
	}
	
	public void devOpsEngg() {
		System.out.println("I am into DevOps role..");
	}
	
	public void automationEngg() {
		System.out.println("I can automation test cases..");
	}
	
	public void dev() {
		System.out.println("I can write code..");
		automationEngg();
		devOpsEngg();
	}
}
