package com.bridgelabz.lib;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		int c[][]=read();
		disp(c);
	}
	public static int[][] read(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows and columns");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter the"+" "+m*n+" "+"array elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;

	}
	public static void disp(int a[][])
	{
		PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
		System.out.println("Entered array elements are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				pw.print(a[i][j]+" ");
			}
			pw.println(" ");
		}

	}
}
