package stack;

import java.util.Stack;

public class StackDemo {
	
	
	public static void main(String[] args) {
		Stack<String> stackObj=new Stack<>();
//		stackObj.add("hello");
//		stackObj.add("this");
//		stackObj.add("is");
//		stackObj.add("dewang");
//		System.out.println(stackObj);
		
		stackObj.push("hello");
		stackObj.push("this");
		stackObj.push("is");
		stackObj.push("dewang");
		System.out.println(stackObj);
		
		
	}

}
