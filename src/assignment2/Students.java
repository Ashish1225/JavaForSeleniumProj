package assignment2;

import java.util.Scanner;

public class Students {
	String name;
	String email;
	long phone;
	String address;
	String status;
	
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.storeInformation();
		
	}
	
	public void storeInformation() {
		System.out.println("PLease enter number of students.");
		Scanner sc = new Scanner(System.in);
		int numOfStudent = sc.nextInt();
		
		Students[] stu = new Students[numOfStudent];
		
		for(int i=0;i<numOfStudent;i++) {
			stu[i] =  new Students(); 
			
			System.out.println("PLease enter name");
			stu[i].name = sc.next();
			
			System.out.println("PLease enter email");
			stu[i].email = sc.next();
			
			System.out.println("PLease enter Phone");
			stu[i].phone = sc.nextLong();
			
			System.out.println("PLease enter Address");
			stu[i].address = sc.next();
			
			System.out.println("PLease enter Status");
			stu[i].status = sc.next();		
			
		}	
		System.out.println("Please enter which student details you are looking for:");
		int studentNumber = sc.nextInt();
		
		System.out.println(stu[studentNumber].name);
		System.out.println(stu[studentNumber].email);
		System.out.println(stu[studentNumber].phone);
		System.out.println(stu[studentNumber].address);
		System.out.println(stu[studentNumber].status);
		
		sc.close();
		
	}

}
