package com.Stream_API;
import java.util.List;
import java.util.stream.Collectors;


public class Stream_Methods {
public static void main(String[] args) {
	
	//filter mean(get the predicate)mean boolean value function
	
	
	//map(Function)mean each element operation
	
	List<String>name=List.of("Salman","Aman","Arkam","Arsalan","Atif");
	 List<String> newNames = name.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
System.out.println(newNames);

//using map

List<Integer>numbers=List.of(12,23,14,5,16);
List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
System.out.println(newNumbers);

//sorted method
numbers.stream().sorted().forEach(System.out::println);

//min numbers

Integer minNumbers = numbers.stream().min((x,y)->x.compareTo(y)).get();
System.out.println("min number is:"+minNumbers);

//max number
Integer maxNumbers = numbers.stream().max((x,y)->x.compareTo(y)).get();
System.out.println("max number is:"+maxNumbers);

}
}
