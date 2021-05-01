
public class User {
	 int id;
	 String firstName;
	 String lastName;
	private String email;
	
	public User() {
		
	}

	public User(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	public String getEmail() {
		return firstName.substring(0, 1) + lastName.substring(0, 1) + "@abc.com";
	}

	
	
	
}
