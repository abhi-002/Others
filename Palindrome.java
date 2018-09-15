package org.others;

import java.util.Scanner;

public class Palindrom 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n = sc.nextInt();
		sc.close();
		
		int m = n,r,res=0;
		while(n > 0)
		{
			r = n % 10;
			res = (res*10) + r;
			n = n / 10;
		}
		if(res == m)
			System.out.println("Palindrom");
		else
			System.out.println("Not Palindrome");
	}

}
