package com.pr.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		
		Map<Object,Object> map=new HashMap<>();
		
		//insertion
		map.put("name", "Prabhat");
		map.put("num", 10);
		map.put(10, "Ten");
		
		/*//Iteration
		for(Map.Entry<Object, Object> m:map.entrySet())
		{
			System.out.println(m.getKey()+":"+m.getValue());
		}*/
		
		//iterator
		
		/*Iterator<Map.Entry<Object, Object>> itr=map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Object, Object> entry=itr.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}*/
		
		//for each
		map.forEach((k,v)->System.out.println(k+":"+v));
	}

}
