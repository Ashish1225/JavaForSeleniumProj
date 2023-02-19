package day9;

public class Employee {
	
	int empId;
	String name;
	String email;
	
	public String toString() {
		return empId +" "+name+" "+email;
	}
	
	public Employee(int eid, String empName, String empEmail) {
		empId = eid;
		name= empName;
		email = empEmail;
	}
}
