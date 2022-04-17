package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iter1 {

	public static void main(String[] args) {
		List<String>li =new ArrayList<String>();
		String remELt="Kumar";
		li.add("Pavan");
		li.add("Kumar");
		li.add("Kanna");
		li.add("chinna");
		
		Iterator<String>itr =li.iterator();
		System.out.println("Iterating the value of list:");
		while(itr.hasNext()) {
			
			if(remELt.equals(itr.next()))
			itr.remove();
		}
		System.out.println("After removing the elt in the list is");
		System.out.println(li);
	}
	
	
}
