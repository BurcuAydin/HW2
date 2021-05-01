
public class Main {

	public static void main(String[] args) {
		//User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)

		Student student1 = new Student(1,"Burcu","Aydın","123456","ceng");
		Student student2 = new Student(2,"Engin","Demiroğ","456789","ceng");
		Student student3 = new Student(3,"Billie","Eilish","321654","ceng");
		System.out.println(student1.getEmail() + " " + student1.department);
		System.out.println(student2.getEmail()+ " " + student2.department);
		System.out.println(student3.getEmail() + " " + student3.department);
		
		Instructor instructor1 = new Instructor(4,"Lady","Gaga","3554698");
		
		UserManager usermanager = new UserManager();
		usermanager.add(student3);
		usermanager.add(instructor1);
		System.out.println("-------------------");
		User[] users = {student1,student2,student3,instructor1};
		usermanager.addMultiple(users);
	}

}
