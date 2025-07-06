package list_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {
	
	public static ArrayList<Integer> reverse(ArrayList<Integer> arrayList){
		ArrayList<Integer> reversedList=new ArrayList<>();
		
		for(int i=arrayList.size()-1;i>=0;i--) {
			reversedList.add(arrayList.get(i));
//			System.out.println(arrayList);
		}
		return reversedList;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=scanner.nextInt();
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		for(int i=0;i<size;i++) {
			int val=scanner.nextInt();
			arrayList.add(val);
		}
		ArrayList<Integer> arrayList2=reverse(arrayList);
		System.out.println(arrayList2);
	}

}
