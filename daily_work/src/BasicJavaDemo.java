import java.util.Scanner;

public class BasicJavaDemo {
	
	public static void getDetails() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name=scanner.nextLine();
		
		System.out.println("Please enter the age: ");
		int age=scanner.nextInt();
		
		System.out.println("Hello!!!!" + " " +name +", your age is "+age);
	}
	
	public static void calculator() {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please enter first number: ");
		int f1=scanner.nextInt();
		
		System.out.println("Please enter second number: ");
		int f2=scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Please enter operation( + , - , * , /)");
		String operation=scanner.nextLine();
		
		switch (operation) {
		case "+":
			int add=f1+f2;
			break;
		case "-":
			int sub=f1-f2;
			break;
		case "*":
			int mul=f1*f2;
			break;
		case "/":
			int div=f1/f2;
		default:
			System.out.println("Wrong input");
		}
		
	}
	
	
	public static void main(String[] args) {
//		BasicJavaDemo.getDetails();
		BasicJavaDemo.calculator();
	}

}
