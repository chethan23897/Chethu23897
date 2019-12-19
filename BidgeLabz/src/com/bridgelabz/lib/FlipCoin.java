package com.bridgelabz.lib;

import java.util.Scanner;

public class FlipCoin {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of flips");
	int n=sc.nextInt();
	flip(n);
}
public static void flip(int n)
{
	int h=0;
	int t=0;
	for(int i=1;i<=n;i++)
	{
		double rand=Math.random();
		if(rand<0.5)
		{
			h++;
		}else
		{
			t++;
		}
	}
	double hperc=0;
	hperc=h*100/n;
	double tperc=0;
	tperc=100-hperc;
	System.out.println("Heads :"+h);
	System.out.println("Head Percentage: "+hperc);
	System.out.println("Tails :"+t);
	System.out.println("Tail Percentage :"+tperc);
}
}
