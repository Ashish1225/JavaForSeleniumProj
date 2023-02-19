package day9;

import java.util.ArrayList;

public class ArrayListDemo3 {
	

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10,"Ashish","ashu24@gmail.com");
		
		Employee emp2 = new Employee(12,"Mangal","mangu@gmail.com");
		
		Employee emp3 = new Employee(10,"Bhupendra","bhopu@gmail.com");
		
		ArrayList<Employee> list1 = new ArrayList<>();
		
		list1.add(emp1);
		list1.add(emp2);
		list1.add(emp3);
		
		System.out.println(emp1);
		
		System.out.println(list1);
		
		System.out.println(emp1.email);
			
		System.out.println(list1.get(0).email);

	}
}
