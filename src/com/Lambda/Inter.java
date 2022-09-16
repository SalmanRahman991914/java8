package com.Lambda;

public class Inter  {
	public static void main(String[] args) {
		System.out.println("my system start");
		
		
		//using your interface with the help of lambda
		MyInter1 i=()->{
			System.out.println("this is first lambdaa");
		};
		
		i.say();
		
		MyInter1 i2=()->{
			System.out.println("i am using second time lambda");
		};
		i2.say();
	}

}
