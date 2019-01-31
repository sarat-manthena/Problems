package com.learning.problems;

import java.util.HashMap;
import java.util.Map.Entry;

public class CompressingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] inputArray = {'a','a','b','b','c','c','c'};
		
		char[] outputArray = compressString(inputArray);
		printArray(outputArray);

	}
	
	static char[] compressString(char[] a) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0; i< a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else
				map.put(a[i], 1);
		}
		char[] outputArray = new char[map.size()*2];
		int index=0;
		for(Entry e:map.entrySet()) {
			outputArray[index] = (char)e.getKey();
			outputArray[index+1] = e.getValue().toString().charAt(0);
			index = index+2;
		}
		return outputArray;
	}
	
	static void printArray(char[] a) {
		for(int i=0; i< a.length; i++) {
			System.out.print(String.valueOf(a[i])+',');
		}
	}

}
