package com.bridgelabz.lib;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		String finish=new String();
		Scanner sc=new Scanner(System.in);
		boolean started=true;
		StopWatch stopWatch=new StopWatch();
		long time=0;
		long lastStart=System.currentTimeMillis();
		do{

				if(started){
					System.out.println("press N to stop");
					 finish=sc.next();
					if(finish.equals("N")){
						time=System.currentTimeMillis()-lastStart;
						System.out.println("Time is:"+(time/1000)+" Second");
						started=false;
					}
				}
				else{
					System.out.println("press Y to start");
					 finish=sc.next();
					if(finish.equals("Y")){
						lastStart=System.currentTimeMillis();
						started=true;
					}
					
				}
				System.out.println("Press C to continue");
				 finish=sc.next();
			
		}while(true);
	}
}

