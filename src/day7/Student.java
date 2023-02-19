package day7;

// example for constructor overloading
public class Student {
	
	// constructor overloading
	public Student() {
		System.out.println("I am in default constructor");
	}
	
	public Student(String name, int id, long phone) {
		System.out.println("Details are: "+name +" "+id +" "+phone);
	}
	
	public Student(String name, int id) {
		System.out.println("Details are: "+name +" "+id);
	}
	
	public Student(int id, String name) {
		System.out.println("Details are: "+name +" "+id);
	}

	public static void main(String[] args) {
		
		// Scanner class is example of constructor overloading
		Student s = new Student();

	}

}
