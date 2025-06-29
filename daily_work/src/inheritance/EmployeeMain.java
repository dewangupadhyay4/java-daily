package inheritance;

public class EmployeeMain extends Employee{
	
	@Override
	public void salary() {
		System.out.println("this is salary method from main class");
	}
	
	
	public static void main(String[] args) {
		
		EmployeeMain employeeMain=new EmployeeMain();
		Employee employee=new Employee();
		
		employeeMain.salary();
		employeeMain.noticePeriod();
		
		employee.salary();
		employee.noticePeriod();
		
		
	}

}
