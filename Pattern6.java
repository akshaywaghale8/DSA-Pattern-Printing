package com.akshu.patterns;

import java.util.Scanner;

/*
 * 		for n = 5
 * 			A
 * 			ABA
 * 			ABCBA
 *     		ABCDCBA
 *     		ABCDEDCBA
 * */

public class Pattern6 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number of N : ");
		Integer n = new Scanner(System.in).nextInt();
	
		for(int i=1; i<=n; i++ )
		{
			int k = 65;
			for(int j=1; j<=2*i-1; j++ )
			{
				if(j <= i)
				{
					System.out.print((char)(k++));
				}
				else {
					if(j==i+1) {
						k-=2;
						System.out.print((char)(k));
					}
					else {
						k--;
						System.out.print((char)(k));
					}
					
				}
			}
			System.out.println();
		}
		
		
	}

}
