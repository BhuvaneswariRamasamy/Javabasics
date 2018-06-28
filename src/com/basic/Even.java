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

	boolean b=Even.isEven(8);
	System.out.println(b);
	
}
}
