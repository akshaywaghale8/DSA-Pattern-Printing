package com.akshu.patterns;

import java.util.Scanner;

/*       for n = 5
 * 	          1
 *	         21
 *          321
 *         4321
 *        54321 
 * */
public class Pattern3 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Number of N : ");
		Integer n = new Scanner(System.in).nextInt();
		
		for(int i = 1; i <= n ; i++)
		{
			//To print the Spaces
			for(int j = n-i; j >= 0 ; j--)
			{
				System.out.print("   ");
			}
			
			//to print the Numbers 
			for(int k = i; k >= 1 ; k--)
			{
				System.out.print(" "+k+" ");
			}
			System.out.println();
		}
	}

}
