package com.basic;

public class PolyTest {
public static void main(String args[]) {
	PolyTest polytest=new PolyTest();
	Saree d1=new Saree();
	Chudii d2=new Chudii();
	Shirt d3=new Shirt();
	polytest.material(d1);
	polytest.material(d2);
	polytest.material(d3);
}
public void material(Dress dress) {
	dress.material();
}
}
