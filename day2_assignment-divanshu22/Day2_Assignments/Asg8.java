package com;

class Asg8 {

	static void convertor(int []a)
	{
	int x=0;int y=0;
	int[][]num=new int[4][4];
	
	for(int i=0;i<10;i++)
	{
		num[x][y]=a[i];
		if (x==y)
		{
			x=x+1;
			y=0;
		}
		else 
		{
			y=y+1;
		}
	}
	System.out.println("Printing matrix : ");
      for(int p = 0; p < 4; p++)
      {
         for(int b = 0; b < 4; b++)
         {
            System.out.print(num[p][b] + "\t");
         }
         System.out.println();
      }
	
	}
	
}
