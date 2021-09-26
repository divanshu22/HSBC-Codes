package com;

public class Asg2 {

	void power(int n)
	{
		System.out.println("FOR LOOP METHOD = ");
		for(int i=0;i<=10;i++)
		{
			System.out.println(Math.pow(n, i));
		}
		System.out.println("WHILE LOOP METHOD = ");
		int i = 0;
		while(i!=11)
		{
			System.out.println(Math.pow(n, i));
			i++;
			
		}
		System.out.println("DO WHILE LOOP METHOD = ");
		int j = 0;
		do {
			System.out.println(Math.pow(n, j));
			j++;
		}while(j<=10);
	}
	
	
}
