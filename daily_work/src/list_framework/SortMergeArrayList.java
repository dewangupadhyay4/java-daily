package list_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class SortMergeArrayList {
	
	public static ArrayList<Integer> merging(ArrayList<Integer> list1, ArrayList<Integer> list2){

		ArrayList<Integer> arraylist3=new ArrayList<>();
		
//			for(int i=0;i<list1.size();i++) {
//					arraylist3.add(list1.get(i));
//					arraylist3.add(list2.get(i));
//			}
//		
////		System.out.println(arraylist3);
		
		int i=0,j=0;
		while(i < list1.size() && j<list2.size()) {
			if(list1.get(i) <= list2.get(j)){
				arraylist3.add(list1.get(i));
				i++;
			}
			else {
				arraylist3.add(list2.get(j));
				j++;
			}
		}
		
		while(i<list1.size()) {
			arraylist3.add(i);
			i++;
		}
		while(j<list2.size()) {
			arraylist3.add(j);
			j++;
		}
		
	return arraylist3;
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> arraylist1=new ArrayList<>();
		ArrayList<Integer> arraylist2=new ArrayList<>();
		
		arraylist1.add(23);
		arraylist1.add(25);
		arraylist1.add(26);
		arraylist1.add(27);
		
		arraylist2.add(34);
		arraylist2.add(35);
		arraylist2.add(38);
		arraylist2.add(39);
		
		ArrayList<Integer> merged=merging(arraylist1, arraylist2);
		System.out.println(merged);
		}
}

