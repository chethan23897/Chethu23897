package com.bridgelabz.lib;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int c=coupon(n);
		System.out.println(c);
	}
	public static int getCoupon(int n) {
		//Random rn=new Random();
		return (int) (Math.random() * n);
	}
	public static int coupon(int n)
	{
		int c=0,i=0;
		boolean a[]=new boolean[n];

		while(i<n)
		{
			int rd=getCoupon(n);
			System.out.print(rd+" ");
			c++;
			if (!a[rd]) { 

				a[rd] = true;
				i++;
			}
		}

		return c;


	}
}

