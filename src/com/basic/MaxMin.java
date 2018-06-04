package com.basic;

public class MaxMin {
 static int a[]= {3,4,5,2,33,24,2,768} ;

public  static int largest() {
	int i;
	int max=a[0];
	for(i=1;i<a.length;i++)
	{
		if(a[i]>max) {
			max=a[i];
		}
	}
	return max;

}
public  static int smallest() {
	int i;
	int min=a[0];
	for(i=1;i<a.length;i++)
	{
		if(a[i]<min) {
			min=a[i];
		}
	}
	return min;

}
public static void main(String args[]) {

	System.out.print(largest());
	System.out.print(smallest());
	
}
}
