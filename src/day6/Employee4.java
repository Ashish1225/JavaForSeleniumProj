package day6;

public class Employee4 {
	
	String name;
	int empId;
	String email;
	
	// constructor
	public Employee4(String EmpName, int EmpId, String EmpEmail) {
		System.out.println("Constructor called..");
		name = EmpName;
		empId = EmpId;
		email = EmpEmail;	
	}

	public static void main(String[] args) {
		
		Employee4 bhopu = new Employee4("Bhupendra",23,"bhopu@gmail.com");
		Employee4 prav = new Employee4("Praveen",28,"praveen@gmail.com");
		Employee4 san = new Employee4("Sanjay",24,"sanju@gmail.com");
		//bhopu.displayInformation();
		//prav.displayInformation();
		//san.displayInformation();
		System.out.println(bhopu.name);
		System.out.println(prav.empId);
		System.out.println(san.email);
	}
	
	public void displayInformation() {
		System.out.println("Name is :"+name);
		System.out.println("Id is :"+empId);
		System.out.println("Email is :"+email);
	}
}
