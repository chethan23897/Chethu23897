package com.bridgelabz.lib;

import java.util.Scanner;

public class Gambler {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stakes");
		int s=sc.nextInt();
		System.out.println("Enter the goal");
		int g=sc.nextInt();
		System.out.println("Enter the trails");
		int t=sc.nextInt();
		gamb(s,g,t);

	}		

	public static void gamb(int s,int g,int t)
	{
		int b=0;
		int w=0;
		for(int i=1;i<=t;i++)
		{
			while(s>0&&s<g)
			{
				b++;
				if(Math.random()<0.5)
				{
					s++;
				}
				else
				{
					s--;
				}
			}
			if(s==g)
			{
				w++;
			}
		}
		System.out.println("Wins="+w);
		int perc=(w/t)*100;
		int avg=b/t;
		System.out.println("Percent="+perc);
		System.out.println("Avg="+avg);
	}
}