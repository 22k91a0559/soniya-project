package com.tnsif.scannerdemo;
public class Base {
	public void method1()
	{
		System.out.println("This is method1");
	}
}

class Base1 extends Base{
	public void method2()
	{
		System.out.println("This is method2");
	}
}
class Base2 extends Base1{
	public void method3()
	{
		System.out.println("This is method3");
	}
}
