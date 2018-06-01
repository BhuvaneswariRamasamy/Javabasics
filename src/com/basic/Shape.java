package com.basic;

public class Shape {
	double side;
	double length;
	double breadth;
	public Shape(double side) {
		this.side=side;
	}
public Shape(double length,double breadth) {
	
	if((length>0.0&&length<20.0)&&(breadth>0.0&&breadth<20.0)) {
		this.length=length;
		this.breadth=breadth;
	}else {
		System.out.println("sorry The no too small");
	}
}
public double findRectangle() {
	return length*breadth;}
public double findPerimeter() {
		return (2*length+2*breadth);
	}

public static void main(String args[]) {

	Shape rectangle=new Shape(55,6);
	Shape perimeter=new Shape(4,6);
	System.out.println(rectangle.findRectangle());
	System.out.println(perimeter.findPerimeter());
	}
}

