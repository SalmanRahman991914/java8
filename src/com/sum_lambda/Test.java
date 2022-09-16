package com.sum_lambda;

public class Test {
public static void  main(String[] args) {
	SumInter i=(int a,int b)-> {
		return a+b;
	};
	System.out.println(i.sum(2, 4));
	System.out.println(i.sum(10,15));
}
}
