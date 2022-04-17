package com.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Without Streams

public class Al {

	public static void main(String[] args) {
		/*
		 * List<Integer>li = new ArrayList<>(); for(int i=0;i<=10;i++) { li.add(i); }
		 * System.out.println(li);
		 * 
		 * List<Integer>l2 =new ArrayList<>(); for(Integer i :li) { if(i%2==0) {
		 * l2.add(i); } } System.out.println(l2);
		 */
	
	// With Streams
		
		List<Integer>l1 =new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			l1.add(i);
		}
	    List<Integer>l2=new ArrayList<>();
	    l2=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
	    System.out.println(l2);
	    
	    System.out.println("*********************************");
	    l1.stream().filter(i->i%2==0).forEach(System.out::println);
	    System.out.println("***************************");
	    l1.stream().forEach(System.out::println);
	    System.out.println("Sorting the elements:");
	    l1.stream().sorted().forEach(System.out::println);
	    System.out.println("Sorting the elments");
	    l1.stream().sorted((s1,s2)->s2.compareTo(s1)).forEach(System.out::println);
	    System.out.println("Max value is :");
	    Integer m= l1.stream().max((s1,s2)->s1.compareTo(s2)).get();
	    System.out.println(m);
	    System.out.println("Min value is:");
	    Integer n =l1.stream().min((s1,s2)->s1.compareTo(s2)).get();
	    System.out.println(n);
	    l1.stream().map(i->i+10).forEach(System.out::println);
	    long count = l1.stream().filter(i->i%2==0).count();
	    System.out.println(count);
	    System.out.println("**************************");
	    Integer[] ir=l1.stream().toArray(Integer[]::new);
	    for(Integer i:ir) {System.out.println(i);}
	    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	    Stream s=Stream.of(l1);
	    s.forEach(System.out::println);
	    
	
	}
}
