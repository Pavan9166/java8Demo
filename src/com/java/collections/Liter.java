package com.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Liter {
public static void main(String[] args) {
	List<String>li =new ArrayList<String>();
	li.add("Pavan");
	li.add("kumar");
	List<String>l2=li.stream().collect(Collectors.toList());
	System.out.println(l2);
    li.stream().forEach(System.out::println);
}
}
