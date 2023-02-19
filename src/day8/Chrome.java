package day8;

public class Chrome implements WebDriver{

	public static void main(String[] args) {
		
		Chrome obj1 = new Chrome();
		obj1.startBrowser();
		obj1.startApplication();
		obj1.savePassword();
		obj1.printPDF();
		obj1.closeBrowser();
		
		System.out.println("*************************");
		
		WebDriver obj2 = new Chrome();
		obj2.startBrowser();
		obj2.startApplication();
		obj2.closeBrowser();

	}
	public void startBrowser() {
		System.out.println("Start chrome browser");
	}
	
	public void closeBrowser() {
		System.out.println("Close chrome browser");
	}
	
	public void startApplication() {
		System.out.println("Start chrome Application");
	}
	
	public void savePassword() {
		System.out.println("Chrome can save password");
	}

	public void printPDF() {
		System.out.println("Chrome can print PDF");
	}

}
