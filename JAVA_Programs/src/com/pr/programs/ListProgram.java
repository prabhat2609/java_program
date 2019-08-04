package com.pr.programs;

import java.util.ArrayList;

public class ListProgram {

	public static void main(String[] args) {
/*		List<Object> al=new ArrayList<>();
		
		//Insertion
		al.add(10);
		al.add("prabhat");
		al.add(20);
		al.add(10.5);
		
		//remove
		al.removeAll(al);
		
		
		List<Object> al2=new ArrayList<>();
		al2.addAll(al);
		al2.add(200);
		al2.add("Ranjan");
		
		//Iteration
		for(Object l:al2) {
			System.out.println("value : "+ l);
		}
		*/
//============= convert arraylist to array ==================
		/*ArrayList<Integer> ar=new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(15);
		ar.add(19);
		ar.add(20);
		ar.add(58);
		ar.add(35);
		ar.add(10);
		
		Integer[] num= ar.toArray(new Integer[ar.size()]);
		
		for(Integer i:num)
		{
			System.out.println(i);
		}
		
*/		
//========== program to check if element(value) exists in ArrayList? ==

		ArrayList<Object> archeck = new ArrayList<>();
		
		Object checkVal="Prabhat";
		archeck.add(10);
		archeck.add(20);
		archeck.add(15);
		archeck.add("prabhat");
		archeck.add("ranjan");
			if(archeck.contains(checkVal))
			{
				System.out.println("found");
			}
			else
				System.out.println("not found");
		
		
	}//main()

}
