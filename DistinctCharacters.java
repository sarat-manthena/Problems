package com.learning.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Geeks for Geeks";
		//String output = getDistinctCharacters(input);
		String output = getDistintUsingSet(input);
		System.out.println(output);

	}
	static String getDistinctCharacters(String input) {
		char[] inputArray = input.toCharArray();
		List<Character> finalList = new ArrayList();
		finalList.add(inputArray[0]);
		for(int i=1; i< inputArray.length; i++) {
			if(!finalList.contains(inputArray[i]))
				finalList.add(inputArray[i]);
			else
				finalList.remove((Character)inputArray[i]);
			
		}
		return finalList.toString();
	}
	
	//Using set
	static String getDistintUsingSet(String input) {
		Set<Character> set = new HashSet();
		String output="";
		for(Character c:input.toCharArray()) {
			set.add(c);
		}
		for(Character c: set) {
			output = output+c;
		}
		return output;
	}

}
