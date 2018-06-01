package com.basic;

public class Sum {
	public static void main(String args[]) {
		double d=0.0;
		for(String s:args) {
			double d1=Double.parseDouble(s);
			d=d+d1;
		}
		System.out.printf("Sum of double values is:%.2f",d);
	}

}
