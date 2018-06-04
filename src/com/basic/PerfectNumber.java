package com.basic;

public class PerfectNumber {
static int N,i,sum=0;
public static  boolean isNumber(int N) {
	for(i=1;i<6;i++) {
		if(N%i==0) {
			sum=sum+i;
			}
		}
		if(sum==N) {
			
			return true;
		}else {
return false;
		}
}
public static void main(String args[]) {
	PerfectNumber perfectnumber=new PerfectNumber();
	
	System.out.println(perfectnumber.isNumber(6));
}
}
