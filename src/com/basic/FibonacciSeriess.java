package com.basic;

public class FibonacciSeriess {
public static void main(String args[]) {
	int n1=0,n2=1,n3,count=10,i;

	for(i=0;i<count;i++) {
		n3=n1+n2;
    System.out.print( n1+" " );   
		n1=n2;
		n2=n3;
	}
	 
}
}
