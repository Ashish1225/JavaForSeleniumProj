package day6;

public class Employee {

	public static void main(String[] args) {
		Employee ashu = new Employee();
		ashu.automationEngg();
		ashu.dev();
		ashu.devOpsEngg();
	}
	
	public void devOpsEngg() {
		System.out.println("I am into DevOps role..");
	}
	
	public void automationEngg() {
		System.out.println("I can automation test cases..");
	}
	
	public void dev() {
		System.out.println("I can write code..");
	}

}
