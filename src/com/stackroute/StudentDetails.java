package com.stackroute;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetails {
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int num=0;
		num =scan.nextInt();
		
		Student[] student=new Student[num];
		
		int[] marks=new int[num];
		int grade1=0;
		for(int i=0;i<num;i++)
		{
			student[i]=new Student();
			System.out.println("Enter the marks:");
			grade1=scan.nextInt();
			System.out.println(grade1);
			student[i].setGrade(grade1);
			marks[i]=student[i].getGrade();
			grade1=0;
		}
	
		scan.close();
		
		
	}
	
	public int average(int arr[])
	{
		return 0;
		
	}

}
