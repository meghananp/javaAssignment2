package com.stackroute;

import java.util.Scanner;

public class StudentGrade {
	
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of students:");
		String num = null;
		num =scan.nextLine();
		
		String[] marks=new String[Integer.parseInt(num)];
		
		System.out.println("Enter marks:");
		
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=scan.nextLine();
			isInteger(marks[i]);
		}
		
		StudentGrade grade=new StudentGrade();
		double avg=grade.average(marks);
		int min=grade.minimum(marks);
		int max=grade.maximum(marks);
		
		System.out.println(avg+" "+min+" "+max);
	}
	
	public double average(String arr[])
	{
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+Integer.parseInt(arr[i]);
		}
		
		int n=arr.length;
		
		double avg=sum/n;
		return avg;
		
	}
	
	public int minimum(String arr[])
	{
		int min=Integer.parseInt(arr[0]);
		
		for(int i=1;i<arr.length;i++)
		{
			if(Integer.parseInt(arr[i])<min)
			{
				min=Integer.parseInt(arr[i]);
			}
		}
		return min;
		
	}
	
	public int maximum(String arr[])
	{
		int max=Integer.parseInt(arr[0]);
		
		for(int i=1;i<arr.length;i++)
		{
			if(Integer.parseInt(arr[i])>max)
			{
				max=Integer.parseInt(arr[i]);
			}
		}
		return max;
		
	}
	
	   public static boolean isInteger(String s) {
		      boolean isValidInteger = false;
		      try
		      {
		         Integer.parseInt(s);
		 
		         // s is a valid integer
		 
		         isValidInteger = true;
		      }
		      catch (NumberFormatException ex)
		      {
		         // s is not an integer
		      }
		 
		      return isValidInteger;
		   }

}
