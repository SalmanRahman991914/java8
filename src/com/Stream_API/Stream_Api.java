package com.Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Api {
public static void main(String[] args) {
	ArrayList<Integer>list=new ArrayList<>();
	list.add(10);
	list.add(11);
	list.add(12);
	list.add(13);
	list.add(14);
	list.add(16);
	//Stream<Integer> stream = list.stream();	
	//ArrayList<Integer>arrayList=(ArrayList<Integer>) stream.filter(i -> i % 2==0).collect(Collectors.toList());
    //System.out.println(arrayList);
List<Integer> newlist = list.stream().filter(i-> i%2==0).collect(Collectors.toList());
System.out.println(newlist);

List<Integer> newlist1 = list.stream().filter(i-> i>=12).collect(Collectors.toList());
System.out.println(newlist1);

}
}
