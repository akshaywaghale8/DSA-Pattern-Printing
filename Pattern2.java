package com.akshu.patterns;

import java.util.Scanner;

/*     for  n = 5 
 * 		* * * * *
 *      * * * *
 *      * * *
 *      * *
 *      * 
 * */

public class Pattern2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number of N : ");
		Integer n = new Scanner(System.in).nextInt();
		
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = n-i; j >= 1 ; j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}

}
