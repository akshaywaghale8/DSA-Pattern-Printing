package com.akshu.patterns;

import java.util.Scanner;

/*
 * 		for n = 3
 * 			*
 *         ***
 *        *****  
 * */
public class Pattern4 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number of N : ");
		Integer n = new Scanner(System.in).nextInt();
		
		for(int i = 1; i<=n; i++)
		{
			//For loop to print the spaces
			for(int j = n-i; j >= 1 ; j-- )
			{
				System.out.print("   ");
			}
			
			// for LOOP to print star patter
				for(int k = 1 ; k <= (2*i-1); k++)
				{
					System.out.print(" * ");
				}
				System.out.println();
		}
		
	}
}
