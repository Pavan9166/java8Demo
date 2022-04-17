package com.java.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Al2 {
	public static void main(String[] args) {
		List<Emp> l1 = new ArrayList<>();
		
		l1.add(new Emp(101,"Pavan"));
		l1.add(new Emp(102,"Kumar"));
		l1.add(new Emp(103,"Kalyan"));
		l1.add(new Emp(104,"Kanna"));
		l1.add(new Emp(105,"Chinna"));
		l1.add(new Emp(106,"Thammudu"));
		
		for(Emp e:l1) {System.out.println("Id value is"+e.getId()+"Name is"+e.getName());}
	    System.out.println("Sorted values is ");
	    Comparator<Emp> comp =(e1,e2)->{if(e1.getId()<e2.getId()) {return 1;}else{return -1;}};
	    l1.stream().sorted(comp).forEach(System.out::println);
		
	}
}
