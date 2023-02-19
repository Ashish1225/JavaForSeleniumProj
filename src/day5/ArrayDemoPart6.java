package day5;

// 2D Array with Object array
public class ArrayDemoPart6 {

	public static void main(String[] args) {
		
		Object[][] names = {
				            {"Raman",13,12},
				            {true,12.45,'u'}			
		                   };
		
		System.out.println(names[1][2]);
		System.out.println(names.length);// always return the no. of rows
		
		// find he number of columns
		
		System.out.println(names[1].length);
		
		

	}

}
