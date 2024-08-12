package com.akshu.patterns;

import java.util.Scanner;
/*
 *     for n = 5
 *     *********
 *      *     *
 *       *   *
 *        * *
 *         *
 * */


public class Pattern7 {
	public static void main(String[] args) {
		System.out.println("Enter the Number of N : ");
		Integer n = new Scanner(System.in).nextInt();
		
		for(int i=n ; i>=1; i-- )
		{
			if(i==n)
			{
				for(int j=1; j <= i*2-1; j++ )
				{
					System.out.print(" * ");
				}
			}
			else
			{
				for(int j=1; j<=n-i;j++)
				{
					System.out.print("   ");
				}
				System.out.print(" * ");
				for(int k=1; k<=2*i-3;k++)
				{
					System.out.print("   ");
				}
				if(i!=1) System.out.print(" * ");
			}
			System.out.println();
			
		}
		

	}

}
