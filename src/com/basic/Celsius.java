package com.basic;

public class Celsius {
	Celsius(){
	 	
	}

	static double fahrenheit=10,celsius=15;
	public static double convert(double celsius) {
		celsius = 5.0 / 9.0 * ( fahrenheit - 32 ); 
		return celsius;
	}
	public static double convertToTop(double fahrenheit) {
		fahrenheit = 9.0 / 5.0 *( celsius + 32);
	return fahrenheit;
	}
	public static void main(String args[]) {
		Celsius c1=new Celsius();
		Celsius c2=new Celsius();
		c1.convert(celsius);
		c2.convertToTop(fahrenheit);
	System.out.println(c1.convert(celsius));
		System.out.println(c2.convertToTop(fahrenheit));
	}
}

