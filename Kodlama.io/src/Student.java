
public class Student extends User{
	String studentNumber;
	String department;
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, String studentNumber,String department) {
		super(id, firstName, lastName);
		this.studentNumber = studentNumber;
		this.department = department;
	}
	

	}


	
	
	

