
public class Instructor extends User {
	 String phoneNumber;

	public Instructor() {
		
	}

	public Instructor(int id, String firstName, String lastName,String phoneNumber) {
		super(id, firstName, lastName);
		this.phoneNumber = phoneNumber;
	}


	
	
}
