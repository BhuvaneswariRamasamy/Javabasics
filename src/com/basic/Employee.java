package com.basic;

public class Employee {
String firstname;
String lastname;
double monthlysalary;
Employee()
{
	
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public double getMonthlysalary() {
	return monthlysalary;
}
public void setMonthlysalary(double monthlysalary) {
	 this.monthlysalary = monthlysalary;
}



public static void main(String args[]) {
	Employee e1=new Employee();
    e1.setFirstname("Raja");
	e1.setLastname("mani");
	e1.setMonthlysalary(1000);
	Employee e2=new Employee();
	System.out.println(e1.getFirstname());
	System.out.println(e1.getLastname());
	e2.setFirstname("bhuvana");
	e2.setLastname("ramasamy");
	e2.setMonthlysalary(34000.34);
    System.out.println(e2.getFirstname());
	System.out.println(e2.getLastname());

	
	
}
}
