package encapsulation;
import encapsulation.Student;

public class StudentMain {
	
	
	public static void main(String[] args) {
		Student student=new Student();
		student.SetId(001);
		student.setName("dewang");
		student.setAge(22);
		
		System.out.println("Id of student is "+student.getId());
		System.out.println("Name of student is "+student.getName());
		System.out.println("Age of student is "+student.getAge());
	}

}
