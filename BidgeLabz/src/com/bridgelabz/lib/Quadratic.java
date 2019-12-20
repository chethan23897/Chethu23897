package com.bridgelabz.lib;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a");
		double a=sc.nextDouble();
		System.out.println("Enter the value for b");
		double b=sc.nextDouble();
		System.out.println("Enetr the value for c");
		double c=sc.nextDouble();
		
		double root1=0,root2=0;
		
		double delta=b*b-4*a*c;
		double sqrt=sqrt(delta);
		if(delta>0)
		{
			root1=(-b+sqrt)/(2*a);
			root2=(-b-sqrt)/(2*a);
			System.out.println("Roots are:"+root1+" and "+root2);
		}else if(delta==0)
		{
			System.out.println("Root="+(-b+sqrt)/(2*a));
		}
		
		
}
	public static double sqrt(double n)
	{
		double t;
		double s=n/2;
		do {
			t=s;
			s=(t+(n/t))/2;
			
		}while(t-s!=0);
		return s;
	}
}
