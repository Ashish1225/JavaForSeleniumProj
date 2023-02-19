package assignment2;

public class Trainer {
	
	String name;
	String department;
	String email;
	int id;
	
	public Trainer(String TrainerName,String TrainerDepartment, String TrainerEmail, int TrainerId) {
		name = TrainerName;
		department = TrainerDepartment;
		email = TrainerEmail;
		id = TrainerId;
	}

	public static void main(String[] args) {
		Trainer t1 = new Trainer("Mukesh","Testing","mukesh@gmail.com",1);
		Trainer t2 = new Trainer("Hitesh","Dev","hitesh@gmail.com",2);
		Trainer t3 = new Trainer("Ramesh","DevOps","ramesh@gmail.com",3);
		t1.displayInformation();
		t2.displayInformation();
		t3.displayInformation();
	}
	
	public void displayInformation() {
		System.out.println(name +", "+department +", "+email+", "+id);
		System.out.println(name +" can teach "+ department);
	}

}
