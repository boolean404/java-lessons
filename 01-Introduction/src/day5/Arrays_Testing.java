package day5;

import java.util.Arrays;

public class Arrays_Testing {
	public static void main(String[] args) {

		int [] arr1 = {100,200,20,50,79};
		
		// copy 
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("Arr2 : " + Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOf(arr1, 1);
		System.out.println();
	}
}
