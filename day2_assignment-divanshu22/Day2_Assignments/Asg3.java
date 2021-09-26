package com;

public class Asg3 {
	
	public void add(int j)
	{
		int d,s=0;
		while (j>0)
		{
			d=j%10;
			s=s+d;
			j=j/10;
		}
		int length = String.valueOf(s).length();
		if (length>1)
		{
				add(s);
		}
		else
		{
			if (s>5)
			{
				System.out.println("FIRST");
			}
			else
			{
				System.out.println("SECOND");
			}
		}
		
		
	}

}
