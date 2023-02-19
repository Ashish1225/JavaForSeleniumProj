package assignment2;

public class Trainer2 {
	
	String name;
	String department;
	String email;
	int id;
	
	public Trainer2(String TrainerName,String TrainerDepartment, String TrainerEmail, int TrainerId) {
		name = TrainerName;
		department = TrainerDepartment;
		email = TrainerEmail;
		id = TrainerId;
	}

	public static void main(String[] args) {
		 
		Trainer2 t1 = new Trainer2("Mukesh","Testing","mukesh@gmail.com",1);
		Trainer2 t2 = new Trainer2("Hitesh","Dev","hitesh@gmail.com",2);
		Trainer2 t3 = new Trainer2("Ramesh","DevOps","ramesh@gmail.com",3);
		
		Trainer2 [] obj1 = {t1,t2,t3};
		System.out.println(obj1.length);
		
		obj1[0].displayInformation();
		obj1[1].displayInformation();
		obj1[2].displayInformation();
		
		
//		Trainer2[] arr = new Trainer2[3];
//		arr[0] = new Trainer2("Mukesh","Testing","mukesh@gmail.com",1);
//		arr[1] = new Trainer2("Hitesh","Dev","hitesh@gmail.com",2);
//		arr[2] = new Trainer2("Ramesh","DevOps","ramesh@gmail.com",3);
//		arr[0].displayInformation();
//		arr[1].displayInformation();
//		arr[2].displayInformation();
		
	}
	
	public void displayInformation() {
		System.out.println(name +", "+department +", "+email+", "+id);
	}

}
