package com.bridgelabz.lib;

import java.util.Scanner;

public class Power2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	power(n);
}
public static void power(int n)
{
	for(int i=0;i<=n;i++)
	{
		int p=pow(2,i);
		System.out.println("2^"+i+" = "+p);
	}
}
public static int pow(int n,int p)
{
	int pw=1;
	while(p>0)
	{
		pw=pw*n;
		p--;
	}
	return pw;
}
}
