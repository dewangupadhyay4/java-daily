package String;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=scanner.nextLine();
		
		reversing(str);
	}
	
	public static String reversing(String string) {
		String reversed="";
		
		for(int i=string.length()-1;i>=0;i--) {
			reversed=reversed+string.charAt(i);
		}
		System.out.println("Reversed String is "+reversed);
		return reversed;
	}

}
