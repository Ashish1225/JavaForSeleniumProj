package day7;

public class Child extends Parent{
	
	public void show() {
		System.out.println("Child show method");
	}

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.show(); // child show method
		
		Parent c2 = new Child();
		c2.show(); // Child show method
		
		
		Parent c3 = new Parent();
		c3.show(); //Parent show method
		c3.display();
		
		
		

	}

}
