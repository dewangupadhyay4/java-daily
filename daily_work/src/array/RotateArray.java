package array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
	
	public static void rotate(int[] arr, int k) {
		//[12,34,56,78,35,43]
		int n=arr.length;
		k= k % n;
		//[]
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
	}
	
	public static void reverse(int[] arr, int start, int end) {
		
		while(start<end) {
		int temp=arr[start];
		arr[start++]=arr[end];
		arr[end--]=temp;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=scanner.nextInt();
		
		int[] array=new int[size];
		System.out.println("Enter the values one by one: ");
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the steps: ");
		int steps=scanner.nextInt();
		
		rotate(array, steps);
		System.out.println("Rotated array is: "+Arrays.toString(array));
	}

}
