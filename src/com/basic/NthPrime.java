package com.basic;

public class NthPrime {
public static void main(String args[]) {
	   int num, count, i,N=10;
	    num=1;
	    count=0;
	 
	    while (count < N){
	      num=num+1;
	      for (i = 2; i <= num; i++){
	        if (num % i == 0) {
	          break;
	        }
	      }
	      if ( i == num){
	        count = count+1;
	      }
	    }
	    System.out.println("Value of nth prime: " + num);
}
}