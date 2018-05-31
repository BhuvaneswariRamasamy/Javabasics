package com.basic;

public class Time {
	int hour;
	 int minute;
	 int second;
	 public Time()
	 {
		 
	 }
	 public Time(int hour,int minute,int second) {
		 this.hour=hour;
		 this.minute=minute;
		 this.second=second;
	 }

	


	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void displayTime() {
		System.out.println(hour+":"+minute+":"+second);
	}
	public static void main(String args[]) {
		Time d1=new Time();
				d1.setHour(2);
	            d1.setMinute(50);
	            d1.setSecond(35);
	            d1.displayTime();
	}

	}
