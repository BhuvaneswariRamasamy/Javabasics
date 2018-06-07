package com.basic;

public class Array {
	public void reverse() {
		int i;
		int arr[]= {3,4,5,2,33,24,2};
		for(i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
}

public static void main(String args[]) {

	 Array s1=new Array();
	 s1.reverse();
	
	
	}
}