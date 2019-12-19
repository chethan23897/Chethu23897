package com.bridgelabz.lib;

import java.util.Scanner;

public class Leap {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int n=sc.nextInt();
		if(n>=1582)
		{
			if(n%4==00&&n%100!=0)
			{
				System.out.println("Leap");
			}
			else
			{


				if(n%400==0)

					System.out.println("Leap year");

				else

					System.out.println("NOt Leap year");



			}
		}
	}
}
