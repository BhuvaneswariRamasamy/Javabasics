package com.basic;

import java.util.Arrays;

public class Anagram {
	
	  

static void isAnagram(String str1, String str2) {  
    String s1 = str1.replaceAll("\\s", "");  
    String s2 = str2.replaceAll("\\s", "");  
    boolean status = true;  
    if (str1.length() != str2.length()) {  
        status = false;  
    } else {  
    	char[] a1=s1.toLowerCase().toCharArray();
    	char[] a2=s2.toLowerCase().toCharArray();
    	Arrays.sort(a1);
    	Arrays.sort(a2);
    	status=Arrays.equals(a1, a2);
    }
    if (status) {  
        System.out.println(" anagrams ");  
    } else {  
        System.out.println(" not a anagrams ");  
    }
}  

public static void main(String[] args) {  
    isAnagram("keep","peak");  
}
}