package com.learning.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MapBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input is a map of books with unique book name and author.
		 * Result should map with key as author and value as list of books
		 */
		HashMap<String,String> map = new HashMap<String,String>();
		HashMap<String,List> finalMap = new HashMap<String,List>();
		map.put("Java","Sarat");
		map.put(".Net","Hema");
		map.put("Design Patterns","Sarat");
		map.put("Angular","Hema");
		finalMap = getMapWithListOfBooks(map);

	}
	static HashMap<String,List> getMapWithListOfBooks(HashMap<String,String> map){
		HashMap<String,List> finalMap = new HashMap<String,List>();
		Set<String> bookName = map.keySet();
		Iterator it = bookName.iterator();
		while(it.hasNext()) {
			String book = (String)it.next();
			if(map.containsKey(book)) {
				if(finalMap.containsKey(map.get(book))){
					List<String> tmp = finalMap.get(map.get(book));
					tmp.add(book);
					finalMap.put(map.get(book), tmp);
				}else {
					List<String> tmp = new ArrayList<String>();
					tmp.add(book);
					finalMap.put(map.get(book), tmp);
				}
			}
		}				
		
		return finalMap;
		
	}

}
