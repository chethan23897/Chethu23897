package com.bridgelabz.lib;

import java.util.Scanner;

public class Euclidean {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		double x=sc.nextDouble();
		System.out.println("Enter the value for b");
		double y=sc.nextDouble();
		dist(x,y);
		
		
	}
	public static void dist(double x,double y)
	{
		double dist=0;
		double x1=Math.pow(x, 2);
		double y1=Math.pow(y, 2);
		dist=sqrt(x1+y1);
		System.out.println("Distance="+dist);
		
}
	public static double sqrt(double n)
	{
		double t;
		double s=n/2;
		do {
			t=s;
			s=(t+(n/t))/2;
		}while((t-s)!=0);
		return s;
	}
}
