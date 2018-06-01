package com.basic;

public class Arr {
	public static  void main(String[] arg)
{
	int reverse[]=new int[10];
	 int N=1234,i=0;
	 while(N>0) {
		 int r=N%10;
		 N=N/10;
		 reverse[i]=r;
		 i++;
		 
	 }
	for( i=0;i<10;i++) {
		System.out.println(reverse[i]);
	}
}
}
