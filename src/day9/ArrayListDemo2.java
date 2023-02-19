package day9;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<String> jsautomationtools = new ArrayList<>();
		jsautomationtools.add("Cypress");
		jsautomationtools.add("Playwright");
		jsautomationtools.add("WebDriver IO");
		
		System.out.println(jsautomationtools);
		
		ArrayList<String> automationtools = new ArrayList<>(jsautomationtools);
		automationtools.add("Selenium");
		automationtools.add("Katalon");
		automationtools.add("Jenkins");
		automationtools.add("Docker");
		automationtools.add("Java");
		
		
		System.out.println(automationtools);
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.addAll(automationtools);
		System.out.println(l1);
		
	}

}
