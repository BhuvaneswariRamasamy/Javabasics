package com.basic;

import java .util.Scanner;
public class TwoMaxNumber {

    public static void main(String[] args) 

    {

        int n, max1,max2;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of elements in the array:");

        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements of array:");

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();

        }

        max1 = 0;
        max2= 0;
        for(int i = 0; i < n; i++)

        {

            if(max1 < a[i])

            {

            	max2=max1;
                max1= a[i];

            }

        }

        System.out.println("Maximum1 value:"+max1);
        System.out.println("Maximum2 value:"+max2);

    }
}