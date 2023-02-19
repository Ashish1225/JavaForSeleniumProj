package day8;

import java.util.ArrayList;

public class CollectionDemo1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(12);
		al.add(12.33);
		al.add("Ashish");
		al.add('s');
		al.add(false);
		System.out.println(al);
		System.out.println(al.remove(0));
		System.out.println(al);
		System.out.println(al.get(3));
		
		ArrayList l2 = new ArrayList();
		l2.add("Selenium");
		l2.add("Java");
		l2.add("TensNG");
		
		al.addAll(l2);
		System.out.println(al);
		
		l2.add(2, 88);
		
		System.out.println(l2);
		
		// check if the element is present
		System.out.println(l2.contains("Java"));
		
		// clear all elements
		
		al.clear();
		System.out.println(al);
		

	}

}
