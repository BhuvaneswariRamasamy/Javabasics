package com.basic;

public class Factorial {
	public static void main(String args[]) {
int fact,i;
int  n=5;
if(n==0) {
	System.out.println("1");
}
fact=1;

for(i=1;i<=n;i++) {
	fact=fact*i;
}
System.out.println("Fact of n:"+fact);
}
}
