package com.java.collections;

import java.util.Comparator;
import java.util.Hashtable;
import java.util.Set;

public class Al3 {
public static void main(String[] args) {
	
	Hashtable<Emp,String>hm=new Hashtable<Emp,String>();
	hm.put(new Emp(101 ,"pavan"), "PAVAN");
	hm.put(new Emp(102 ,"kumar"), "KUMAR");
	hm.put(new Emp(103 ,"kanna"), "KANNA");
	hm.put(new Emp(104 ,"kalyan"), "KALYAN");
	hm.put(new Emp(105 ,"chinna"), "CHINNA");
	System.out.println(" Adding Duplicate Elements ");
	hm.put(new Emp(105 ,"chinna"), "CHINNA");
	
	Set<Emp>keys=hm.keySet();
	for(Emp E:keys) {System.out.println(E.getId()+"------->"+E.getName());}
	
	Comparator<Emp> comp=(e1,e2)->{
		if(e1.getId()<e2.getId()) {return 1;}else {return -1;}
	};
	System.out.println("Sorting the elemnts");
	hm.keySet().stream().sorted(comp).forEach(System.out::println);
	
	
	



}
	
	
}
