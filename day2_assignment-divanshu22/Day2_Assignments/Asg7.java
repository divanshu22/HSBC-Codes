package com;

public class Asg7 {

	static void SumDiagonal(int [][]mat,int n)
	{
		int p = 0;
		for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {

		if (i == j)
		p += mat[i][j];

		}
		}
		
		System.out.println("Diagonal Sum :"
		       + p);
		        
		}
}
