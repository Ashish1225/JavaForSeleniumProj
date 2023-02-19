package day5;

public class StringDemo4 {

	public static void main(String[] args) {
		String name1 = "Java";
		
		String name2 = "Java";
		
		System.out.println(name1==name2); // true - in SCP it will create only one object
		
		String n1 = new String("Ashish");
		n1=n1.concat("Sahu");
		System.out.println(n1);
		String n2 = new String("Ashish");
		
		System.out.println(n1==n2); // false - in Heap it will create two objects
		

	}

}
