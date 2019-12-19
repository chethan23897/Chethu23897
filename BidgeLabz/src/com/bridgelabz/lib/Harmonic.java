package com.bridgelabz.lib;

import java.util.Scanner;

public class Harmonic {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	harmonic(n);
}
public static void harmonic(int n)
{
	double hsum=0;
	for(double i=1;i<=n;i++)
	{
		hsum=hsum+1/i;
	}
	System.out.println("Harmonic = "+hsum);
}
}
