package com.learning.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {3,5,6};
		int[] a2 = {8,2,4,6};
		int[] output = mergeArray(a1,a2);
		printArray(output);

	}
	static int[] mergeArray(int[] a1, int[] a2) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a1.length;i++)
			set.add(a1[i]);
		for(int j=0;j<a2.length;j++)
			set.add(a2[j]);
		
		int[] retArray = new int[set.size()];
		Iterator<Integer> it = set.iterator();
		int i=0;
		while(it.hasNext()) {
			retArray[i] = it.next();
			i++;
		}
		Arrays.sort(retArray);
		return retArray;
	}
	static void printArray(int[] a) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);
		
		System.out.println();
	}

}
