package com.stackroute;

import java.util.Scanner;

public class PowerOfFour {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		
		PowerOfFour pw=new PowerOfFour();
		boolean x;
		x=pw.checkForPowerOfFour(input);
		System.out.println(x);
		scan.close();
	}
	
	public boolean checkForPowerOfFour(String d1)
	{
		String num1=d1;
		double num=Double.parseDouble(num1);
		
		if(num==0)
		{
			return false;
		}
		
		while(num!=1)
		{
			if(num%4!=0)
				return false;
			num=num/4;
			
		}
		return true;
		
	}
}
