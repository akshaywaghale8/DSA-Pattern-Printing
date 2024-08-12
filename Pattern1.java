package com.akshu.patterns;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number of N : ");
		
		Integer n = new Scanner(System.in).nextInt();
		 if(n%2==0) n = n - 1;
		for(int i = 1 ; i <= n/2+1 ; i++)
		{	
			for(int j = n/2+1 - i  ; j >= 1  ; j--)
			{
				System.out.print("   ");
			}
			for(int k=1 ; k<=2*i-1 ; k++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		

	}

}
