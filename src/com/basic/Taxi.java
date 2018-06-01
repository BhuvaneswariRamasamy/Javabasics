package com.basic;

public class Taxi extends Car{
	public Taxi() {
		
		System.out.println("taxi");
	}
	public Taxi(int i) {
		this();
		System.out.println("taxi cab");
	}
//	public Taxi(int i) {
//		System.out.println("taxi cab");
//	}
public static void main(String args[]) {
	Taxi taxi=new Taxi(5);
}
}
