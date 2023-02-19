package day5;

public class StringDemo5 {

	public static void main(String[] args) {
		String msg = "The Price is 100 USD";
		
		// - i want to fetch 100 from this string and convert into integer
		//1- split this string by space
		
		String [] arr = msg.split(" ");
		System.out.println(arr[3]);
		
		// converting string into int
		int price = Integer.parseInt(arr[3]);
		
		if(price == 100) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		

	}

}
