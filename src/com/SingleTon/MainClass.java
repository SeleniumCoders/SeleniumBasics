package com.SingleTon;

public class MainClass {
	
	public static void main(String[] args) {
		SingleTonClass obj = SingleTonClass.getObject();
		obj.display();
	}

}
