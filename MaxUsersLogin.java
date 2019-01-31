package com.learning.problems;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaxUsersLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "user1, user4, user2, user1, user3, user1, user2, user3";
		String[] inputArray = input.split(",");
		int index =2;
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(String s: inputArray) {
			if(map.containsKey(s)) {
				int count= map.get(s);
				map.put(s, count+1);
			}else {
				map.put(s, 1);
			}
			
		}
		for(Entry<String,Integer> e:map.entrySet()) {
			if(e.getValue() >= index)
				System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
