package day7;

import java.util.Scanner;

import testPack.EmiCalc;

public class ScannerClassDemo {

	public static void main(String[] args) {
		
//		EmiCalc emi = new EmiCalc();
//		emi.calcCarEMI();
//		emi.calcHomeEMI();
//		emi.calcPersonalLoanEMI();
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Please enter number 1");
//		int n1 = sc.nextInt();
//		
//		System.out.println("Please enter number 2");
//		int n2 = sc.nextInt();
//		
//		System.out.println("Please enter number 3");
//		int n3 = sc.nextInt();
//		
//		int result = n1+n2+n3;
//		
//		System.out.println("Result is :"+result);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		
		System.out.println("Enter your second name:");
		String name2 = sc.nextLine();
		System.out.println(name2);
		
		System.out.println("Enter your first name:");
		String name1 = sc.nextLine();
		System.out.println(name1);
		
		sc.close();

	}

}
