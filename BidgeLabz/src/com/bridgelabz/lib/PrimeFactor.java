package com.bridgelabz.lib;

import java.util.Scanner;

public class PrimeFactor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		primeFactor(n);
	}
	public static void primeFactor(int n)
	{
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{

				System.out.println(i);
				n=n/i;
			}
		}
		if(n>2)
		{
			System.out.println(n);
		}
	}
}
