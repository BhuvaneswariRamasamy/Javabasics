package com.basic;

public class Even {
public static boolean isEven (int one) {
	if(one%2==0) {
		return true;
	}else {
		return false;
	}
}
public static void main(String args[]) {
	Even e1=new Even();
	boolean e=e1.isEven(7);
	System.out.println(e);
	
}
}
