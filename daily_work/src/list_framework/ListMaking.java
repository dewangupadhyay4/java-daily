package list_framework;

import java.util.ArrayList;
import java.util.List;

public class ListMaking {
	
	public static void main(String[] args) {
		
		List<String> makingList=new ArrayList<>();
		
		makingList.add("dewang");
		makingList.add("mayank");
		makingList.add("ankit");
		makingList.add("shaan");
		
		System.out.println(makingList);
		
//		System.out.println("People are "+makingList);
//		
//		for(String names:makingList) {
//			System.out.println("people are:" +names);
//		}
//		
//		System.out.println(makingList.get(0));
//		
//		System.out.println(makingList.indexOf("mayank"));
//		
//		System.out.println(makingList.size());
//		
//		System.out.println(makingList.remove(0));
//		System.out.println(makingList);
//		
//		System.out.println(makingList.remove("ankit"));
//		System.out.println(makingList);
//		
//		makingList.add(2, "laptop");
//		System.out.println(makingList);
//		
//		makingList.add("phone");
//		System.out.println(makingList);
		
		for(int i=0;i<makingList.size();i++) {
			System.out.println(makingList.get(i));
		}
		
		
	}
}
