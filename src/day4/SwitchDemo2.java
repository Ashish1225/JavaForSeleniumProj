package day4;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		String browser = "edge";
		
		switch(browser) {
		
		case "chrome":
			System.out.println("Launch Chrome browser");
			break;
			
		case "ff":
			System.out.println("Launch ff browser");
			break;
			
		case "edge":
			System.out.println("Launch edge browser");
			break;
			
		default:
			System.out.println("Please use chrome, ff or edge");
			break;
		
		}
	}
}
