package list_framework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMaking {
	
	public static void main(String[] args) {
		
		List<String> linkedList=new LinkedList<>();
		
		linkedList.add("dewang");
		linkedList.add("mayank");
		linkedList.add("raju");
		linkedList.add("mohan");
		System.out.println(linkedList);
		
		for(String names:linkedList) {
			System.out.println(names);
		}
		
		linkedList.add(1, "saee");
		System.out.println(linkedList);
		
		linkedList.remove(2);
		System.out.println(linkedList);
		
		
		
		
	}
	

}
