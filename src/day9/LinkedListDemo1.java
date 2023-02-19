package day9;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		// List interface allow duplicate

		LinkedList<String> name = new LinkedList<>();
		name.add("Ashish");
		name.add("Bhopu");
		name.add("Bhopu");
		name.add("Praveen");
		name.add("Sanjay");
		
		System.out.println(name);
		
		name.addFirst("Mangu");
		name.addLast("Ankit");
		
		System.out.println(name);
		
		System.out.println(name.removeLast());
		System.out.println(name);
		

	}

}
