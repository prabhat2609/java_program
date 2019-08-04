package com.pr.programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args) {
		
		Set<Object> set=new LinkedHashSet<>();
		
		//addition
		set.add("Prabhat");
		set.add("Prabhat");
		set.add(10);
		set.add(20.5);
		
		List<Object> al=new ArrayList<>();
		
		//Insertion
		al.add(10);
		al.add("Ranjan");
		al.add(20);
		al.add(10.5);
		
		set.addAll(al);
		
		/*//iteration
		for(Object s:set) 
		{
			System.out.println("value : "+s);
		}*/
		
		//foreach
		set.forEach((v)->System.out.println(v));
		

	}

}
