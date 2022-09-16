package com.Thread_create;

public class ThreadDemo {
public static void main(String[] args) {
	
	//First Thread- JOHN
Runnable rannable=()->{ //this is body of thread

	for(int i=1;i<=10;i++) {
		System.out.println("value of i:" +i);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
};
Thread t=new Thread(rannable);
t.setName("Salman");
t.start();
}
}
