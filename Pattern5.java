package com.akshu.patterns;

import java.util.Scanner;

/*
 *       for n = 3 
 *           *
 *          ***
 *         *****
 *          ***
 *           *
 * */
public class Pattern5 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number of N : ");
		Integer n = new Scanner(System.in).nextInt();
		
		int max =2*n-1;
		
		for(int i=1; i<=n*2-1; i++)
		{
			if(i<=n) 
			{
				for(int j=n-i; j>=1; j--)
				{
					System.out.print("   ");
				}
				for(int k=1; k<=2*i-1; k++ )
				{
					System.out.print(" * ");
				}
				System.out.println();
			}
			else
			{
				max =  max - 2;
				for(int j=i-n; j>=1; j--)
				{
					System.out.print("   ");
				}
				for(int k = max ; k>=1; k-- )
				{
					System.out.print(" * ");
				}
				
				System.out.println();
			}
		}
		
	}
}
