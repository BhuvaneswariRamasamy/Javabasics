package com.basic;

public class labeled {
	public static void main(String ags[]) {
		int j,k;
	one:	for(j=0;j<5;j++) {
		two:	for(k=0;k<3;k++) {
				if(k==2) {
					continue one;
				}
//				if(k==3) {
//					continue two;
//				}
//				
			
		
		System.out.println("j= "+j+"k= "+k);
		}
		}
	}

}
