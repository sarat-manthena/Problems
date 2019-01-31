package com.learning.problems;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,5,9,10,15,20};
		int[] arr2 = {2,3,8,13};
		mergeArrays(arr1,arr2);
		printArray(arr1);
		printArray(arr2);

	}
	static void mergeArrays(int[] arr1,int[] arr2) {
		for(int i=arr2.length-1; i>=0; i--) {
			for(int j=0; j<arr1.length;j++) {
				if(arr2[i] < arr1[j]) {
					int tmp = arr1[j];
					arr1[j] = arr2[i];
					arr2[i] = tmp;
					
				}
			}
		}
	}
	static void printArray(int[] a) {
		for(int element:a) {
			System.out.print(element+",");
		}
		System.out.println();
	}

}
