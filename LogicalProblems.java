package com.bridgelabz.LogicalProblems;

import java.util.Scanner;
public class LogicalProblems 
{
	public static void main(String[] args)
	{
		int n, r = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = sc.nextInt();  
		while (n != 0)   
		{  
		int remainder = n % 10;  
		r = r * 10 + remainder;  
		n = n / 10;  
		}  
		System.out.println("Reverse number is: " + r);  
		}  
		}  