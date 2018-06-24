package com.basic;

public class UniqueDigits {
public static void main(String args[]) {
	int arr[]=new int[10];
	int num=123123;
	int r=0;int count=0;
	 while(num!=0) {
    	r=num%10;
    	arr[r]=1;
    	num=num/10;
    }
    for(int i=0;i<10;i++) {
    	count=count+arr[i];
     }
 System.out.println(count);
}
}
