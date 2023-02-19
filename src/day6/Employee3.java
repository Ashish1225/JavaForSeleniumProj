package day6;

public class Employee3 {
	
	String name;
	int empId;

	public static void main(String[] args) {
		
		Employee3 sam = new Employee3();
		sam.empId=89;
		sam.name="sanjay";
		sam.displayInformation();
		
	}
	
	public void displayInformation() {
		System.out.println("Name is :"+name);
		System.out.println("Id is :"+empId);
	}
}
