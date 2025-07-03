package DSA_work;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {
	
	public static void find(int[] arr) {
		
		if(arr.length<2) {
			System.out.println("No valid number of elements in this array");
		}
		
		Arrays.sort(arr);
		int largest=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]<largest) {
			System.out.println("Second largest element is "+arr[i]);
			return;
			}
		}

		
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size=scanner.nextInt();
		
		int array[]=new int[size];
		
		System.out.println("Enter the elements one by one: ");
		for(int i=0;i<array.length;i++) {
			 array[i]=scanner.nextInt();
		}
		
		SecondLargestElement.find(array);
	}

}
