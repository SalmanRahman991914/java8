package com.program;

public class MyInterImpl implements MyInter {
    
	@Override
	public void sayHello() {
		System.out.println(" i am saying from myInterImpl");
		MyInter myInter = new MyInterImpl();
        myInter.sayHello();
        }

}
