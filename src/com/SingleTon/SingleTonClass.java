package com.SingleTon;

public class SingleTonClass {
	
	private static SingleTonClass obj = new SingleTonClass();
	
	private SingleTonClass(){}
	
	
	public static SingleTonClass getObject()
	{
		return obj;
	}
	
	public void display()
	{
		System.out.println("Hello");
	}

}
