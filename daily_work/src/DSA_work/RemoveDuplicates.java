package DSA_work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> remove(ArrayList<Integer> arr) {
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		
		for(Integer nums: arr) {
			if(!arrayList.contains(nums)) {
				arrayList.add(nums);
			}
		}
		
		return arrayList;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size=scanner.nextInt();
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		
		System.out.println("Enter the values one by one: ");
		for(int i=0; i<size;i++) {
			int val=scanner.nextInt();
			arrayList.add(val);
		}
		
		ArrayList<Integer> arra=remove(arrayList);
		System.out.println(arra);
		
	}

}
