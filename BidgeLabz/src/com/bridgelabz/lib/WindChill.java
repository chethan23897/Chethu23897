package com.bridgelabz.lib;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature");
		double t=sc.nextDouble();
		System.out.println("Enter the wind speed");
		double v=sc.nextDouble();
		if(t>50.0||v<3.0||v>120.0)
		{
			System.out.println("not Valid");
		}
		else
		{
			double w=35.74+0.6215*t*(0.4275*t-35.75)*Math.pow(v, 0.16);
			System.out.println("WindChill="+w);
			System.out.println("Temperature="+t);
			System.out.println("WindSpeed="+v);
		}
}
}
