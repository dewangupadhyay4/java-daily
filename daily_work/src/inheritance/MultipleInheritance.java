package inheritance;

class Multiple extends Employee{
	
	@Override
	public void salary() {
		
		System.out.println("this salary method is from multiple class");
	}
	
}

public class MultipleInheritance extends Multiple{
	
	
	public static void main(String[] args) {
		
		MultipleInheritance multipleInheritance=new MultipleInheritance();
		
		multipleInheritance.salary();
		
	}

}
