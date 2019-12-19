package com.bridgelabz.lib;

import java.util.Scanner;

public class StringReplace {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str="Hello username,How are you?";
	System.out.println("Enter the username");
	String u=sc.next();
	String p=replace(str,u);
	System.out.println("------Old string-----");
	System.out.println(str);
	System.out.println("-----Replaced String------");
	System.out.println(p);
}
public static String replace(String str,String u)
{
	
	str=str.replace("username", u);
	return str;
}
}
