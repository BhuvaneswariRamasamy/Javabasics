package com.basic;

public class FibonacciSeries {
public static void main(String args[]) {
	int n1=0,n2=1,n3,count=10,i;

	for(i=2;i<=10;i++) {
		n3=n1+n2;
    System.out.print( n1+" " );   
		n1=n2;
		n2=n3;
	}
	 
}
}
