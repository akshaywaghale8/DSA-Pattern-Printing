package com.akshu.patterns;

import java.util.Scanner;
/*
 * 		  for n=5
 * 			*********
 * 			 *******
 * 			  *****
 * 			   ***
 * 				*
 * 				*
 * 			   ***
 *            *****
 *           *******
 *          *********
 * */

public class Pattern9 
{
	public static void main(String[] args) {
		System.out.println("Enter the Number of N : ");
		Integer n = new Scanner(System.in).nextInt();
		
		for(int i=1 ; i<=2*n; i++)
		{
			if(i<=n) 
			{
				for(int j=1; j<i;j++)
				{
					System.out.print("   ");
				}
				for(int k=n*2-1;k>=2*i-1;k--)
				{
					System.out.print(" * ");
				}
			}
			else 
			{
				for(int j=1; j<=(2*n)-i; j++)
				{
					System.out.print("   ");
				}
				for(int k=1;k<=2*(i-n)-1;k++)
				{
					System.out.print(" * ");
				}
			}
			System.out.println();
				
		}
		
		
		
	}

}
