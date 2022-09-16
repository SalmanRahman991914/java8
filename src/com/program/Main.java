package com.program;



public class Main {
public static void main(String[] args) {
	System.out.println("project start.....");
MyInter i=new MyInter() {
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("this is first anonymous class");
	}
};

MyInter i2=new MyInter() {
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("this is second anonymous class");
	}
};
i2.sayHello();
i.sayHello();

}
}
