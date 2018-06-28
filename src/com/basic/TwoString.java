package com.basic;

public class TwoString {
public static void main(String args[]) {
	int a[]= {45,23,-12,-34,-562,-45};
	int m1=0,m2=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]<0) {
			if(a[i]>m1) {
				m2=m1;
				m1=a[i];
			}
		}if(a[i]>0) {
		if(a[i]>m1) {
		m2=m1;
		m1=a[i];
	}
		}
		else if (a[i]>m2) {
			m2=a[i];
		}

}

	System.out.println(m1);
	System.out.println(m2);
	

}
}
