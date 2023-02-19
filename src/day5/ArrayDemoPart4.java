package day5;

// Array using For each loop
public class ArrayDemoPart4 {

	public static void main(String[] args) {
		
		String []names = {"Ashish","Mangal","Praveen","Huma","Sukesh","Akash","Bhairu"};
		
		for(String name: names) {
			System.out.println(name);
		}
		
		Object[] values = {12,"Amit",12.34,false,'r'};
		
		for(Object value: values) {
			System.out.println(value);
		}
	}
}
