package com.Stream_API;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream {
public static void main(String[] args) {
//creating List
	List<Integer>list=List.of(12,3,2,13,42,22);
	
	
	System.out.println(list);
	
	
	ArrayList<Integer>list1=new ArrayList<>();
	list1.add(12);
	list1.add(13);
	list1.add(14);
	list1.add(15);
	Iterator<Integer>itr=list.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	ArrayList<Integer>list2=new ArrayList<>();
	list2.add(10);
	list2.add(11);
	list2.add(12);
	list2.add(13);
	list2.add(14);
	System.out.println(list2);
	System.out.println("printing even number");
	for(Integer i:list2) {
		if(i%2==0) {
			System.out.println(i);
			
		}
	}
	
	
}
}
