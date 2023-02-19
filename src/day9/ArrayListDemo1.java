package day9;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Selenium");
		list1.add("Java");
		list1.add("TestNG");
		list1.add("Cucumber");
		list1.add("Extent Reports");
		
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(34);
		list2.add(66);
		list2.add(66);
		list2.add(69);
		
		System.out.println(list2);
		
		ArrayList<Double> marks = new ArrayList<>();
		marks.add(34.0);
		marks.add(34.54);
		marks.add(0.34);
		
		System.out.println(marks);

	}

}
