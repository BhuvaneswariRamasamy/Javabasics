package com.basic;

import java.util.Arrays;

public class Class {

	public static void main(String args[]) {
		String b = "Technologies";
		String d = "Welcome john";
		System.out.println("wipro" + " " + b + " " + "bangalore");
		System.out.println(d);
		int e = 10;
		int g = 20;
		System.out.println(e + g);
		String s = "bhuvana";
		int id = 10;
		System.out.println("name:" + " " + "id:");
		System.out.print(s + " " + id);
		System.out.print("\n");
		String[] s1 = { "bhuvana", "kowsi", "gowri" };

		for (String s2 : s1) {
			System.out.print(s2);
			System.out.println(",");
		}
		int e1 = 10;
		do {
			System.out.println("The value is:" + e1);
			e1++;

		} while (e1 <= 20);
		System.out.println("The break Statement is:");
		for (int i = 0; i <= 5; i++) {
			if (i == 3)
				break;
			System.out.println(i);
		}
		System.out.println("The Continue Statement is:");
		for (int j = 0; j <= 5; j++) {
			if (j == 2)
				continue;
			System.out.println(j);
		}
		int g1 = -23;
		if (g1 >= 0) {
			System.out.println("The given number is positive");
		} else
			System.out.println("The given number is negative");
		int u = 0;
		if (u % 2 == 0) {
			System.out.println("The given number is even");
		} else {
			System.out.println("The given number is odd");
		}
		int[] a = { 7, 9, 6, 3, 2 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		char aa = 'A';
		{
			if ((aa >= 65 || aa <= 90)) {
				System.out.println("The character is Alphabet");
			} else if ((aa >= 96 || aa <= 122)) {
				System.out.println("The character is not a Alphabet");
			} else {
				System.out.println("The given number  is  a special character");
			}

		}
		String o = "bhuvana";
		System.out.println("UPPER :" + o.toUpperCase());

		String[] month = { "January", "Feburary", "March", "April", "May", "June", "July", "August", "September",
				"November", "December" };
		System.out.println(month[8]);
		for (int h = 23; h <= 54; h++) {
			System.out.println(h);
		}
		int g11 = 4, count = 0;
		for (int k = 2; k < g11; k++) {
			if (g11 % k == 0)
				count++;
		}
		if (count == 2) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}
}
