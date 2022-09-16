package com.Stream_API;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream_object {
public static void main(String[] args) {
	//Stream<Object>stream=Stream.empty();
	//System.out.println(stream);
	
	
	// 1.how to get Stream Object

	String name[]= {"salman","Aman","Arsalan","Arkam","Atif"};
	Stream<String> stream1 = Stream.of(name);
	stream1.forEach(e->{
		System.out.println(e);	
	});
	
	//2.get Stream Object (List, Set)
	
	
	ArrayList<Integer>list2=new ArrayList<>();
	list2.add(10);
	list2.add(11);
	list2.add(12);
	list2.add(13);
	list2.add(14);
	Stream<Integer> stream = list2.stream();
	stream.forEach(e->{
		System.out.println(e);
	});
}
}
