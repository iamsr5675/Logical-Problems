package com.bridgelabz.LogicalProblems;

import java.util.Scanner;
public class LogicalProblems 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		  int i, n, m = 0, f = 0;      
		  System.out.println("Enter the number:");
		  n = sc.nextInt();
		  m = n / 2;      
		  if ( n == 0 || n == 1 )
		  {  
		   System.out.println(n+" is not Prime Number");      
		  }
		  else
		  {  
		   for(i=2;i<=m;i++)
		   {      
		    if(n%i==0)
		    {      
		     System.out.println(n+" is not Prime Number");      
		     f = 1;      
		     break;      
		    }      
		   }      
		   if (f == 0)  
		   {
			   System.out.println(n+" is Prime Number"); }  
		  }
		}    
		}   