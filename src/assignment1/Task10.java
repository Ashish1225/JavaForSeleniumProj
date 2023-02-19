package assignment1;

public class Task10 {

	public static void main(String[] args) {
		//Task 10- Write a program which will break the current execution if it find “Selenium”
		//Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]
		
		String [] languages = {"Java","JavaScript","Selenium","Python","Mukesh"};
		
		for(String lang: languages) {
			
			if(lang.equals("Selenium")) {
				break;
			}
			else {
				System.out.println(lang);
			}
		}
	}
}
