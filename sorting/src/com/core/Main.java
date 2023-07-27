package com.core;

public class Main {

	public static void main(String[] args) {
		int[] arr = {3,2,65,23,32,55,11,19};
		Sorting s1 = new Sorting();
		s1.quickSort(arr,0,arr.length-1);
		s1.printArr(arr);
		

	}

}
