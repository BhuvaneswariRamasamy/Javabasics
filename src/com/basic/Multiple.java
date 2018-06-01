package com.basic;

public class Multiple {
	
public  boolean isMultiple(int one,int two) {
	if(two%one==0) {
		return true;
	}
	else {
		return false;
	}
}
public static void main(String args[]) {
	Multiple m1=new Multiple();
	boolean b=m1.isMultiple(6,5);
	System.out.println(b);
	
}

}

